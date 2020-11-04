package ex08class;

class CalculatorEx{
	
	//멤버변수:각 연산의 횟수를 카운트 하기 위한 용도
	int addcount;
	int mincount;
	int mulcount;
	int divcount;
	
	//초기화를 위한 멤버 메소드
	public void init() {
		addcount=0;
		mincount=0;
		mulcount=0;
		divcount=0;
	}
	double add(double a,double b) {
		//덧셈 연산을 수행하면 +1 증가
		addcount++;
		double result=a+b;
		return result;
	}
	double min(double a,double b) {
		mincount++;
		double result=a-b;
		return result;
	}
	double mul(double a,double b) {
		mulcount++;
		double result=a*b;
		return result;
	}
	double div(double a,double b) {
		divcount++;
		double result=a/b;
		return result;
	}
	//연산횟수를 출력하는 멤버메소드
	void showOPCount() {
		System.out.println("덧셈 횟수:"+addcount);
		System.out.println("뺄셈 횟수:"+mincount);
		System.out.println("곱셈 횟수:"+mulcount);
		System.out.println("나눗셈 횟수:"+divcount);
	}
}
public class QuSimpleCalculator {

	public static void main(String[] args)
	{
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOPCount();
	}	
}
