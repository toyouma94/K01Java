package ex03operator;

public class E04LogicOperator {

	/*
	 논리연산자
	 &&:논리And. 양쪽모두가 true일때만 true를 반환하고 나머지는 false반환
	 ||:논리Or. 한쪽만 true이면 true를 반환하고 양쪽모두false일때만 false반환
	 !:논리Not. 반대의 논리를 반환함.
	 */
	public static void main(String[] args) {

		int num1=10, num2=20;
		
		boolean resul1=(num1==100&&num2==20);
		boolean resul2=(num1<12||num2>=30);
		
		System.out.println("result1의결과:"+resul1);
		System.out.println("result2의결과:"+resul2);
		
		//num1과 num2가 다를때 true를 반환한다. 따라서 if블럭 실행
		if(!(num1==num2)) {
			System.out.println("num1과 num2는 다르다");
		}
		else{
			System.out.println("num1과 num2는 같다");
		}
	}

}
