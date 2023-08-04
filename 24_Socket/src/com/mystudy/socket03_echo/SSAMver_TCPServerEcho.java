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

public class SSAMver_TCPServerEcho {
	public static void main(String[] args) {
		//(실습)서버쪽 : 읽고, 쓰기 
		// 클라이언트가 보내온 메시지를 1번 받고(읽기) - BufferedReader
		// 받은 메시지를 클라이언트에게 다시 보내기 - PrintWriter
		// BufferedReader <-- InputStreamReader <-- InputStream
		// PrintWriter <-- OutputStream
		//--------------------------------
		ServerSocket server = null;
		
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
			//InputStream in = socket.getInputStream();
			//InputStreamReader isr = new InputStreamReader(in);
			//BufferedReader br = new BufferedReader(isr);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("::메시지 읽기~");
			String msg = br.readLine();
			System.out.println("받은메시지> " + msg);
			
			//----------
			// 받은 메시지를 클라이언트 쪽으로 다시 보내기
			//OutputStream out = socket.getOutputStream();
			//PrintWriter pw = new PrintWriter(out);
			
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.println(msg);
			System.out.println("보낸메시지> " + msg);
			
			pw.flush(); // 버퍼에 있는 데이터 출력(전송)
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}








