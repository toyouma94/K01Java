package Ex01JavaStart;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
자바파일의 구조
1.패키지 선언부 : 클래스를 종류별로 묶어서 관리하기 위한 선은으로 디렉토리(폴더)의 의미로 이해해도 된다.
2.import선언부 : 내가 만든 클래스에서 필요한 자바클래스를 가져다 쓰기위한 선은으로 JDK에서 제공하는 클래스를 사용할수도 있다.
3.클래스 선언부 : 자바프로그램은 클래스단위로 구성되므로 기본적으로 필요한 부분으로 클래스는 항상 영문 대문자로 시작하고 파일의 확장자는 .Java로 해야한다.
 */
public class JavaStruct {

	public static void main(String[] args) {
		
		System.out.println("자바의 간략한 구조");
		//Data클래스로 오늘날짜 출력하기
		Date toDayOfDate = new Date();

		System.out.println("오늘날짜:" + toDayOfDate);
		
		/*
		 SimpleDateFormat 클래스를 이용하여 우리가 흔히 사용하는 포맷인
		 년-월-일 시:분:초 형태로 변환하여 출력함.
		 */		
		
		SimpleDateFormat simple =
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String toDayString	= simple.format(toDayOfDate);
		System.out.println("변형된날짜:" + toDayString);
	}
}