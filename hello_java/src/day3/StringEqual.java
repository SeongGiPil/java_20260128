package day3;

import java.util.Scanner;

public class StringEqual {
	public static void main(String[] args) {
		
		//고블린 객체
		//체력,공격력
		//객체이름.체력,객체.공격력
		//믄자열 비교는 equals메소드를 사용해야 한다.
		Scanner s=new Scanner(System.in);
		String menu=s.next();
		if(menu.equals("y")) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		} 
		
	}
}
