package day2;

import java.util.Scanner;

public class Java24_quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.사용자가 입력한 숫자의 구구단을 출력
//2.2~9의 값이아니면 다시입력
		Scanner s=new Scanner(System.in);
		for(;;) {
		System.out.println("숫자를 입력해주세요");
		int input=s.nextInt();
		if(input >=2 && input<=9) {
			System.out.println("======"+"단"+"=======");
			for(int i=1;i<=9;i++) {
				System.out.println("==="+"단"+"===");		
			System.out.println(input+"*"+i+"="+(input*i));
			}
		break;
			}else {
		System.out.println("숫자를 다시 입력해주세요");
		}
		

			

}	

	}
}

