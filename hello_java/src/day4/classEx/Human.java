package day4.classEx;

public class Human {
	//변수(필드)영역
		String name;
		int age;
		double height;
		boolean isMarried;
		
		//생성자
		//따로선언 안하면 기본으로 하나 만들어짐
		//클래스이름과 동일한 메소드
		//생성자는 리턴없음(리턴타입 선언 안함) 
		//객체 만들 떄 꼭 한번 실행 된다
		//객체를 초기화하는 용도로 사용된다.
		 
		Human(){}
		Human(String name,int age,double height,boolean isMarried){
			this.name=name;
			this.age=age;
			this.height=height;
			this.isMarried=isMarried;
		}
	//메소드 영역
	void eat() {
		System.out.println("밥먹었다!");
	}
	void speak() {
		System.out.println("말했다!");
		}
	String intro() {
		return("이름은"+name+",나이는 "+age);
	
	}
	
	
	
	}
	

