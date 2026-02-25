package day17;

import java.util.Arrays;
import java.util.Scanner;

public class quiz예제문제 {
	public static void main(String[] args) {
		// 1.클래스:프로그램의 설계를 위한 설계도(ex:붕어빵기계)
		// 객체:설계도를 바탕으로 만들어낸 도면??(ex:붕어빵)
		// 상속:부모클래스의 있는 내용을 자식클래스가 이어받는것??

//		

		// 3
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			int num = s.nextInt();

			if (num < 1 || num > 100) {

				System.out.println("1~100까지의 숫자만입력하셈");
				i--;

			} else if (num % 5 == 0) {
				System.out.println("5의배수는 제외후 입력");
				i--;
			} else {
				arr[i] = num;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
	}
}