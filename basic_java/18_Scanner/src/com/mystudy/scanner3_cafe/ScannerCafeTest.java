package com.mystudy.scanner3_cafe;

public class ScannerCafeTest {

	public static void main(String[] args) {
		System.out.println("=== main() 시작 =====");
		System.out.println("AMERICANO : " + ScannerCafe.AMERICANO);
		ScannerCafe cafe = new ScannerCafe();
		
		cafe.openCafe();
		
		System.out.println("===== main() 끝 =========");
	}

}
