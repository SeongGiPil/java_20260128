package day3;

public class Java3_문제 {
	public static void main(String[] args) {
		//구구단을 역순으로 출력
	
	
	for(int x=9;x>=2; x--) {
		System.out.println("======="+x+"단"+"=====");
	for(int  y=1;y<=9;y++) {
		System.out.println(x+"*"+y+"="+(x*y));
	}
	}
}
}