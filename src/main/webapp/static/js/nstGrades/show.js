var NstGradeObject = {
  path: 'localhost:8080/spring1',
  websocket: null,

  onWebSocketOpen: function(event){
    var self = NstGradeObject;
		console.log("WebSocket:已连接");
		console.log(event);
  },
  
  onRecieveMessage: function(event){
  	$('#webSocketMessage').append(new Date()+'接收到的胎心数据为： '+event.data+'<br>');
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
	
	onStartFetalMonitorButtonClicked: function(){
		var self = NstGradeObject;

		$.post('http://'+self.path+'/nstGrades/create',
		{
			uid: $('#user-id').data('user-id') },
				function (text, status) {
					console.info(text);
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
		$('#startFetalMonitor').on('click', self.onStartFetalMonitorButtonClicked);
  }
};

$(function(){
	NstGradeObject.initialize();
});
