package bokang;

import bokang.sub.CheckCard1;
import bokang.sub.CheckCard2;
import bokang.sub.CheckCard3;

public class R05Class {

	public static void main(String[] args) {

		//체크카드 클래스 Ver01
		/*
		 숫자를 구분할때 구분자로 언더바를 사용할 수 있다.
		 JDK7.0부터 지원되었으며 숫자 사이에 쓰는 것만 허용된다.
		 잘못된방법}
		 	3._14159287
		 	123_345_
		 	_123_456
		 	위와같이 언더바로 시작하거나 끝날수 없고,소수점과
		 	연결해서도 사용할 수 없다.
		 */
		CheckCard1 cc1=new CheckCard1();
		cc1.cardNumber=5107_3743_3212_2985L;
		cc1.owner="홍길동";
		cc1.balance=10000;
		cc1.point=0;
		
		//5000원 결제
		cc1.payment(5000);
		//10000원 결제
		cc1.payment(10000);
		//현재상태 보기
		cc1.showState();
		/*****************************************************/
		//객체생성 후 초기화 메소드를 통해서 멤버변수 초기화
		CheckCard2 cc2=new CheckCard2();
		cc2.initMembers(1111_2222_3333_4444L,"주호민",3000,0);
		
		//인자생성자를 통해 객체생성과 동시에 멤버변수 초기화
		CheckCard3 cc3=new CheckCard3(5555_2235_3663_4444L,"이말년",1000,0);
		cc2.charge(8000);
		cc2.payment(9000);
		cc2.showState();

		cc3.charge(1800);
		cc3.payment(190000);
		cc3.showState();
		
		//정보은닉된 멤버 접근시에는 setter를 통해서만 가능
		cc2.setBalance(9900);
		cc2.setOwner("침펄토론");
		cc2.showState();
	}

}
