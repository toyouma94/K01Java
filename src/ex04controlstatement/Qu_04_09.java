package ex04controlstatement;

public class Qu_04_09 {

	public static void main(String[] args) {

	for(int su=1;su<=9;su++) {
		for(int dan=2;dan<=9;dan++){
		int result=su*dan;
		System.out.printf("%d*%d=%-2d ",dan,su,result);
		}
		System.out.println();
		}
	
	}

}
