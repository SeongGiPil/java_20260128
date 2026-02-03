package day5;

import java.util.Arrays;

public class Java2_선택정렬2 {
	public static void main(String[] args) {
		//1번파일에서 작성한 코드의 규칙서을 찾아서
		//반복문으로 재작성하기
		int arr[]= {2,3,5,1,4};
		int minIndex=0;
		for(int j=0; j<arr.length-1;j++) {
			int minIndax=j;
		for(int i=j+1;i<arr.length;i++) {
			
			if(arr[minIndex]>arr[i]) {
				minIndex=i;
				System.out.println(j+1);
			}
		}
		int temp=arr[j];
		arr[j]=arr[minIndex];
		arr[minIndex]=temp;
	}
		System.out.println(Arrays.toString(arr));
}
}		
		
		

