package day6;

import day6_ClassEX.Employee;

public class Java3_레퍼런스 {
	static void test1(String text) {
		
		
	}
	
	static void test2(Employee e) {
		
	}
public static void main(String[] args) {
	String a=new String("hello");
//	String 클래스의 a라는객체를 생성하여 전달
	//메소드에 매개변수가 있을때에는 호출할때 매개변수 넣어줘야 출력가능
	//test1에 a값을 넣어 출력가능
	test1(a);
	
	
	Employee hong=new Employee("홍길동",30,"인천","남자","1234");
	
}
}
