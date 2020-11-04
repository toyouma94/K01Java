package ex08class;

class Triangle{
	double b;
	double h;
	
	public void init(double b,double h) {
		this.b=b;
		this.h=h;
	}
	
	public double getArea() {
		double result=(b*h)/2.0;
		return result;
	}
	public void setBottom(double b) {
		this.b=b;
	}
	public void setHeight(double h) {
		this.h=h;
	}
}
public class QuTriangle {
	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());
	}

}
