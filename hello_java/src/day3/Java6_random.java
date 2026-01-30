package day3;

import java.util.Random;
import java.util.Scanner;

public class Java6_random {
public static void main(String[] args) {
	Random ran=new Random();
	Scanner s=new Scanner(System.in);
//	int a=ran.nextInt(10);//0~9
//	int b=ran.nextInt(10)+1;
//	System.out.println(a);
	
	int x=ran.nextInt(8)+2;
	int y=ran.nextInt(9)+1;
	System.out.println(x+"*"+y+"=");
	int answer=s.nextInt();
	if(x*y==answer) {
		System.out.println("정답!");
	}else {
		System.out.println("오답!");
	}
	

	}
}

