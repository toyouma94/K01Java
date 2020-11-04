package ex06array;

import java.util.Scanner;

import java.util.Scanner;

public class QuSungJuk {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.print("학생수를 입력하세요:");
		int Num=scanner.nextInt();
		System.out.println("학생수:"+Num);
		double[][] grade=new double[Num][5];
		
		for(int i=0;i<Num;i++) {
			System.out.printf("[%d번째 학생의 점수 입력]%n",i+1);
			for(int j=0;j<3;j++) {
				if(j==0)
					System.out.print("국어 점수 입력:");
				else if(j==1)
					System.out.print("영어 점수 입력:");
				else if(j==2)
					System.out.print("수학 점수 입력:");
				grade[i][j]=scanner.nextInt();
				grade[i][3]+=grade[i][j];
			}
			grade[i][4]=(grade[i][3]/3);
		}
		
		System.out.println("==========================");
		System.out.println("NO KOR ENG MAT TOT AVG");
		System.out.println("==========================");
		for(int i=0;i<Num;i++) {
			System.out.printf("%d %.0f %.0f %.0f %.0f %.2f%n",i+1,grade[i][0],grade[i][1],grade[i][2],grade[i][3],grade[i][4]);
		}
		System.out.println("==========================");
	}
}
