package ex06array;

import java.util.Scanner;

public class QuFillArray {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		int[] arr1=new int[10];//입력받은 정수를 순서대로 입력
		int[] arr2=new int[10];//홀or짝을 구분해서 입력
		
		int indexStart=0;//arr배열이 첫번째 인덱스 저장(홀수인경우)
		int indexEnd=arr2.length-1;//마지막 인뎃스 저장(짝수인경우)
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print("채울 숫자를 입력하세요:");
			int inputNum=scanner.nextInt();
			
			//첫번째 배열에는 입력한 순서대로 채워준다. 
			arr1[i]=inputNum;
			
			if(inputNum%2==1) {
				//입력받은 숫자가 홀수이면 앞에서부터 채우고 인덱스+1증가
				arr2[indexStart++]=inputNum;
			}
			else {
				//입력받은 숫자가 짝수이면 앞에서부터 채우고 인덱스-1감소
				arr2[indexEnd--]=inputNum;
				
			}
		}
		//두개의 배열을 출력하기
		System.out.println("첫번째배열 출력");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.print("\n두번째배열 출력\n");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
