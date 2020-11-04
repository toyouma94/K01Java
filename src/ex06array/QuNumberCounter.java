package ex06array;

public class QuNumberCounter {

	public static void main(String[] args) {
		
		int[] answer={1,4,4,3,1,4,4,2,1,3,2};
		/*
		 배열의 크기를 지정하여 선언하면 0으로 채워진다.
		 */
		int[] counter=new int[4];
		
		
		//배열의ㅣ 크기만큼 반복하면서 각 요소를 읽어온다.
		for(int i=0;i<answer.length;i++) {
			/*
			 아래 if~else문을 한줄로 수정하면 다음과 같다
			 검색한 숫자가 만약 1이라면 counter배열의 0번 인덱스를 +1 증가시키므로
			 아래와 같이 표현할 수 있다.
			 */
			counter[answer[i]=1]++;
			/*
			if(answer[i]==1) counter[0]++;
			else if(answer[i]==2) counter[1]++;
			else if(answer[i]==3) counter[2]++;
			else if(answer[i]==4) counter[3]++;
			*/
		}
		
		//counter배열 출력
		for(int i=0;i<counter.length;i++) {
			System.out.printf("counter[%d](%d)의 갯수:%d\n",i,i+1,counter[i]);
		}
	}
}
