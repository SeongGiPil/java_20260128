//package java8;
//
//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;
//
//public class Java99_문제풀이 {
//	public static void main(String[] args) {

//	Scanner s=new Scanner(System.in);
//	int [] arr=new int[5] ;
//	
//	for(int i=0;i<arr.length;i++) {
//		System.out.println((i+1)+"숫자입력:");
//		arr[i]=s.nextInt();
//	}
//	//0이하의 숫자인지 체크
//	if(arr[i]<1) {
//		System.out.println("1이상 숫자를 입력하셈");
//		i--;
//		continue;
//	}
//	
//	//중복값체크
//	for(int j=0; j<i;j++) {
//		if(arr[i]==arr[j]) {
//		System.out.println("중복된값이 있습니다 다시입력해주세요");	
//			i--;
//			break;
//		
//	}
//	
//	
//	System.out.println(Arrays.toString(arr));
//	
//	//7
//
//	
//	int oddsum=0;
//	int evensum=0;
//	
//	for(int i=0;i<arr.length;i++) {
//		if(arr[i]%2==0) {
//			evensum+=arr[i];
//		}else {
//			oddsum+=arr[i];
//		}
//	
//	
//	 System.out.println("홀수합:"+oddsum);
//	 System.out.println("짝수합:"+evensum);
//	 System.out.println((Math.abs(evensum-oddsum)));
//	} 
//	//8
//		Scanner s=new Scanner(System.in);
//		Random ran=new Random();
//		while(true) {
//			System.out.print("[1. 구구단 풀기, 2. 종료] : ");
//			int menu = s.nextInt();
//			if(menu == 1) {
//				// 구구단 풀기
//				while(true) {
//					System.out.print("[1. 쉬움(2~5단), 2. 보통(6~9단), 3. 어려움(12~19단)] : ");
//					menu = s.nextInt();
//					if(menu >= 1 && menu <= 3) {
//						// 구구단 시작
//						int count = 0;
//						for(int i=1; i<=5; i++) {
//							int x;
//							if(menu == 1) {
//								x = ran.nextInt(4)+2; // 2~5
//							} else if(menu == 2) {
//								x = ran.nextInt(4)+6; // 6~9
//							} else {
//								x = ran.nextInt(8)+12; // 12~19
//							}
//							int y = ran.nextInt(9)+1;
//							System.out.print(i + "번 " + x + " * " + y + " = ");
//							int answer = s.nextInt();
//							if(answer == x*y) {
//								System.out.println("정답!");
//								count++;
//							} else {
//								System.out.println("땡! 정답은 " + (x*y) + " 입니다.");
//							}
//						}
//						System.out.println("총 " + count + "개 맞추셨습니다.");
//						break;
//					} else {
//						System.out.println("난이도 1~3중에 선택하셈");
//					}
//				}
//				
//				
//			} else if(menu == 2) {
//				// 종료
//				System.out.println("종료되었습니다.");
//				break;
//			} else {
//				// 다시 입력
//				System.out.println("1~2중에 선택하셈");
//			}
//		}
//		
//	}
//
//}
package day8;


	
		


	
	

