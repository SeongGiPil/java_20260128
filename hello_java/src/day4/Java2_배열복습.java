package day4;

import java.util.Arrays;

public class Java2_배열복습 {
	public static void main(String[] args) {
		int[]arr={3,5,2,4,1};

		int minindex=0;
		int maxindex=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[maxindex]) {
				maxindex=i;
				
			}
			if(arr[i]<arr[minindex]) {
				minindex=i;
			}
		}
		System.out.println(maxindex);
		System.out.println(minindex);
		
		int temp=arr[maxindex];
		arr[maxindex]=arr[minindex];
		arr[minindex]=temp;
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
