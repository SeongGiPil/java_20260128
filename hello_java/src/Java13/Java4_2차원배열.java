package Java13;

import java.util.Arrays;

public class Java4_2차원배열 {
	public static void main(String[] args) {
		int arr[][]=new int [3][5];
		int arr2[][]={
				{5,4,1,2,3},
				{10,5,8,7,1},
				{15,30,40,20,16}
	};
//		System.out.println(arr2[0][2]);
//		System.out.println(Arrays.toString(arr2[1]));
//		
//		for(int i=0;i<arr2[0].length;i++) {
//			
//			System.out.println(arr2[0][i]+" ");
//		}
//		
//		System.out.println();
//		for(int i=0;i<arr2[1].length;i++) {
		
//			
//		}
		for(int j=0;j<arr2.length;j++) {
			for(int i=0;i<arr2[j].length;i++) {
				System.out.println(arr2[j][i]+" ");
				
			}
			System.out.println();
		}
		//{5,4,1,2,3}
		for(int array[]:arr2) {
			for(int num:array) {
				System.out.println(num+"");
				
			}
			System.out.println();
		}
	}
}
