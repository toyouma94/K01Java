package ex04controlstatement;

public class Qu_04_06 {

public static void main(String[] args) {	
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<i;j++) {
				
				System.out.print("* ");
			}
			System.out.println("* ");
		}
		System.out.println();
	}
}
//		int i=1;
//		while(i<=5) {
//			int=1;
//			while(j<=5) {
//				//j는 i의 갯수만큼 출력한다.
//				if(i>=j) {
//					System.out.print("* ");
//				}
//				j++;
//			}
//			i++;
//			system.out.println();
//		}