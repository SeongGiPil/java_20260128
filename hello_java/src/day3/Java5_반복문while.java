package day3;

import java.util.Scanner;

public class Java5_반복문while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while무한루프
		//입력되는 숫자를 더하기
		//단 -1을 만나면 더한값을 출력하고 종료하시오
		int sum=0;
		int count=1;
		Scanner s=new Scanner(System.in);
		while(true){
		
		System.out.println(count+"번째숫자를 입력:");
		int input=s.nextInt();
		if(input !=-1) {
			sum+=input;
			
		}else {
			break;
		}
		count++;
		}
			System.out.println("숫자들의 합:"+sum);
			
		
		}
	}


