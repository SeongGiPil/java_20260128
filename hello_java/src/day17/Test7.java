package day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import day4.User;

public class Test7 {
	static Scanner s = new Scanner(System.in);

	public static int checkNumber(String text) {
		while (true) {
			System.out.println(text);
			int number = s.nextInt();
			if (number < 0) {
				System.out.println("음수는 불가합니다.다시입력해주세요");
			} else {
				return number;
			}
		}
	}

	public static void main(String[] args) {

		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		System.out.println("====포인트관리프로그램=====");
		while (true) {
			System.out.println("[(1)등록(2).적립(3).차감(4).확인,(5)종료]:");
			int menu = s.nextInt();
			if (menu == 1) {
				HashMap<String, Object> User = new HashMap<>();
				System.out.println("이름");
				String name = s.next();
				boolean flg = true;
				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).get("name"))) {
						System.out.println("이미등록된 사용자입니다");
						flg = false;
						break;
					}
				}
				if (flg) {
					int age = checkNumber("나이:");

					User.put("name", name);
					User.put("age", age);
					User.put("point", 0);
					list.add(User);
					System.out.println(list);
				}

			} else if (menu == 2) {
				System.out.println("이름");
				String name = s.next();
				boolean flg = true;
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> User = list.get(i);
					if (name.equals(list.get(i).get("name"))) {
						int point = checkNumber("적립할포인트");
						User.put("point", (int) User.get("point") + point);

						flg = false;
						break;
					}
				}
			} else if (menu == 3) {
				System.out.println("이름");
				String name = s.next();
				boolean flg = true;
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> User = list.get(i);
					if (name.equals(User.get("name"))) {
						flg = false;
						int point = checkNumber("차감할포인트");
						if ((int) User.get("point") < point) {
							System.out.println("차감할수있는 포인트는 " + User.get("point") + "입니다");
						}	else {	
			                User.put("point", (int) User.get("point") - point);
			                System.out.println("차감완료");
							
						}
							flg=false;
							break;
						

					}
					 if (flg) {
		                    System.out.println("존재하지 않는 사용자입니다");
		                }
				}
			} else if (menu == 4) {
				System.out.println("이름");
				String name = s.next();
				boolean flg = true;
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> User = list.get(i);
					if (name.equals(list.get(i).get("name"))) {
						System.out.println(User.get("name") + "님의 현재포인트는" + User.get("point") + "입니다");

						break;

					}
				}

			}
		}
	}
}
