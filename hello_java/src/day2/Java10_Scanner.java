package day2;

import java.util.Scanner;

public class Java10_Scanner {
	public static void main(String[] args) {
		//import자동=>ctrl+shift+o(알파벳)
		//값을 입력받는 용도로 스캐너사용
		int a=10; 
		Scanner s=new Scanner(System.in);
//		s.next();=>문자를 입력받는키
//		s.nextInt();=>숫자를입력받는키
		
		System.out.println("숫자를 입력해주세요");
		s.nextInt();
		int input =s.nextInt();
		System.out.println(input>=10);
		
		
		
		
		System.out.println("==프로그램 종료==");
	
	}
}