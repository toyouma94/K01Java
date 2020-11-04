package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;
/*
 do~while문
 	:반드시 한번은 실행해야 할 경우 사용하는 반복문
 	즉 조건검사 없이 무조건 한번은 실행된다.
 	형식]
 		반복을위한 초기값;
 		do{
 			실행문장;
 			반복문을 탈출하기위한 증감식;
 			}while(조건식); <=반드시 ;로 마무리한다.
 */
public class E04DoWhile {

	public static void main(String[] args)  throws IOException{

		/*
		 시나리오]E03예제의 수열문제를 do while문으로 변경하여 구현하시오
		 */
		int sum=0;
		int i=1;
		do {
			sum+=i;
			i++;
		}while(i<=10);
		System.out.println("1~10까지의 누적합:"+sum);
		/*
		 시나리오] 1부터 1000까지의 정수중 4의 배수이거나 7의 배수인 수의 합을 구하여
		 출력하는 프로그램을 작성하시오. 단, do~while문을 사용해야 한다.
		 */
		int total=0;
		int j=1;
		do {
			if(j%4==0||j%7==0) {
				System.out.println("j="+j);
				total +=j;
			}
			j++;
		}while(j<=1000);
		System.out.println("1~1000사이 4or7의 배수합:"+total);
	/*
	 시나리오]국어, 영어, 수학 점수를 사용자로부터 입력받은 후 평균을 구해 A~F학점을 판단하여 출력하는
	 프로그램을 작성하시오. 단, 사용자가 X,x(대소문자 구문없음)를 입력한다면 프로그램이 종료되어야하며
	 do~while문으로 구현해야한다.
	 */
		Scanner scanner= new Scanner(System.in);
		int kor, eng, math, avg;
		int exitCode;
		do {
			System.out.print("국어점수:");
			kor=scanner.nextInt();
			System.out.print("영어점수:");
			eng=scanner.nextInt();
			System.out.print("수학점수:");
			math=scanner.nextInt();
			/*
			 switch문은 if문과 같은 조건식을 사용할 수 없고 산술식만
			 사용할 수 있음으로 점수의 구간을 구하기 위해 총점을 30으로 나눠준다.
			 */
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
			System.out.println("종료하려면 x(X)를 입력하세요.");
			System.out.println("계속하려면 아무키나 입력하세요.");
			exitCode=System.in.read();
					
		}while(!(exitCode=='x' || exitCode=='X' ));
		/*
		 x를 입력한경우
		 	:(true OR false)=>!true=>false변환
		 	즉 do~while문을 탈출
		 a를 입력한경우
		 	:위 경우와는 반대임으로 Loop를 반복
		 */
	}

}
