package com.mystudy.socket04_echo_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEchoWhile {
	public static void main(String[] args) {
		//(실습)서버쪽 : 읽고, 쓰기 
		// 클라이언트가 보내온 메시지를 1번 받고(읽기) - BufferedReader
		// 받은 메시지를 클라이언트에게 다시 보내기 - PrintWriter
		// BufferedReader <-- InputStreamReader <-- InputStream
		// PrintWriter <-- OutputStream
		//--------------------------------
		ServerSocket server = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		
		try {
			server = new ServerSocket(10000);
			System.out.println(">> 서버시작~~~ 접속대기중~~");
			System.out.println(">> IP주소:포트번호 - "
					+ InetAddress.getLocalHost().getHostAddress()
					+ ":" + server.getLocalPort());
			
			Socket socket = server.accept();
			System.out.println(">> 클라이언트 접속됨");
			System.out.println(":: 접속정보 : " + socket.getInetAddress());
			
			// 데이터를 받고, 받은 데이터 돌려주기(읽고, 쓰기)			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
			System.out.println("::메시지 읽기~");
			
			while (true) {
				String msg = br.readLine();
				if (msg == null) {
					System.out.println(":: 연결이 끊겨서 중단합니다.");
					break;
				}
				if ("exit".equals(msg)) {
					System.out.println("::: 중단요청에 의해서 종료합니다.");
					break;
				}
				System.out.println("받은메시지> " + msg);
				
				//----------
				// 받은 메시지를 클라이언트 쪽으로 다시 보내기
				pw.println(msg);
				System.out.println("보낸메시지> " + msg);
				pw.flush(); // 버퍼에 있는 데이터 출력(전송)
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
				System.out.println("close> PrintWriter");
			}
			try {
				if (br != null) {
					br.close();
					System.out.println("close> BufferedReader");
				}
			} catch (IOException e) {}
			try {
				if (server != null) {
					server.close();
					System.out.println("close> ServerSocket");
				}
			} catch (IOException e) {}
		}
		System.out.println(":::: 서버종료---------------");
	}

}