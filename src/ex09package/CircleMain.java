package ex09package;
/*
 메인클래스에서 다른 패키지의 클래스를 import하려면
 해당 클래스는 바드시 public으로 선언해야한다.
 그렇지 않으면"not visible"에러가 발생한다.
 */
import ex09package.kosmo.perimeter.Circle;

public class CircleMain {

	public static void main(String[] args) {

		//원의넓이:클래스 사용을 위해 풀패키지 경로를 사용
		ex09package.kosmo.area.Circle circle1=new ex09package.kosmo.area.Circle(6.5);
		System.out.println("반지름이 6.5인 원의넓이:"+circle1.getArea());
		
		//원의둘레:import하여 해당 클래스를 문서에 포함
		Circle circle2=new Circle(4.5);
		System.out.println("반지름이 4.5인 원의둘레:"+circle2.getPerimeter());
	}

}
