package ex04controlstatement;

import java.io.IOException;

public class Qu_04_01 {

	public static void main(String[] args) throws IOException {

		System.out.print("문자하나를 입력하세요:");
		int asciiCode=System.in.read();
		
		/*
		 아스키 코드를 모를때 구현법
		 입력받은 문자가 숫자형 문자인지 판단하여 boolean값 저장 
		 */
//		boolean isNumber = (ascii>='0'&&ascii<='9');
//		if(isNumber==0) {
//			만약 숫자라면..	
		/*
		 숫자형 문자가 가지고 있는 아스키코드값에서 48(0의 아스키코드)을 빼면 해당문자의 정수가 된다.
		 즉'4'-'0'=(정수)4
		 */
//			if((ascii-'0')%2==0){
//		System.out.println("2의 배수입니다.");
//		}
//		else {
//			System.out.println("2의 배수가아닙니다.");
//		}
//	}
//	else {
//		System.out.println("숫자가 아닙니다.");
//	}
		if(asciiCode>=48 && asciiCode<=57) {
			if(asciiCode%2==0) {
				System.out.println("2의 배수입니다.");
			}
			else {
				System.out.println("2의 배수가아닙니다.");
			}
		}
		else {
			System.out.println("숫자가 아닙니다.");
		}

	}

}
