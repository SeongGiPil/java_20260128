package day3;

import java.util.Random;
import java.util.Scanner;

public class Java7_랜덤구구단 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran=new Random();
		Scanner s=new Scanner(System.in);
		//5문제를 다푼후 
		//몇문제를 맞췄는지 알림
		//"총 몇문제 맞추셧습니다"
		int count=0;//정답의개수
		for(int i=1; i<=5;i++) {
			int x=ran.nextInt(8)+2;
			int y=ran.nextInt(9)+1;
			System.out.println("["+i+"번문제]");
			System.out.println(x+"*"+y+"=");
			int answer=s.nextInt();
			if(answer==(x*y)) {
				System.err.println("정답");
				count++;
			}else {
				System.out.println("오답");
			}
			
		}System.out.println("총"+count+"문제 맞추셨습니다");
			
		
	}

}
