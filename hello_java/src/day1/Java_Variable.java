package day1;

public class Java_Variable {
public static void main(String[] args) {
	//변수는 정보를 담는 공간
//	이름:"홍길동";=>문자열은 string 으로 표현 값을 담을 때는 equal(=)를 사용
	//정수는 int로표현
	String 이름="홍길동";
	System.out.println("이름");//이름이 출력된다
	System.out.println(이름); //홍길동이 출력된다
	int 나이=30;
	//정수는 int or long, int는 -21억~21억
	System.out.println(나이);
	String 성별="남자";
	boolean 결혼여부=false; //true나 false만들어갈수있음
	
	
//	성별:남자
//	결혼여부:true or false
//	키:170.5=>실수(소수점 있는 숫자)는 double
	double 키=170.5;
	System.out.println(키);


//변수는 변수이름 앞에 데이터의 타입이 붙어야한다.
//[문자:string][정수:int],[실수:double]
//[참,거짓:boolean]
//char,byte,float등도 있음
//변수이름은 영어로,직관적으로 표현
String name="홍길동";
int age=30;
double height=170.5;
boolean isMarried=false;
//변수이름은 첫글자는 소문자,카멜(camel)표기법 권장
//카멜 표기법은 2개이상의 단어가 조합될때
//두번째 단어부터 첫글자를 대문자로함
//ex(학번:Student+Number)=>studentNumber or stuNumberInfo
String gender;//변수선언
gender="남자";//값 초기화

String gender2="여자";//변수 선언과 동시에 초기화함

//변수안에 들어간 값은 언제든 변경가능
}//class
}//main

