package ex09packagekosmo.buyer;

import ex09packagekosmo.seller.FruitSeller4;

public class FruitBuyer4 {
//구매자를 표현한 클래스
	int myMoney; //보유금액
	int numOfApple; //구매한 사과의 갯수
	
	public FruitBuyer4(int _mymoney,int _numOfapple) {
		myMoney=_mymoney;
		numOfApple=_numOfapple;
	}
	//구매자가 판매자에게 사과를 구매하는 행위를 표현한 멤버메소드
	/*
	 1.판매자에게 금액을 지불한다ㅏ.
	 2.판매자가 금액에 해당하는 사과의 갯수를 반환해준다.
	 	반환한 갯수만큼 보유한 사과의 갯수가 증가한다.
	 3.판매자에게 지불한 금액만큼 차감된다.
	 */
	public void buyApple(FruitSeller4 seller, int money) {
		numOfApple+=seller.saleApple(money);
		myMoney-=money;
	}
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+myMoney);
		System.out.println("[구매자]사과갯수:"+numOfApple);
	}
}

