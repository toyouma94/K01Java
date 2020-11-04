package ex04controlstatement;

import java.util.Scanner;

public class Qu_04_03 {

	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		int kor, eng, math, avg;
			System.out.print("국어점수:");
			kor=scanner.nextInt();
			System.out.print("영어점수:");
			eng=scanner.nextInt();
			System.out.print("수학점수:");
			math=scanner.nextInt();
			avg=(kor+eng+math)/3;
			System.out.println("평균점수:"+avg);
			avg=(kor+eng+math)/(3*10);
			switch(avg) {
			case 10: case 9:
				System.out.println("A학점");break;
			case 8:
				System.out.println("B학점");break;
			case 7:
				System.out.println("C학점");break;
			case 6:
				System.out.println("D학점");break;
			default:
				System.out.println("F학점");break;
			}
	}

}

