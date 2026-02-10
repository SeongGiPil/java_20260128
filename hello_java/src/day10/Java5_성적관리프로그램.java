package day10;

import java.nio.file.attribute.AclEntry;
import java.util.ArrayList;
import java.util.Scanner;

public class Java5_성적관리프로그램 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
	
		ArrayList<String>stuNoList=new ArrayList<>();
			
		// 1번메뉴->학생추가,2번메뉴->성적입력, 3번메뉴->성적조회
		while (true) {
			 Scanner s = new Scanner(System.in);
		
			try {
				System.out.println("[1.학생추가2.성적입력,3.성적조회4.종료]");
				int menu = s.nextInt();
				if (menu == 1) {
					Boolean stuNoFlg=true;
					String stuNo="";
					while(stuNoFlg) {
						System.out.println("학번:");
						 stuNo=s.next();
						 if (stuNoList.contains(stuNo)) {
	                            System.out.println("중복된 학번이 있습니다!");
	                        } else {
	                            break;
	                        }
	                    }
						
					
					System.out.println("이름:");
					String name = s.next();
					System.out.println("나이:");
					int age = s.nextInt();
					
					Student stu=new Student(stuNo,name,age);
				
					list.add(stu);
					System.out.println(list);
				}
				
				else if (menu == 2) {
					// 학번을 입력받아서 해당학번 학생의 자바,오라클,html
					// 입력받아서 저장
					// 해당하는 학번없을경우 "해당학번을가진 학생이 없습니다"출력
					Boolean stuFlg = false;
					System.out.println("학번 입력:");
					String stuNo=s.next();
					for (int i = 0; i < list.size(); i++) {
						Student stu = list.get(i);
						if (stuNo.equals(stu.getStuNo())) {
							stuFlg = true;
							System.out.println("자바:");
							int java = s.nextInt();
							stu.setJava(java);
							System.out.println("오라클");
							int oracle = s.nextInt();
							stu.setOracle(oracle);
							System.out.println("html");
							int html = s.nextInt();
							stu.setHtml(html);
						
						}
					}
				
					if (!stuFlg) {
						System.out.println("해당이름의 학생이없습니다");
					}
				}
				

				else if (menu == 3) {
					// 모든 학생의 정보 출력
					// 학번: 이름: 자바: 오라클: html
					for (int i = 0; i < list.size(); i++) {
						Student stu = list.get(i);
						System.out.print("학번:" + stu.getStuNo() + ",");
						System.out.print("이름:" + stu.getName() + ",");
						System.out.print("나이:" + stu.getAge() + ",");
						System.out.print("자바:" + stu.getJava() + ",");
						System.out.print("오라클:" + stu.getOracle() + ",");
						System.out.print("html:" + stu.getHtml());
						System.out.println();
					}

				}

				else if (menu == 4) {
					System.out.println("종료되었습니다");
					break;
				}

			} catch (Exception e) {
				System.out.println("오류발생");
				s.next();
			}
			}
			
		}
	}




