package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java7 {
	
		//클래스 만드는거(변수+메소드)
	static int test() {
		System.out.println("매개변수 없는 메소드!");
		int x=10;
		int y=10;

		return x+y;
		
	};
	static void text(int x,int y) {};
	static void test(HashMap<String,Object>map) {};
	public static void main(String[] args) {
		test();
		int a=test();
		Scanner s=new Scanner(System.in);
		
		ArrayList<String>stringList=new ArrayList<>();
		while(true) {
			System.out.println("문자열입력");
			String text=s.next();
			
			if(text.toLowerCase().equals("stop")) {
				System.out.println("종료");
				break;
			}
			stringList.add(text);
	}
}
}
