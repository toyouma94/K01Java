package ex08class;
//과일판매자를 추상화한 클래스
class FruitSeller2{
	int numOfApple;//판매자의 사과 보유갯수
	int myMoney;//판매수익
	int apple_price;//사과의 단가
	
	/*
	 상수에서 변수로 변경함.
	 클래스의 멤버상수로 정의하는 경우 선언과 동시에
	 초기화해야 하므로 상수는 초기값이 없는 상태로는 선언이 불가능함
	 */
	
	/*
	 apple_price를 상수에서 변수로 변경한 이유는 상수는 단 한번만
	 초기화되는 특성때문에 일반적인 멤버메소드 내에서는 초기화 할 수 없다.
	 멤버메소드는 개발자가 원할때 언제든지 호출 할 수 있으므로,상수의 
	 특성과는 맞지 않기 때문이다.
	 */
	public void initMembers(int money,int appleNum,int price) {
		myMoney=money;
		numOfApple=appleNum;
		apple_price=price;
	}
	//판매자가 사과를 판매하는 행위를 표현한 멤버메소드
	public int saleApple(int money) {
		int num=money/apple_price;
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
class FruitBuyer2{
	int myMoney; //보유금액
	int numOfApple; //구매한 사과의 갯수
	
	public void initMembers(int _mymoney,int _numOfapple) {
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
	public void buyApple(FruitSeller2 seller, int money) {
		numOfApple+=seller.saleApple(money);
		myMoney-=money;
	}
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+myMoney);
		System.out.println("[구매자]사과갯수:"+numOfApple);
	}
}
public class E06FruitSalesMain2 {

	public static void main(String[] args) {
		
		/*
		 초기화메소드를 정의하였으므로, 각각 성격이 다른 객체들을 생성 할 수 있다.
		 */
		//판매자1
		FruitSeller2 seller1=new FruitSeller2();//판매자 객체
		seller1.initMembers(0,100,1000);
		//판매자2
		FruitSeller2 seller2=new FruitSeller2();//판매자 객체
		seller2.initMembers(0,80,500);
		//구매자
		FruitBuyer2 buyer=new FruitBuyer2();//구매자 객체
		buyer.initMembers(10000,0);
		
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