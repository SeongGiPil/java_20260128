package day2;

public class java2_변수 {
	public static void main(String[] args) {
		//변수는 언제든 값 변경 가능
		double height=170.5;
		height=170.5+1; //171.5가됨
		
		//final키워드를 붙이면 값을 변경할수가 없게된다.
		//final변수는 모두 대문자로,상수라고 표현된다
		final double PI=3.14;//final은 고정,수정불가
//		PI=3.141592; final변수이므로 수정불가
		
		int number=50;
		int number2=number+10;
		
		int weight=50; //50.0
		double weight2=weight; //형변환
		
		//double이 더큰 개념이므로 int에 담는것은 원래는 불가능
		//다만 강제 형변환을 통해 가능하게 할수있음
		//이때,값의 손실이 발생한다.
		double weight3=50.5;
		int weight4=(int)weight3;
		System.out.println(weight4);
		
		
		
		
		
		
}
}
