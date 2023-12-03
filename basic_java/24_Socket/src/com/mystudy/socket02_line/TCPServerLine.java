package com.mystudy.socket02_line;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerLine {

	public static void main(String[] args) {
		// 서버쪽 : 클라이언트가 보내온 메세지를 1번 읽어서 화면 출력
		// BufferedReader 사용해서 라인단위 읽기(1번 읽기)
		// BufferedReader <-- InputStreamReader <-- InputStream 
		// >> 인풋스트림을 다이렉트로 버퍼스트림에 넣을 수 없다.
		// ---------------------------------------
		System.out.println(">> 서버 시작 -----");
		ServerSocket server = null;
		
		try {
			// 1. ServerSocket 객체생성 - 서비스할 포트번호(port) 지정
			server = new ServerSocket(10000);
			System.out.println("서버/IP : " + InetAddress.getLocalHost());
			System.out.println(">> 서버(ServerSocket) 대기중~");
			
			// 2. 서버소켓 대기중 접속한 Socket과 통신할 수 있는 Socket 객체 생성
			Socket socket = server.accept();
			System.out.println(">> 클라이언트 접속됨 : " + socket);
			
			// 3. Socket으로부터 Inputstream, OutputStream 객체 생성
			OutputStream os = socket.getOutputStream();
			
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			// 4. 받을 메세지가 있으면 읽기
			String msg = br.readLine(); // 한 줄 단위 읽기
			System.out.println("[서버-받은메세지]" + msg);
			
			// 5. 보낼 메세지가 있으면 보내기 (쓰기)
			// 구현 안 함
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (server != null) {
					server.close();
					System.out.println("close / ServerSocket close 완료");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(">>> 서버 종료");
	}

}
