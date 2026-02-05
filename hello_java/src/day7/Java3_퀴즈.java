package day7;

import java.util.Random;
import java.util.Scanner;

public class Java3_퀴즈 {
	public static void main(String[] args) {
		Random ran=new Random();
		Scanner s=new Scanner(System.in);
		
		while(true) {
			int cnt=0;//정답수 체크용
		System.out.println("문제수를 입력해주세요:");
		int num=s.nextInt();//문제수출력
			for(int i=1;i<=num;i++) {
				int x=ran.nextInt(8)+2;
				int y=ran.nextInt(9)+1;
				System.out.println(x+"*"+y+"=");
				int answer=s.nextInt();
				if(answer==(x*y)) {
					System.out.println("정답입니다");
					cnt++;
				}else {
					System.out.println("틀렸습니다");
					
			}
				
		}
			System.out.println("총"+num+"문제중"+cnt+"개 정답");
			System.out.println("계속할래?아니면 다른거 입력하셈");
			if(s.nextInt()==0) {
				break;
			}
	}
		System.out.println("종료되었습니다");
	}
}
