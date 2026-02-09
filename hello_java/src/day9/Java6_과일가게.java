package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java6_과일가게 {
	
	static Scanner s=new Scanner(System.in);
	public static int inputNumber(int first,int last) {
		int result=0;
		while(true) {
		int input=s.nextInt();
		if(input<first||input>last) {
		System.out.println(first+"~"+last+"사이값을 다시입력해주세요");
		}else
			break;
		}	
		return result;
	}
	
	public static void main(String[] args) {

	

		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("[1.과일등록,2.과일판매3.가격수정,4.종료]");
		int menu = s.nextInt();
		if (menu == 1) {
			// 1.과일등로
//			과일이름(name),개수(count),가격(price)을 입력받아서
//			map에저장후 리스트에추가
//			동일한이름의 과일이 있을경우
			//가격은 물어보지않고,개수만입력받아서 기존개수만더함
			while(true) {
			HashMap<String, Object> fruit=new HashMap<>();
			Boolean frultFlg=false;
			System.out.println("과일이름");
			String name=s.next();
			for(int i=0;i<list.size();i++) {
				HashMap<String,Object>map=list.get(i);
				if(map.get("name").equals(name)) {
					frultFlg=true;
					System.out.println("개수:");
					int count=inputNumber(1,200);
					map.put("count",(int)map.get("count")+count);
					break;
				}
			}
				if(!frultFlg) {
					fruit.put("name",name);
					System.out.println("개수:");
					int count=inputNumber(1,200);
					fruit.put("count",count);
					System.out.println("가격");
					int price=inputNumber(100,10000);
					fruit.put("price",price);
					list.add(fruit);
				}
			}
					
				
			
			
		}else if (menu == 2) {

		} else if (menu == 3) {

		} else if (menu == 4) {
		}
	}
}
	


	
