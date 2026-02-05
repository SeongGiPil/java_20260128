package day7;

import java.util.Arrays;
import java.util.Random;


public class Java98_문제풀이 {
public static void main(String[] args) {
//	1~30사이 숫자를 배열에 10개의 배열에 넣기
	Random ran=new Random();
	int odd=0;
	int even=0;
	int arr[]=new int[10];
	for(int i=0;i<arr.length;i++) {
		arr[i]=ran.nextInt(30)+1;
	
	
	int oddArr[]=new int[odd];
	int evenArr[]=new int[even];
	

	if(ran.nextInt()%2==1) {
		
	}else {
		arr[i]=evenArr[even];
	}
		
}
	   System.out.println("홀수 배열: " + Arrays.toString(arr));
      
}
}
	
	
	