package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Java1_과일가게 {
	static Scanner s = new Scanner(System.in);

	static HashMap<String, Object> searchFruit(ArrayList<HashMap<String, Object>> list, String name) {

		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Object> fruit = list.get(i);
			if (fruit.get("name").equals(name)) {

				return fruit;

			}
		}
		return null;
	}
	public static void main(String[] args) {

		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
				while (true) {
					try {
		                System.out.println("[1.과일등록  2.가격수정  3.판매  0.종료]");
		                int menu = s.nextInt();

		                if (menu == 0) break;

		                if (menu == 1) {
		                    System.out.print("과일이름: ");
		                    String name = s.next();

		                    HashMap<String, Object> fruit = searchFruit(list, name);

		                    if (fruit != null) {
		                        System.out.print("추가할 개수: ");
		                        int count = s.nextInt();
		                        fruit.put("count", (int) fruit.get("count") + count);
		                    } else {
		                        HashMap<String, Object> map = new HashMap<>();
		                        map.put("name", name);

		                        System.out.print("개수: ");
		                        map.put("count", s.nextInt());

		                        System.out.print("가격: ");
		                        map.put("price", s.nextInt());

		                        list.add(map);
		                    }

		                } else if (menu == 2) {
		                    System.out.print("과일이름: ");
		                    String name = s.next();

		                    HashMap<String, Object> fruit = searchFruit(list, name);

		                    if (fruit != null) {
		                        System.out.print("새 가격: ");
		                        fruit.put("price", s.nextInt());
		                    } else {
		                        System.out.println("없는 과일입니다");
		                    }

		                } else if (menu == 3) {
		                    System.out.print("과일이름: ");
		                    String name = s.next();

		                    HashMap<String, Object> fruit = searchFruit(list, name);

		                    if (fruit != null) {
		                        System.out.print("구매 개수: ");
		                        int count = s.nextInt();

		                        int remain = (int) fruit.get("count") - count;
		                        if (remain < 0) {
		                            System.out.println("재고 부족");
		                        } else {
		                            fruit.put("count", remain);
		                            System.out.println("판매 완료");
		                        }
		                    } else {
		                        System.out.println("해당 과일 없음");
		                    }
		                }

		                System.out.println("현재 재고: " + list);

		            } catch (InputMismatchException e) {
		                System.out.println("숫자만 입력하세요");
		                s.next();
		            }
		        }
		    }
		}
		
			
				
			
	

		
		
