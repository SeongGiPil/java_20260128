package day3;

public class Java1_복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사칙연산
		int a=10;
		int b=3;
		System.out.println(a/b);
		double c=3;
		System.out.println(a/c);//
		
		System.err.println((double)a/b);//3.33333333333
		
		String name="홍길동";
		int age=30;
		System.out.println(name+"의 나이는 "+age+"살 입니다");
		
		int num=10;
		//num=num+3;
		num+=3;
		
		//증감연산자
		int x=10;
		int y=x++;
		int z=--x;
		
		x=10; y=10; z=10;
		
		//비교연산자 
		System.out.println(x>y);//false
		System.out.println(x>=y);//true
		System.out.println(z>5);//true
		
		System.out.println(x==z);//true
		System.out.println(x!=z);//false
		
		System.out.println(x>=y&& y>8);//true
		System.out.println(x>15||y>8);//true
		
	}

}
