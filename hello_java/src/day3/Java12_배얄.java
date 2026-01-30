package day3;

import java.util.Arrays;
import java.util.Scanner;

public class Java12_배얄 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
//	int[]arr=new int[5];int[]arr=new int[5];
	int [] arr=new int[5];
	int sum=0;
	for(int i=0; i<arr.length;i++) {
		System.out.println((i+1)+"번째 숫자입력:");
		arr[i]=s.nextInt();
		
	
	}
	
	System.out.println(Arrays.toString(arr));
	//======입력받은 5개의 숫자의 평균을 구하시오
	//(배열안에있는 모든값의평균
	for (int i=0; i<arr.length;i++){
		sum+=arr[i];
	}
	System.out.print("평균은"+(double)sum/arr.length+"입니다");
}
}
