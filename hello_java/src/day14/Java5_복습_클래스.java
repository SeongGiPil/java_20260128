package day14;

import java.util.Arrays;

public class Java5_복습_클래스 {
	public static void main(String[] args) {
		int max=Function.max(3,5);
		System.out.println(max);//5
		
		
		Function func=new Function();//"Function 객체를 생성했습니다"
		int min=func.min(3,5);
		System.out.println(min);
		
		
		int ran=Function.random(10);
		System.out.println(ran);
		
		
		int arr[]= {3,5,-4,10,-9};
		int sum=Function.sum(arr);
		System.out.println(sum); //배열안에 있는 모든숫자의합 5
		
		
		Function.sort(arr);
		//음수양수 상관없이 내림차순
		System.out.println(Arrays.toString(arr)); //{10,-9,5,-4,3}
		
	}
}
