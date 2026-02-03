package day4;

import java.util.Arrays;
import java.util.Random;

public class Java8_Quiz2 {
public static void main(String[] args) {
	int arr[]=new int [10];
	//랜덤한숫자 10개를 arr배열에 넣기
	//*랜덤숫자의 범위는 1~20
	//*홀수와 짝수의 개수는 무조건 5개씩
	
	Random ran=new Random();
	int oddcnt=0;
	int evencnt=0;
	for(int i=0;i<arr.length;i++) {
		int random=ran.nextInt(20)+1;
		
		if(random%2==1) {
			if(oddcnt==5) { //oddcnt가 5에도달하면 종료
				i--;
				continue;
			}
			oddcnt++;
		}else {
			if(evencnt==5) {
				i--;
				continue;
		}
		
			evencnt++;
		}
	arr[i]=random;
}
		
	
	
	System.out.println(Arrays.toString(arr));
	

		
		
		
		
		}
}	


