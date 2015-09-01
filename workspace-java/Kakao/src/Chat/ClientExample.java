package Chat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class ClientExample extends Application {
	Socket socket;
	
	void startClient(){
		Thread thread=new Thread(){
			@Override
			public void run(){
				try{
					socket=new Socket();
					socket.connect(new InetSocketAddress("localhost", 5001));
					Platform.runLater(()->{
						displayText("[연결 완료: "+socket.getRemoteSocketAddress()+"]");
						btnConn.setText("stop");
						btnSend.setDisable(false);
					});
				}catch(Exception e){
					Platform.runLater(()->displayText("[서버 통신 안됨]"));
					if(!socket.isClosed()){stopClient();} return;
				}
				receive();
			}
		};
		thread.start();
	}
	
		
	void stopClient(){
		try{
			Platform.runLater(()->{
				displayText("[연결 끊음]");
				btnConn.setText("start");
				btnSend.setDisable(true);
			});
			if(socket!=null && !socket.isClosed()){
				socket.close();
			}
		}catch(IOException e){}
	}
	
	void receive(){
		while(true){
			try{
				byte[] byteArr=new byte[100];
				InputStream inputstream=socket.getInputStream();
				int readByteCount=inputstream.read(byteArr);
				
				if(readByteCount==-1){throw new IOException();}
				
				String data=new String(byteArr, 0, readByteCount, "EUC-KR");
				
				Platform.runLater(()->displayText("[받기 완료] "+ data));
			} catch(Exception e){
				Platform.runLater(()->displayText("[서버 통신 안됨]"));
				stopClient();
				break;
			}
		}
	}
	
	void send(String data){
		Thread thread=new Thread(){
			@Override
			public void run(){
				try{
					byte[] byteArr=data.getBytes("EUC-KR");
					OutputStream outputStream = socket.getOutputStream();
					outputStream.write(byteArr);
					outputStream.flush();
					Platform.runLater(()->displayText("[보내기 완료]"));
				} catch(Exception e){
					Platform.runLater(()->displayText("[서버 통신 완료]"));
					stopClient();
				}
			}
		};
		thread.start();
	}
	
	TextArea txtDisplay;
	TextField txtInput;
	Button btnConn, btnSend;
	
	
	public void start(Stage primaryStage) throws Exception{
		BorderPane root=new BorderPane();
		root.setPrefSize(500, 300);
		
		txtDisplay=new TextArea();
		txtDisplay.setEditable(false);
		BorderPane.setMargin(txtDisplay, new Insets(0,0,2,0));
		root.setCenter(txtDisplay);
			
		BorderPane bottom=new BorderPane();
		txtInput = new TextField();
		txtInput.setPrefSize(60, 30);
		BorderPane.setMargin(txtInput, new Insets(0,1,1,1));
		
		btnConn=new Button("start");
		btnConn.setPrefSize(60, 30);
			
		btnConn.setOnAction(e->{
			if(btnConn.getText().equals("start")){
				startClient();
			} else if(btnConn.getText().equals("stop")){
				stopClient();
			}
		});
		
		btnSend=new Button("send");
		btnSend.setPrefSize(60, 30);
		btnSend.setDisable(true);
		btnSend.setOnAction(e->send(txtInput.getText()));
		
		bottom.setCenter(txtInput);
		bottom.setLeft(btnConn);
		bottom.setRight(btnSend);
		
		root.setBottom(bottom);
			
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Client");
		primaryStage.setOnCloseRequest(event->stopClient());
		primaryStage.show();	
	}

	void displayText(String text){
		txtDisplay.appendText(text+"\n");
	}
	public static void main(String[] args) {
		launch(args);
	}

}
