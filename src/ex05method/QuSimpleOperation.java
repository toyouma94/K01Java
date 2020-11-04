package ex05method;

import java.util.Scanner;

public class QuSimpleOperation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("두개의 양의 정수를 입력하세요");
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		arithmetic(m,n);
	}
	
	static void arithmetic(int a, int b) {
		System.out.printf("덧셈결과 %d%n",a+b);
		System.out.printf("뻴셈결과 %d%n",a-b);
		System.out.printf("곱셈결과 %d%n",a*b);
		System.out.printf("나눗셈 몫 %d%n",a/b);
		System.out.printf("나눗셈 나머지 %d%n",a%b);
	}

}
