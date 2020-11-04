package ex04controlstatement;

public class Qu_04_08 {

public static void main(String[] args) {	
		
		for(int i=5;i>=1;i--) {
			
			for(int j=1;j<i;j++) {
				
				System.out.print("* ");
			}
			System.out.println("* ");
		}
		System.out.println();
	}

}

//		final int FLOOR=5;
//		FLOOR-x+1: 변수 x가 증가함에 따라 점점 감소하는 y를 표현하기 위한 일반식 정의
//		세로 반복
//		for(int x=1;x<=FLOOR;x++) {
//			가로 반복
//			for(int y=1;y<=(FLOOR-x+1);y++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}