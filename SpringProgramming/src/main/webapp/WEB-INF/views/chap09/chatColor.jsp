<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Apache Tomcat WebSocket Examples: Echo</title>
	    <style type="text/css">
	    	body {
				font-size: small;
				color:white;
			}
			#connect-container {
	            float: left;
	            width: 400px
	        }
	
	        #connect-container div {
	            padding: 5px;
	        }
	
	        #console-container {
	            float: left;
	            margin-left: 15px;
	            width: 400px;
	        }
	
	        #console {
	            border: 1px solid #CCCCCC;
	            border-right-color: #999999;
	            border-bottom-color: #999999;
	            height: 170px;
	            overflow-y: scroll;
	            padding: 5px;
	            width: 100%;
	        }
	
	        #console p {
	            padding: 0;
	            margin: 0;
	        }
		</style>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.11.3.min.js"></script>
	    <script type="text/javascript">
	    	var ws = null;
	 		function connect() {
	 			ws = new WebSocket("ws://"+window.location.host+"/SpringProgramming/chatcolor-ws");
	 			ws.onopen=function(){
	 				log("접속이 되엇슴당ㅋ");
	 				setConnected(true);
	 			};
	 			
	 			ws.onclose=function(){
	 				log("접속이 끊어졋슴당ㅋ");
	 				setConnected(false);
	 			};
	 			
	 			ws.onmessage=function(event){
	 				var strJson=event.data;
	 				var json=JSON.parse(strJson);
	 				var command=json.command;
	 				var data=json.data;
	 				if(command=="diplay"){
	 					display(data);
	 				}
	 			}
	 		}
	 		
	 		function disconnect(){
	 			if(ws!=null){
	 				ws.close();
	 				ws=null;
	 			}
	 		}
	 		
	 		function display(data){
	 			var fontColor=data.fontColor;
	 			var message=data.message;
	 			log(message, fontColor);
	 		}
	 		
	 		function send(){
	 			var chatName=$("#chatName").val();
	 			if(chatName==""){
	 				alert("채팅명을 입력해 주세용 ㅋ");
	 				return;
	 			}
	 			
	 			var fontColor=$("#fontColor").val();
	 			
	 			var message=$("#message").val();
	 			if(message==""){
	 				alert("메시지를 입력해주삼");
	 				return;
	 			}
	 			
	 			var json={
	 					"command":"broadcast",
	 					"data":{
	 						"chatName":chatName,
	 						"fontColor":fontColor,
	 						"message":message
	 					}
	 			};
	 			
	 			var strJson=JSON.stringify(json);
	 			ws.send(strJson);
	 			
	 		}

	 		function setConnected(connected){
	 			if(connected){
	 				$("#connect").attr("disabled","disabled");
	 				$("#disconnect").removeAttr("disabled");
	 				$("#btnSend").removeAttr("disabled");
	 			}else{
	 				$("#connect").removeAttr("disabled");
	 				$("#disconnect").attr("disabled","disabled");
	 				$("#btnSend").attr("disabled","disabled");
	 			}
	 		}

	 		function log(message, color){
	 			$("#console").append("<span style='display:block;color:"+color+";'>"+message+"</span>");
	 			if($("#console span").length>20){
	 				$("#console span").first().remove();
	 			}
	 			$("#console").scrollTop($("#console").height());
	 		}
	 		
		</script>
	</head>
	<body>
	    <div id="connect-container">
	        <div>
	            <button id="connect" onclick="connect();">Connect</button>
	            <!-- disabled이란놈을 없애야 버튼이 활성화가 됨 -->
	            <button id="disconnect" disabled="disabled" onclick="disconnect();">Disconnect</button>
	        </div>
	        
	        <div>
	        	채팅명:<input id="chatName" type="text"/>	<br/>
	        	글색상:<input id="fontColor" type="color"/>	
	        </div>
	        <div>
	            <textarea id="message" style="width: 350px">Here is a message!</textarea>
	        </div>
	        <div>
	            <button id="btnSend" onclick="send();" disabled="disabled">Send message</button>
	        </div>
	    </div>
	    <div id="console-container">
	        <div id="console"/>
	    </div>
	</body>
</html>