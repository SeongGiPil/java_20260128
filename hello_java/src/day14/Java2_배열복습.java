package day14;

import java.util.Arrays;

public class Java2_배열복습 {
	
	public static void main(String[] args) {
		//[1,2,3,4,5]
		
		int arr[]= {3,5,2,4,1};
		int arr2[]=new int [5];//{0,0,0,0,0}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int num:arr) {
			System.out.print(num+" ");
		}
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
		
		//배열에는 중복된 숫자가 없다고 가정 후 풀이
		// arr배열에서 두번째로 큰수 출력
		
		Arrays.sort(arr);//{1,2,3,4,5}
		System.out.println(arr[arr.length-2]);
	}
}
