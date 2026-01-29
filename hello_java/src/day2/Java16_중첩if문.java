package day2;

public class Java16_중첩if문 {
public static void main(String[] args) {
	//100이상의 짝수,홀수 구분
	int num=150;
	if (num>=100){
		if(num%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
}
}
