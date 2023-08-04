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
            server = new ServerSocket(10000);
            System.out.println("서버/IP : " + InetAddress.getLocalHost());
            System.out.println(">> 서버(ServerSocket) 대기중~");

            Socket socket = server.accept();
            System.out.println(">> 클라이언트 접속됨 : " + socket);

            OutputStream os = socket.getOutputStream();
            InputStream is = socket.getInputStream();

            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            PrintWriter pw = new PrintWriter(os);

            // Send a welcome message to the client immediately after accepting the connection
            String welcomeMsg = "서버에 접속되었습니다!";
            pw.println(welcomeMsg);
            pw.flush();

            String msg;
            while ((msg = br.readLine()) != null) {
                System.out.println("클라이언트: " + msg);
                pw.println("서버가 받았습니다: " + msg);
                pw.flush();
            }

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