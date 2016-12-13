var NstGradeObject = {
  path: '127.0.0.1:8080/spring1',
  websocket: null,

  onWebSocketOpen: function(event){
    var self = NstGradeObject;
		console.log("WebSocket:已连接");
		console.log(event);
  },
  
  onRecieveMessage: function(event){
  	$('#webSocketMessage').append(JSON.parse(event.data).date+'------'+JSON.parse(event.data).text+'<br>');
  },

  onWebSocketError: function(event){
    console.info("--------hava met a error: "+JSON.stringify(event));
  },

  onWebSocketClose: function(event){
		console.log("WebSocket:已关闭");
  },

  sendMsg: function(data){
  	var self = NstGradeObject;
  	console.info('消息已经发出： '+JSON.stringify(data));
  	self.websocket.send(JSON.stringify(data));
	},

	onSendMessageButtonClicked: function(event){
		var self = NstGradeObject;
		self.sendMsg({
			text: $('#message').val()
		});
	},
	
  initialize: function(){
    var self = NstGradeObject;
    var uid = $('#user-id').data('user-id');

    if ('WebSocket' in window) {
      self.websocket = new WebSocket("ws://" + self.path + "/ws?uid="+uid);
    } else if ('MozWebSocket' in window) {
      self.websocket = new MozWebSocket("ws://" + self.path + "/ws"+uid);
    } else {
      self.websocket = new SockJS("http://" + self.path + "/ws/sockjs"+uid);
    }
		self.websocket.onopen = self.onopen;
		self.websocket.onmessage = self.onRecieveMessage;
		self.websocket.onerror = self.onWebSocketError;
		self.websocket.onclose = self.onWebSocketClose;
		
		$('#sendMessage').on('click', self.onSendMessageButtonClicked);
  }
};

$(function(){
	NstGradeObject.initialize();
});
