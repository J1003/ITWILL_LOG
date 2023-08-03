package com.mystudy.socket03_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEcho {

	public static void main(String[] args) {
		
		// (실습) 서버쪽 : 읽고, 쓰기
		// 클라이언트가 보내온 메세지를 1번 받고(읽기) - BufferedReader
		// 받은 메세지를 클라이언트에게 다시 보내기 - PrintWriter
		// BufferedReader <-- InputStreamReader <-- InputStream
		// PrintWriter <--- OutputStream
		// -----------------------------------------
		
		ServerSocket server = null;
		
		
		try {
			// 1. ServerSocket 객체생성 - 서비스할 포트번호(port) 지정
			server = new ServerSocket(10000);
			System.out.println("서버/IP : " + InetAddress.getLocalHost());
			System.out.println(">> 서버(ServerSocket) 대기중~");
			
			Socket socket = server.accept();
			System.out.println(">> 클라이언트 접속됨 : " + socket);
			
			// 2. 서버소켓 대기중 접속한 Socket과 통신할 수 있는 Socket 객체 생성
			OutputStream os = socket.getOutputStream();
			InputStream is = socket.getInputStream();
			
			// 3. Socket으로부터 Inputstream, OutputStream 객체 생성
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			PrintWriter pw = new PrintWriter(os);
			
			// 4. 받을 메세지가 있으면 읽기
			String msg = br.readLine();
			System.out.println(msg);
			
			// 5. 보낼 메세지가 있으면 보내기 (쓰기)
			msg = "메롱!";
			pw.println(msg);
			pw.flush();
			
			pw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
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