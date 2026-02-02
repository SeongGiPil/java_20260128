package day4.classEx;

public class Class_실습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		
		Human hong=new Human(); //객체생성
		hong.name="홍길동";
		hong.age=30;
		System.out.println(hong.name);
		System.out.println(hong.age);
		hong.eat();
		String txt = hong.intro();
		System.out.println(txt);
		
		
		
		//kim객체
		Human kim=new Human();
		
		kim.name="김철수";
		System.out.println(kim.name);
		kim.speak();
		
	}

}
