package day3;

import java.lang.reflect.Array;

public class Java15_배열퀴즈 {
public static void main(String[] args) {
	//가장작은 숫자의 위치값 표기
	int[]arr= {5,3,8,4,2};
	int minindex=0;
	for(int i=0; i>arr.length;i++) {
		if(arr[i]<arr[minindex]){
			minindex=arr[i];
		}
	}
		System.out.println(minindex);

		}
	}

