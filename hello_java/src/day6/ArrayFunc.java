package day6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayFunc {

		public static void main(String[] args) {
			
		}
	
	public int max(int[]arr) {
		int max=arr[0];
		//{3,10,5,9,2}
		for(int i=0;i<arr.length;i++) {
			max=Math.max(max,arr[i]);
		}
		return max;
	}
	public int arrSum(int[]arr) {	
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
		
	}
	public int[]createRanArr(int size,int first,int last){
		int arr[]=new int[size];
//		{0,0,0,0,0}
		Random ran=new Random();
		for(int i=0;i<arr.length;i++) {
			arr[i]=ran.nextInt(11)+first;
		}
		return arr;
}
		
		public int[]createArr(int size){
			Scanner s=new Scanner(System.in);
			int arr[]=new int [size];
			for(int i=0;i<arr.length;i++) {
				System.out.println((i+1)+"번째 숫자입력");
				arr[i]=s.nextInt();
				if(arr[i]>=1||arr[i]<30) {
					System.out.println("1부터 30사이를 입력해주세요");
					i--;
				}
				}
			return arr;
		}

		public int[] createPositive(int[] arr) {
			// TODO Auto-generated method stub
			int size=0;
			int j=0;
			for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				size++;
			}
			}
			int newArr[]=new int[size];
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>0) {
					newArr[j++]=arr[i];
					//인덱스값을 채우기위해 j라는 변수를 하나씩증가시킴
				}
			}
			return newArr;
		
			
			

}

		public int[] createOddArr(int[] arr) {
			// TODO Auto-generated method stub
			int size=0;
			int j=0;
			for(int i=0;i<arr.length;i++) { //홀수를 찾아내는과정
				if(arr[i]%2==1) {
					size++;
				}
			}
				int newArr[]=new int[size];//새로운 배열을 만들어서 홀수로 찾은 값을 배열에추가
				for(int i=0;i<arr.length;i++) {
					if(arr[i]%2==1) {
						newArr[j++]=arr[i];
					}
				}
			
			
			return newArr;
		}

}

		




	
	

