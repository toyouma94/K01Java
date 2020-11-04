package ex05method;

import java.util.Scanner;

public class QuCircleCalculator {

	static void circleRound(double r){
		final double pi=3.14;
		double cFere=2.0*pi*r;
		System.out.println(cFere);
	}
	
	static void circleArea(double r){
		final double pi=3.14;
		double cArea=pi*r*r;
		System.out.println(cArea);
	}
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);		
		System.out.print("반지름을 입력하세요:");		
		double inputr=scanner.nextDouble();
		
		System.out.print("원의 둘레("+ inputr +"):");	
		circleRound(inputr);
		
		System.out.print("원의 넓이("+ inputr +"):");		
		circleArea(inputr);
		
	}
}
