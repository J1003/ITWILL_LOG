package com.mystudy.socket03_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SSAMver_TCPClientEcho {
	public static void main(String[] args) {
		//(실습) 클라이언트 : 쓰기, 읽기
		// 서버접속 후 메시지를 1번 보내고, - PrintWriter
		// 서버에서 보내온 메시지를 받기 - BufferedReader
		// PrintWriter <-- OutputStream
		// BufferedReader <-- InputStreamReader <-- InputStream
		//-----------------------------
		//(추가) 보내는 메시지를 Scanner를 사용, 화면에서 직접 입력하여 처리
		//-----------------------
		System.out.println(">>> 클라이언트 시작~~~");
		Socket socket = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		
		try {
			socket = new Socket("localhost", 10000);
			System.out.println(">> 서버 접속 성공!!!");
			
			// 서버쪽으로 쓰고, 읽기 위한 객체 만들기
			pw = new PrintWriter(socket.getOutputStream());
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//Scanner 사용해서 보낼 메시지 화면에서 입력처리
			Scanner scan = new Scanner(System.in);
			
			// 쓰기 --------------
			System.out.print("전송 메시지 입력 : ");
			String msg = scan.nextLine();
			pw.println(msg);
			pw.flush(); //버퍼에 있는 데이터를 강제로 출력(사용)
			//System.out.println("보낸메시지> " + msg);
			
			// 읽기 --------------
			msg = br.readLine();
			System.out.println("받은메시지> " + msg);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) pw.close();
			try {
				if (br != null) br.close();
			} catch (IOException e) {}
			try {
				if (socket != null) socket.close();
			} catch (IOException e) {}
		}
		
		System.out.println(">>> 클라이언트 종료");
	}

}
