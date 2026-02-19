package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Java3_복습배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//랜덤한 숫자 1~10까지 arr배열에 넣기.
		//중복된 숫자x
		
		Random ran=new Random();
		ArrayList<Integer>list=new ArrayList<>(); //배열을 담을 리스트를 생성
		int arr[]=new int [10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=ran.nextInt(10)+1;
			if(list.contains(arr[i])) { //리스트에 포함여부체크
				i--;			//다시 앞연산으로 돌아감
				continue;
			}
			list.add(arr[i]);
			}
		
		System.out.println(Arrays.toString(arr));
		
	}
}


