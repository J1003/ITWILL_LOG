package com.mystudy.socket01_byte;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientByte {

	public static void main(String[] args) {
		// 클라이언트 : Socket 이용해서 서버에 접속(서버IP주소, 포트번호)
		Socket socket = null;
		try {
			System.out.println("==== 클라이언트 ====");
			// 					  IP주소, 	포트번호 
			//socket = new Socket("127.0.0.1", 10000);
			socket = new Socket("localhost", 10000);
			System.out.println(">> 서버연결 성공 socket : " + socket);
			
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			// OutputStream 이용해서 서버쪽으로 쓰기(출력)
//			System.out.println(">> 서버쪽으로 문자 하나 출력 'A' 보내기 ~");
//			os.write('A'); // 문자 하나만 출력
			
			String msg = "안녕하세요! 반값습니다!";
			System.out.println("서버로 보낸 메세지 : " + msg);
			byte[] buf = msg.getBytes();
			os.write(buf);  // 바이트 계열로 출력
			
			os.close();
			is.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(">> 클라이언트 종료");
	}

}
