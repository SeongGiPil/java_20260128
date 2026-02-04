package day6;

import java.util.Arrays;

public class Java1_퀴즈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,10,5,9,2};
		ArrayFunc func=new ArrayFunc();
		int max=func.max(arr);
		System.out.println(max);//10
		
		
		int sum=func.arrSum(arr);	System.out.println();//배열의모든수의합
		
//		5개의 공간을 가지는 배열생성후 랜덤한 숫자(1~20) 5개넣기
		int ranArr[]=func.createRanArr(5, 50,100);
		System.out.println(Arrays.toString(ranArr));
		
		
		//5개의 공간의 인자값을 배열을 리턴
		//배열의 값들은 사용자가 직접입력해서 넣도록
//		1~30이하 숫자는 다시입력하도록
//		int newArr[]=func.createArr(5);
//		System.out.println(Arrays.toString(newArr));
//		
//		int list[]= {3,5,-4,-2,6,-8};
//		int positiveArr[]=func.createPositive(list);
//		System.out.println(Arrays.toString(positiveArr));
		
//		int arr[]= {3,10,5,9,2};
		int oddArr[]=func.createOddArr(arr);
		System.out.println(Arrays.toString(oddArr));
				
		
	}

}

