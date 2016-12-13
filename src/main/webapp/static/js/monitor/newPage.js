var NewPageObject = {
		path: "http://localhost:8080/spring1/monitor/create",

	initialize: function(){
		var self = NewPageObject;
		$('#sendButton').click(function(){
	　　 $.post(self.path,
	　　 {uid: $('#uid').val(),
	　　  text: $('#monitorMessage').val()
	    	}, 
	    	function (text, status) {
	    		console.info(text);
	    });
		});
	}	
};

$(function(){
	NewPageObject.initialize();	
});
