package day18;

import java.util.Arrays;

public class 배열퀴즈 {
	public static void main(String[] args) {
		int max = 0;
		
		int arr[] = { 3, 5, 2, 9, 4 };
		int arr2[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for(int j=0;j<arr.length;j++) {
				arr2[i] = arr[i];
		}
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length - 2]);
		}
	}
}

