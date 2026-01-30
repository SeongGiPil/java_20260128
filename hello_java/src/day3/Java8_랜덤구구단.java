package day3;

import java.util.Random;
import java.util.Scanner;

public class Java8_랜덤구구단 {
	public static void main(String[] args) {
		Random ran=new Random();
		Scanner s=new Scanner(System.in);
		
		//2가지형태
		//1.사용자가 풀이하고싶은 문제수를 직접 정하도록
		//2.문제풀이가 끝난 후 다시 풀이 말지 사용자가 결정
		//문제수를 선택해주세요
		System.out.println("====랜덤구구단====");
		while(true) {//while문사용
		System.out.print("[(1).구구단시작 (2)종료]:");
		int menu=s.nextInt();
		if(menu==1) {
			int count=0;//정답개수 체크용
			System.out.println("문제수를 입력해주세요:");
			int num=s.nextInt();//문제수입력
				
		for(int i=1;i<=num;i++) {
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
		}
	
	System.out.println("총"+count+"문제 맞추셨습니다");
	
	}else if(menu==2) {
		System.out.println("종료되었습니다");
		break;
	}else {
		System.out.println("메뉴는 1과 2중에서 선택해주세요.");
}
}
	}
}

