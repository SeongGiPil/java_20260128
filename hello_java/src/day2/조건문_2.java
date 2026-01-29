package day2;

import java.util.Scanner;

public class 조건문_2 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int input=s. nextInt();
		int a=10;
		if(input > a) {
			//조건을 만족할때
			System.out.println("입력값이 a보다 큽니다.");
			}else {
//				조건을 만족하지않읆때
				System.out.println ("입력한값이 a보다 작거나 같습니다.");
			}
	}
}
