package day9;

import java.util.ArrayList;
import java.util.Scanner;

public class Java8_복습 {
public static void main(String[] args) {
	ArrayList<Integer>list=new ArrayList<>();
//	숫자를 입력받아서 5개저장
	
	//숫자의 범위는 1에서 30.그외 값 입력시 다시입력
	Scanner s=new Scanner(System.in);
	System.out.println("숫자입력");
	for(int i=0; i<6;i++) {
		System.out.println((i+1)+"번째 숫자입력");
		int input=s.nextInt();
		if(0>input||input>30) {
			System.out.println( "1~30까지 숫자입력");
			i--;
			continue;
		}else {
			list.add(input);
		}
		
	}
	System.out.println(list);
	ArrayList<Integer>oddList=new ArrayList<>();
	for(int i=0;i<6;i++) {
		if(list.get(i)%2==1) {
			oddList.add(list.get(i));
		}
	}
	System.out.println(oddList);
}
}
