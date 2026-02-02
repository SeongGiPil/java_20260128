package day4;

public class Java5_Method {
	
	static void method1() {
		//메소드중 void형태는 결과값을 돌려주지않는 형태이다.
		System.out.println("첫번째메소드 호출!");
	}
	
	static int method2() {
	//리턴이있는 메소드(결과를 되돌려주는 형태)
		//int형은 결과값을 돌려주는형태
		return 100;
	}
	static int sum(int a,int b) {
//		int c=a+b;
//		return c;
		return a+b;
	}
	//리턴이없는 메소드
	public static void main(String[] args) {
		//메소드는 단순히 호출하고 끝나는 형태
		//결과를 되돌려주는 형태
		
		method1();//method1호출
		int value=method2();//100을돌려받는다 
		System.out.println(value);//value 값은 100을 돌려받는다.
		
	int result=	sum(3,5);//괄호안에 있는 2개숫자를 더헤서 리턴받고 싶다!
			System.out.println(result);
		
	int result2=sum(100,200);
	System.out.println(result2);
	
	}
}
