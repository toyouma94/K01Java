package bokang;

public class R02for {

	public static void main(String[] args) {
		

		
		/*
		 while문
		 :반복의 횟수가 명확하지 않을때	주로 사용하는 반복문
		 형식
		 	반복을위한변수;
		 	while(while문의 실행된 조건){
		 		실행문;
		 		while문 탈출을 위한 증감식;(++혹은 --)
		 	}
		 */
		
		//시나리오]1~10까지의 합을 구하는 while문을 작성하시오
		int a=1;
		int sum=0;
		while(a<=10) {
			sum+=a;
			a++;
		}
		System.out.println("1~10까지의 합:"+sum);
		
		/*
		 do~while문
		 	:while문과는 다르게 일단은 한번은 실행을 한 후
		 	탈출을 위한 조건을 체크한다.
		 형식]
		 	초기값;
		 	do{
		 		실행문;<-해당 실행문은 무조건 1번은 실행된다.
		 		증감식;
		 	}
		 	while(조건식);
		 */
		//시나리오]위에서 만든 프로그램을 do~while문으로 변경하시오
//		int b=1;
//		int total=0;
//		do {
//			total+=b;
//			b++;
//		}
//		while(b<=10);
//		System.out.println("1~10까지의 합:"+total);
		
		/*
		 for문
		 	:반복의 횟수가 정해져서 명확할때 주로 사용하는 반복문.
		 형식
		 	for(초기값;조건식;증감식){
		 		실행문;
		 	}
		 */
		int hab=0;
		for(int c=1;c<=10;c++) {
			hab+=c;
		}
		System.out.println("1~10까지의 합:"+hab);
		
		/*
		연습문제] 두개의 주사위를 던졌을때 눈의 합이 6이되는 경우를
		모두 출력하는 프로그램을 for문과 if문을 이용하여 작성하시오.
		실행결과]
			1+5=6
			2+4=6
			.......
			5+1=6
		 */
		System.out.println("for문을 이용한 주사위 문제 구현");
		for(int x=1;x<=6;x++) {
			for(int y=6;y>=1;y--) {
				if((x+y)==6) {
					System.out.printf("%d+%d=%d%n",x,y,(x+y));
				}
			}
		}
		/*
		 연습문제] 위 문제를 do~while문으로 변경하시오
		 */
		
		/*
		연습문제] 방정식 2x+4y=12를 만족하는 모든 x,y값을 구하시오.
		단, x,y의 범위는 0~10사이의 정수이고 while문을 통해
		구현하시오.
		실행결과]
			x=0, y=3
			x=2, y=2
			.......
		 */
		int f=0;
	 	while(f<=10){
	 		int s=10;
	 		while(s>=0) {
	 			if((2*f)+(4*s)==12) {
	 				System.out.println("2x+4y=12를 만족하는 x,y:"+f+","+s);
	 			}
	 			s--;
	 		}
	 		f++;
	 	}
	 	
		int total=0;
		System.out.println("n+n+1...");
		for(int n=1;n<=10;n++) {
			for(int m=1;m<=n;m++) {
				total += m;
				}
			}
		System.out.println("값:"+total);
	}

}
