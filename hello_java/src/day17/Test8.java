package day17;

import java.util.Arrays;

public class Test8 {
	public static void main(String[] args) {

	public static boolean sameNumberCounts(int[]arr1,int[]arr2) {
			//구현
			//[5,2,3,2,1],[1,3,2,2,4]
			
			
			if(arr1.length==arr2.length) {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]!=arr2[i]) {
					return false;
				}
			}
			
			}else {
				return false;
			}
		
		
		
		
		
		int arr1[]= {1,2,2,3};
		int arr2[]= {3,2,1,2};
		boolean result=sameNumberCounts()
	}
	}
}
}

