package day14;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Java8_컬렉션 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		HashMap<String,Object> map=new HashMap<>();
		
		//나이를 잘못입력(ex 문자입력의경우)
		//안내문구후 나이만 다시입력
		System.out.print("이름");
		String name=s.next();
		System.out.println("주소:");
		String addr=s.next();
		map.put("name", name);
		map.put("addr", addr);
		while(true) {
		try {
			System.err.println("나이");
			int age=s.nextInt();
			map.put("age", age);
			
			break;
			}catch(Exception e) {
				System.out.println("나이에는 숫자를 입력");
				s.next();
		}
		
		
			
		
	
		System.out.println(map);
		
		
		
		
		
//		map.put("name", "홍길동");
//		map.put("addr", "인천");
//		map.put("age",30);
//		System.out.println(map);
//		map.put("age", (int)map.get("age")+1);
//		System.out.println(map);
		
	}
}
}
