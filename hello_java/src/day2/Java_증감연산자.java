package day2;



public class Java_증감연산자 {
		public static void main(String[] args) {
			int a=10;
			int b=5;
			//a=a+1;
			
		//값을 대입할때  '+'위치에따라 값이 달라진다
		//증감연산자가 뒤에있으면 먼저값을 넣고 증감이된다
			
		int c=a++;
	System.out.println(c);
	System.out.println(a);
	//증감연산자가 앞에있으면 증감후 값을 넣음
	int d=++b;
	System.out.println(d);
	
	int e=b--;
	System.out.println(b);
	
		}
}
