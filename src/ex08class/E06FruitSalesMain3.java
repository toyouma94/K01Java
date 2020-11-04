package ex08class;
//과일판매자를 추상화한 클래스
class FruitSeller3{
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
	public FruitSeller3(int money,int appleNum,int price) {
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
class FruitBuyer3{
	int myMoney; //보유금액
	int numOfApple; //구매한 사과의 갯수
	
	public FruitBuyer3(int _mymoney,int _numOfapple) {
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
	public void buyApple(FruitSeller3 seller, int money) {
		numOfApple+=seller.saleApple(money);
		myMoney-=money;
	}
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+myMoney);
		System.out.println("[구매자]사과갯수:"+numOfApple);
	}
}
public class E06FruitSalesMain3 {

	public static void main(String[] args) {
		
		/*
		 초기화메소드를 정의하였으므로, 각각 성격이 다른 객체들을 생성 할 수 있다.
		 */
		//판매자1
		FruitSeller3 seller1=new FruitSeller3(0,100,1000);
		//판매자2
		FruitSeller3 seller2=new FruitSeller3(0,80,500);
		//구매자
		FruitBuyer3 buyer=new FruitBuyer3(10000,0);
		
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