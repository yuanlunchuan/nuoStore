var NstGradeObject = {
  path: 'http://127.0.0.1:8080/spring1/',
  websocket: null,
  onWebSocketOpen: function(event){
    var self = NstGradeObject;
		console.log("WebSocket:已连接");
		console.log(event);
  },
  onRecieveMessage: function(event){
    console.info("have receive a message-----event: "+JSON.stringify(event));
  },
  onWebSocketError: function(event){
    console.info("--------hava met a error: "+JSON.stringify(event));
  },
  onWebSocketClose: function(event){
		console.log("WebSocket:已关闭");
  },
  sendMsg: function(data){
  	var self = NstGradeObject;
  	self.websocket.send(JSON.stringify(data));
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
    console.info("-----------uuid: "+uid);
		self.websocket.onopen = self.onopen;
		self.websocket.onmessage = self.onRecieveMessage;
		self.websocket.onerror = self.onWebSocketError;
		self.websocket.onclose = self.onWebSocketClose;
  }
};

$(function(){
	console.info("------------");
	NstGradeObject.initialize();
});
