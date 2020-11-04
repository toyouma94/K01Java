package ex05method;

import java.util.Scanner;

public class QuTemperature {

	static void temperF(double seop) {
		
		double fOndo=1.8*seop+32;
		System.out.println("변환 완료(화씨): "+fOndo+"F˚");
	}
	
	static void temperC(double hwa) {
		
		double COndo=(hwa-32)/1.8;
		System.out.print("변환 완료(섭씨): "+COndo+"C˚");
		return;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		System.out.print("화씨 온도로 변환할 섭씨 온도를 입력하세요:");
		double seop= scanner.nextInt();
		temperF(seop);
		
		System.out.print("섭씨 온도로 변환할 화씨 온도를 입력하세요:");
		double hwa= scanner.nextInt();
		temperC(hwa);
	}

}
