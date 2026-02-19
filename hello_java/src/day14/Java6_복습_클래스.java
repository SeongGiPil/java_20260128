package day14;

public class Java6_복습_클래스 {
	public static void main(String[] args) {
	
		Person p=new Person();


		Person p2=new Person("홍길동");	//이름:알수없음,주소:알수없음
		System.out.println(p2.toString());
		
		Person p3=new Person("김철수","인천");//이름:김철수,주소:인천
		System.out.println(p3.toString());
		
		Student s=new Student("박영희","서울",1234);
		test(s);
		System.out.println(s);
		
		Person s2=new Student("유재석","제주도",9876);
		
}
}
