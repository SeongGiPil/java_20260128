package day2;

public class JAVA_논리연산자 {
 public static void main(String[] args) {
	//and,or(||)
	 //and=>둘다 만족(true)했을때 true
	 //or=>둘중하나라도 만족(true)하면 true
	 
	 System.out.println(true&&true);//true
	 System.out.println(true&&false);//false
	 System.out.println(true||true);//true
	 System.out.println(true||false);//true
	 
	 int a=10;
	 int b=5;
	 System.out.println(a>b && a>10);//false
	 System.out.println(b>8||a>8);//true
	 System.out.println(a>1&&b>3);//true
	 //or는 둘다 true여야 true
	 //and연산자는 둘중 하나만 true여도 true
	 
	 
	 
	 System.out.println(a>=10||b>3);//true
	 
}
}
