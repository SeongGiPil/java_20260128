package day3;

import java.util.Arrays;
import java.util.Scanner;


public class Java16_배열퀴즈 {
public static void main(String[] args) {
	//5개의 배열을 선언
	//해당배열에 숫자를 입력받아서 넣기
	//1미만 0이하의 숫자가 입력하면 배열에 입력하지않고 다시입력하도록
	Scanner s=new Scanner(System.in);
	int[] arr=new int[5];
	
for(int i=0; i<arr.length;i++) {
	System.out.print((i+1)+"번째 숫자 입력");
	arr[i]=s.nextInt();
	//{1,2,-10,0,0}
	
	//arr[index]값이 0이하인지체크
	if(arr[i]<1) {
		System.out.println("다시입력해주세요");
		i--;
	}
		
		
	}
System.out.println(Arrays.toString(arr));		
	

}
}


