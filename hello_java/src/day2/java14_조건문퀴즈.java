package day2;

import java.util.Scanner;

public class java14_조건문퀴즈 {
	public static void main(String[] args) {
		//숫자를 1개 입려받아서 
		//홀수면 '홀수입니다',짝수면 '짝수입니다.'출력
		//다만 1~100사이의 값을 입력해주세요 출력
		Scanner s=new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int input=s.nextInt();
		if(input<1 ||input>100) {
			System.out.println("1부터 100사이의 값을 입력해주세요");
			}else if(input%2==0) {
				System.out.println("짝수입니다");
				}else {
					System.out.println("홀수입니다");
				}
			
	}

}
