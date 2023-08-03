package com.mystudy.url;

import java.net.MalformedURLException;
import java.net.URL;

public class URL_Exam {

	public static void main(String[] args) throws MalformedURLException {
		// 프로토콜://호스트(서버):포트번호/경로(패스)?질의(query)
		// https://sports.news.naver.com/news?oid=311&aid=0001623503
		
		URL url = new URL("http", "mystudy.com", 8080,
					"/aaa/bbb/index.jsp?id=hong&password=1234#content");
		//http://mystudy.com:8080/aaa/bbb/index.jsp?id=hong&password=1234#content
		System.out.println("url : " + url);
		
		String protocol = url.getProtocol(); //protocol - 약속(통신규약)
		String host = url.getHost();
		int port = url.getPort();
		int defaultPort = url.getDefaultPort();
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();
		
		
		System.out.println("프로토콜(protocol) : " + protocol);
		System.out.println("호스트(host) : " + host);
		System.out.println("포트번호(port) : " + port);
		System.out.println("기본포트(defaultPort) : " + defaultPort);
		System.out.println("경로-패스(defaultPort) : " + defaultPort);
		System.out.println("쿼리-질문(query) : " + query);
		System.out.println("참조(reference) : " + ref);
		
		System.out.println("------------");
		url = new URL("https://blog.naver.com/tbtgmltn97/223096872685");
		
		protocol = url.getProtocol();
		host = url.getHost();
		port = url.getPort();
		defaultPort = url.getDefaultPort();
		path = url.getPath();
		query = url.getQuery();
		ref = url.getRef();
		
		
		System.out.println("프로토콜(protocol) : " + protocol);
		System.out.println("호스트(host) : " + host);
		System.out.println("포트번호(port) : " + port);
		System.out.println("기본포트(defaultPort) : " + defaultPort);
		System.out.println("경로-패스(defaultPort) : " + defaultPort);
		System.out.println("쿼리-질문(query) : " + query);
		System.out.println("참조(reference) : " + ref);
		
		
	
	}

}
