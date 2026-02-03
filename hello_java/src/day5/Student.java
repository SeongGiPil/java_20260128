package day5;

public class Student {
	//클래스 복습 예제
	//변수(필드)+메소드
	
	String name;
	int age;
	String stuno;
	int money;//개인의돈
	static int money_708=200000;//708호의 회비

	// 3개의 변수를 초기화 하는 생성자
	
	 Student(String name,int age,String stuno){
		 this.name=name;
		 this.age=age;
		 this.stuno=stuno;
	 
		 
	 }
	 void study() {
		 System.out.println(this.name+"가(이) 공부를 한다");
		  }
	 void study(String subject) { //같은 이름의 메소드 사용시에는 매개변수를 구현
		 System.out.println(subject+"를 공부한다");
	 }
	 String getstuno() {
	 return this.stuno;
	 
	 
	 
	 
	 }
}
