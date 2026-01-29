package day2;

import java.util.Scanner;

public class 조건문3 {
	public static void main(String[] args) {
		System.out.println("점수를 입력해주세요.");
		Scanner s=new Scanner(System.in);
		int score= s.nextInt();
	
			if(score>=90) {
				System.out.println("A학점입니다");
			}else if(score>=80) {
				System.out.println("B학점입니다");
			}else if(score>=70) {
				System.out.println("c학점입니다");
			}else {
				System.out.println("F학점입니다");
			}
	}

}
