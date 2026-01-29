package day2;

public class Java19_반복문퀴즈 {
	public static void main(String[] args) {
		
	
//for+if문퀴즈
////1.1부터 100까지의 3의배수만 출력
//		
//for(int i=1;i<100;i++) {
//	if(i%3==0) {
//		
//		System.out.println(i);	
//			}
//		}
	


//2.10부터 1까지 숫자출력
//for(int i=10;i>=1;i--) {
//System.out.println(i);	
//}
//3 1부터 100까지 숫자중 홀수들의 합과 짝수들의 합을 구하라
		int oddsum=0;
		int evensum=0;
		for(int i=1; i<100;i++) {
		
	if(i%2==1) {
		oddsum+=i;
		
	}else {
		evensum+=i;
	}
		}
	System.out.println("홀수합:"+oddsum);
	System.out.println("짝수합:"+evensum);
	
	
	}
	}

