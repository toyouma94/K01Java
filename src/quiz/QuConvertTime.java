package quiz;

import java.util.Scanner;

public class QuConvertTime {

	static final int Hour=60*60;
	static final int Min=60;
	
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("시간으로 변환할 초를 입력하세요:");
		int inputSec=scan.nextInt();
		convertSecToHMS(inputSec);
	}
	
	public static void convertSecToHMS(int sec) {
		//시,분,초 저장을 위한 지역변수 선언
		int h,m,s;
		
		//시간  구하기
		h=sec/Hour;
		sec=sec&Hour;//시간을 구하고 남은 초를 다시 저장
		//분 구하기
		m= sec/Min;
		sec=sec%Min;//분을 구하고 남은 초를 다시 저장
		//초 구하기
		s=sec;
		
		System.out.printf("%d시간 %d분 %d초",h,m,s);
	}

}
