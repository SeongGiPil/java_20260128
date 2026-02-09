package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java5_성적관리프로그램 {
		static Scanner s=new Scanner(System.in);
	public static int inputNumber(int first,int last) {
		int result=0;
		while(true) {
		int input=s.nextInt();
		if(input<first||input>last) {
		System.out.println(first+"~"+last+"사이값을 다시입력해주세요");
		}else {
		return input;
	}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		==[1.학생추가,2.성적입력,3.성적확인,4.종료]==
		Boolean studentFlg=false;
		ArrayList<HashMap<String,Object>> list=new ArrayList<>();
		while(true) {
			System.out.println("[1.학생추가,2.성적입력,3.성적확인,4.종료]:");
			int menu=s.nextInt();
			if(menu==1) {
				//학생추가
				HashMap<String,Object>map=new HashMap<>();
				System.out.print("이름:");
				String name=s.next();
				map.put("name", name);
				
				System.out.print("나이:");
				String age=s.next();
				map.put("age", age);
				list.add(map);
			}else if(menu==2) {
				//성적입력{java,oracle,html}
				System.out.println("성적을 입력할 학생의 이름 입력");
				String name=s.next();//문자열 입력받을때는 next();
			
				for(int i=0;i<list.size();i++) {
//					if(list.get(i).get("name").equals(name)) {
//						
					HashMap<String,Object>student=list.get(i);
					if(student.get("name").equals(name)) {
						  studentFlg = true;
						System.out.println("자바:");
						int java=inputNumber(0,30);
						student.put("java",java);
						System.out.println("오라클:");
						int oracle=inputNumber(0,50);
						student.put("oracle", oracle);
								
						System.out.println("html:");
						int html=inputNumber(0,50);
								student.put("html", html);	
						break;
					}	
			}
				if(!studentFlg) {
					System.out.println("해당이름 학생없습니다");
				}
				if(menu==3) {
				//성적확인
//				1.이름 입력받기
				//2.해당이름 가진 map이없으면
				//있으면 성적출력
				System.out.println("성적을 확인할 학생의 이름 입력");
				String name1=s.next();
				boolean studentflg=false;
				for(int i=0;i<list.size();i++) {
					HashMap<String,Object>student=list.get(i);
					if(student.get("name").equals(name1)) {
						studentflg=true;
						if(!student.containsKey("java")) {
							System.out.println("성적점수가 입력안됐습니다");
						}else{
						
					System.out.println(name1+"의 점수");
						
					System.out.println("자바:"+student.get("java")+",");
					System.out.println("오라클:"+student.get("oracle")+",");
					System.out.println("html:"+student.get("html")+",");
				
						
					break;
				}
		
				}
					
					
			if(!studentFlg) {
				System.out.println("해당이름 학생없습니다");
			}
			
			
			
					
				
				else if(menu==4) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("1~4중에 선택하셈");
			}
				}
				}
		}
		}
	}
}
	

	
