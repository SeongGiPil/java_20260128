package day2;

import java.util.Scanner;

public class Java18_for문 {
public static void main(String[] args) {
	//for문
	//for(선언부;조건식;증감식) 
	
	Scanner s=new Scanner(System.in);
	System.out.println("숫자를 입력해주세요");
	int input=s.nextInt();
	int sum=0;
	for(int i=0;i<=input;i++) {
		sum=sum+i;
		
	}
	System.out.println("1부터"+input+"까지의합은"+sum+"입니다");
	}
}

