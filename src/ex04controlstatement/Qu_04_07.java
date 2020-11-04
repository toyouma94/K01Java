package ex04controlstatement;

public class Qu_04_07 {

	public static void main(String[] args) {
		
		int sum=0;
		for(int n=1;n<=100;n++)
			if((n%3==0||n%7==0)&&!(n%21==0)){
				sum+=n;
				System.out.print(n+"+");
			}
		System.out.print("="+sum);
	
	}

}
