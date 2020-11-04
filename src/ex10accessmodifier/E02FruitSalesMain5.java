package ex10accessmodifier;
//과일판매자를 추상화한 클래스
class FruitSeller5{
	int numOfApple;//판매자의 사과 보유갯수
	int myMoney;//판매수익
	final int APPLE_PRICE;//사과의 단가
	
	/*
	 상수는 값의 변경이 불가능하고, 단 한번만 초기화되기 때문에
	 일반적인 멤버메소드에서는 초기화 할 수 없다.
	 하지만 생성자 메소드에서는 초기화가 가능하다.
	 마음대로 호출할 수 없고, 객체생성시 단 한번만 호출되는
	 특성이 동일하기 때문에 한번이상 초기화되지 않음이 보장되기 때문이다.
	 */
	public FruitSeller5(int money,int appleNum,int price) {
		myMoney=money;
		numOfApple=appleNum;
		APPLE_PRICE=price;
	}
	//판매자가 사과를 판매하는 행위를 표현한 멤버메소드
	public int saleApple(int money) {
		int num=money/APPLE_PRICE;
		numOfApple-=num;
		myMoney+=money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+numOfApple);
		System.out.println("[판매자]판매수익:"+myMoney);
	}
}
//구매자를 표현한 클래스
class FruitBuyer5{
	int myMoney; //보유금액
	int numOfApple; //구매한 사과의 갯수
	
	public FruitBuyer5(int _mymoney,int _numOfapple) {
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
	public void buyApple(FruitSeller5 seller, int money) {
		numOfApple+=seller.saleApple(money);
		myMoney-=money;
	}
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+myMoney);
		System.out.println("[구매자]사과갯수:"+numOfApple);
	}
}
public class E02FruitSalesMain5 {

	public static void main(String[] args) {
		
		/*
		 초기화메소드를 정의하였으므로, 각각 성격이 다른 객체들을 생성 할 수 있다.
		 */
		//판매자1
		FruitSeller5 seller1=new FruitSeller5(0,100,1000);
		//판매자2
		FruitSeller5 seller2=new FruitSeller5(0,80,500);
		//구매자
		FruitBuyer5 buyer=new FruitBuyer5(10000,0);
		
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
		/*
		 알래의 코드는 문법적으로 오류가 없으나 지불금액과 구매한 사과의 관계가 전혀 맞지 않는
		 논리적 오류가 발생되었다.
		 즉,코드(메소드)로 구현한 규칙이 완전히 무너지게된다.
		 객체지향 프로그래밍에서는 이런 오류를 막기위해 멤버변수에 대한
		 "정보은닉"을 하도록 규정하고 있다.
		 */
		seller1.myMoney+=1000;//판매자1에게 1000원지불
		seller1.numOfApple-=50;//사과 50개 구매
		buyer.numOfApple+=50;
		
		seller2.myMoney+=1000;//판매자2에게 1000원지불
		seller2.numOfApple-=70;//사과70개 구매
		buyer.numOfApple+=70;//하지만 구매자의 보유금액 차감되지 않음
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
	}

}