package ex18lambda;

/*
 일반적인 인터페이스와 클래스를 황용한 오버라이딩
 */
interface IKosmo1{
	/*
	 인터페이스에 정의된 메소드는 public abstract로 선언된다.
	 */
	void studylambda(String str);
}
class KosmoStutent1 implements IKosmo1
{
	/*
	 인터페이스를 구현 받았으므로 반드시 추상메소드를 오버라이딩 해야한다.
	 */
	@Override
	public void studylambda(String str) {
		System.out.println(str+"을(를) 공부합니다");		
	}
}
public class Ex01NormalClass {

	public static void main(String[] args) {

		/*
		 단지 메소드 하나를 정의해서 사용하고 싶은데 인터페이스, 상속,
		 오버라이딩, 객체생성까지의 과정을 거쳐야 한다. 과정이 너무 복잡한 단점이 있다.
		 */
		IKosmo1 kosmo=new KosmoStutent1();
		kosmo.studylambda("람다식");
	}

}
