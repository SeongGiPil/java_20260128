package day2;

import java.util.Scanner;

public class Java23_무한루프 {
public static void main(String[] args) {
	
//	int a=1;
//	for(;;) {
//		System.out.println(a++);
//		if(a==10) {
//			break;
//			}
//		}
	Scanner s=new Scanner(System.in);
	

	
	for(;;) {
		System.out.println("숫자를 입력해주세요");
		int input=s.nextInt();
		if(input<1 ||input>100) {
			System.out.println("1부터 100사이의 값을 입력해주세요");
			}else if(input%2==0) {
				System.out.println("짝수입니다");
				break;
				}else {
					System.out.println("홀수입니다");
					break;
				}
		
	}
	}
}


