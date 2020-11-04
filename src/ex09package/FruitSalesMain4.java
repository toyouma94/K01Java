package ex09package;
/*
 연습문제]해당 프로그램을 아래의 지시에 따라 패키지로
 구분하여 정상 실행되도록 변경하시오. 
 
 FruitSeller4->kosmo.seller.FruitSeller 패키지에 묶는다
 FruitSeller4->kosmo.buyer.FruitBuyer 패키지에 묶는다
 
 두클래스를 적당히 import하여 정상작동 할 수 있도록
 FruitSellerMain4 클래스를 구성한다
 */

import ex09packagekosmo.buyer.FruitBuyer4;
import ex09packagekosmo.seller.FruitSeller4;

public class FruitSalesMain4 {

	public static void main(String[] args) {
		
		/*
		 초기화메소드를 정의하였으므로, 각각 성격이 다른 객체들을 생성 할 수 있다.
		 */
		//판매자1
		FruitSeller4 seller1=new FruitSeller4(0,100,1000);
		//판매자2
		FruitSeller4 seller2=new FruitSeller4(0,80,500);
		//구매자
		FruitBuyer4 buyer=new FruitBuyer4(10000,0);
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		/*
		 구매자가 판매자에게 5000원을 지불하고 사과를
		 구매한 행위를 코드로 표현함
		 */
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
	}

}