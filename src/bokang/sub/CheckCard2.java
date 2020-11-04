package bokang.sub;
/*
체크카드 클래스 Ver.02

버전02에서 추가부분
	1. 멤버변수 초기화 메소드 정의 
		메소드명 : initMembers()
	2. 기본생성자, 인자생성자 정의
	3. 멤버변수 정보은닉
	4. getter/setter 메소드 추가
 */


public class CheckCard2 {

	//멤버변수
	private long cardNumber;
	private String owner;
	private int balance;
	private int point;

	//멤버메소드
	public void initMembers(long cardNumber, String owner, int balance, int point){
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balance = balance;
		this.point = point;
	}
	/*
	 생성자메소드와 멤버메소드의 유일한 차이점은
	 	생성자는 반환값이 없고, 멤버메소드는 반환값이 있다.
	 	따라서 멤버메소드를 정의할 때는 반드시 void혹은 반환타입을 명시해야 한다.
	 */
	
	//기본 생성자
	public CheckCard2() {}
	//인자 생성자
	public CheckCard2(long cardNumber, String owner, int balance, int point) {
		super();
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balance = balance;
		this.point = point;
	}
	
	//충전
	public void charge(int amount) {
		//잔고에 충전할 금액을 더한다.
		this.balance+=amount;
	}
	//결제
	public void payment(int amount) {
		this.balance-=amount;
		//카드를 사용할때 적립금이 발생하게 되므로 호출해준다.
		savingPoint(amount);
	}
	//적립
	public void savingPoint(int amount) {
		this.point+=(amount*0.1);
//		double plusPoint=(amount*0.1);
//		this.point+=plusPoint;//복합대입 연산자 자동 형변환
	}
	//현재상태 출력(멤버변수)
	public void showState() {
		System.out.println("==========================");
		System.out.println("카드번호:"+cardNumber);
		System.out.println("소유자:"+owner);
		System.out.println("잔고:"+balance);
		System.out.println("포인트:"+point);
		System.out.println("==========================");
	}
	//게터세터-private멤버변수에 접근하기 위해서
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}
