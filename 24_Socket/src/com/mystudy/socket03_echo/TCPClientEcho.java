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
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClientEcho {

	public static void main(String[] args) throws UnknownHostException {
		// (실습) 클라이언트 : 읽고, 쓰기
		// 클라이언트 : 쓰기, 읽기
		// 서버접속 후 메세지를 1번 보내고, - PrintWriter
		// 서버에서 보내온 메세지를 받기 - BufferedReader
		// PrintWriter <--- OutputStream         
		// BufferedReader <-- InputStreamReader <-- InputStream
		// ------------------- 서버랑 순서가 반대!
		// (추가) 보내는 메세지를 Scanner 글 사용, 화면에서 직접 입력하여 처리
		// -------------------
		System.out.println("!!! 클라이언트 시작 !!!");
        Scanner scanner = new Scanner(System.in);

        Socket socket = null;
        BufferedReader br = null;
        PrintWriter pw = null;

        System.out.println("현재 컴퓨터 IP: " + InetAddress.getLocalHost());
        System.out.println(">> 서버 접속 시도~");

        try {
            socket = new Socket("localhost", 10000);
            System.out.println(">> 서버 접속 성공!");

            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
            pw = new PrintWriter(os, true); // Use true to autoflush the PrintWriter
            br = new BufferedReader(new InputStreamReader(is));

            // Start the while loop for continuous communication
            while (true) {
                System.out.print("나 : ");
                String msg = scanner.nextLine();
                if (msg.equalsIgnoreCase("exit")) {
                    // If the user enters "exit", terminate the loop and close the connection
                    break;
                }

                pw.println(msg);

                // Read the response from the server line by line
                String response;
                while ((response = br.readLine()) != null) {
                    System.out.println("서버 응답: " + response);
                    break; // Exit the inner loop after reading one line of response
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null) {
                    socket.close();
                    System.out.println(">> 서버와의 연결 종료!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(">>>> 클라이언트 종료~~");
    }
}