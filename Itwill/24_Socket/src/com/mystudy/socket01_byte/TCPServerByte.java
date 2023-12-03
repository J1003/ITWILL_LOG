package com.mystudy.socket01_byte;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class TCPServerByte {

	public static void main(String[] args) {
		// 서버측 : ServerSocket 객체가 클라이언트 접속을 기다린다.
		ServerSocket server = null;
		
		try {
			// 서버에서 10000번 포트를 사용해서 포트를 열고 서비스를 한다.
			server = new ServerSocket(10000);
			System.out.println("현재컴퓨터IP(로컬PC) : " + InetAddress.getLocalHost());
			System.out.println("[서버] 시작 후 클라이언트의 접속 대기중 ~");
			
			// 서버에서 해당 포트로 접속한 클라이언트와 통신할 수 있는 소켓 생성 
			// accept()를 사용하면 '대기상태'가 됨.
			Socket socket = server.accept(); // 접속대기
			System.out.println("[서버] 1개 클라이언트 접속 : " + socket); //클라이언트가 접속을 해야 실행 된다.
			
			InputStream is = socket.getInputStream(); //읽어들일 수 있는 InputStream 타입을 받을 수 있다.
			OutputStream os = socket.getOutputStream(); 
			
			// InputStream 사용해서 클라이언트에서 보낸 데이터를 읽고, 화면에 표시
			//int readValue = is.read();
			//System.out.println("[서버] 클라이언트로부터 받은 메세지 " + (char) readValue);
			
			
			byte[] buf = new byte[100];
			is.read(buf); 
			// byte 계열에 담겨있는 것들 출력해봐야 숫자밖에 없다.
			System.out.println("buf : " + Arrays.toString(buf));
			System.out.println("[서버] 받은 메세지 : " + new String(buf));
			
			os.close();
			is.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(">> 서버종료");
	}

}
