package quiz;

public class ExSusikAZ {

	public static void main(String[] args) {

		/*
		 A:0~9사이의 정수
		 Z:0~9사이의 정수
		 단, A와 Z는 서로다른 정수이다.
		 
		 */
		for(int A=0;A<=9;A++) {
			for(int Z=0;Z<=9;Z++) {
				if(A==Z) {
					//A와Z는 서로 다른 숫자이므로 같은 값이 나올때는 아래 코드를
					//실행하지 않고 반복문의 처음으로 돌아간다.
					
					if(A==Z) {
						//A와 Z는 서로 다른 숫자이므로 확인할 필요 없음
						continue;
					}
					//AZ와 ZA를 코드로 표현하면 아래와 같다.
					int result=(A*10+Z)+(Z*10+A);
					if(result==99) {
						System.out.printf("%d%d + %d%d = %d\n",A,Z,Z,A,result);
					}
				}
			}
		}
	}

}
