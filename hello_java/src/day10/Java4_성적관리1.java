package day10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
	
public class Java4_성적관리1 {
public static void main(String[] args) {
	ArrayList<Student>list=new ArrayList<>();
	//3명의 학생을 list에추가
//	학번,이름,나이를 입력받아서 student객체로만들고 list에추가
	try {
		Scanner s=new Scanner(System.in);
		for(int i=0;i<3;i++) {
		
		System.out.println("이름:");
		String name=s.next();
		System.out.println("나이:");
		int age=s.nextInt();
		System.out.println("학번:");
		String stuNo=s.next();
			Student stu=new Student(stuNo,name,age);
			list.add(stu);
		}
	
	} catch (InputMismatchException e) {
		// TODO: handle exception
		System.out.println("숫자입력");
	}
	
		
		System.out.println(list);
	}
}






