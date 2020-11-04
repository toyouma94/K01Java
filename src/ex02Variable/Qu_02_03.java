package ex02Variable;

public class Qu_02_03 {

	public static void main(String[] args) {
		int r = 10;
		final double PI=3.14;
		int area_int=(int)(r*r*PI);
		float area_float=r*r*(float)PI;
		double area_double=r*r*(double)PI;
		System.out.println("int형 넓이:" + area_int);
		System.out.println("float형 넓이:" + area_float);
		System.out.println("double형 넓이:" + area_double);
	}
}
