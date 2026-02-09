package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Jay4_ListMap {
public static void main(String[] args) {
	//3명의 사람 정보를 입력받은후 리스트안에 저장
	//이름,나이,자바점수,html점수
	Scanner s=new Scanner(System.in);
	ArrayList<HashMap<String,Object>>list=new ArrayList<>();
	for(int i=0; i<2;i++) {
	HashMap<String,Object>map = new HashMap<>();
		System.out.print("이름:");
		String name=s.next();
		map.put("name", name);
		
		System.out.print("나이:");
		String age=s.next();
		map.put("age", age);
		System.out.println("자바:");
		String java=s.next();
		map.put("java",java);
		
		
		
		list.add(map);
		
		
		
	}
	System.out.println(list);
	for(int i=0;i<list.size();i++) {
	
		HashMap<String,Object>user=list.get(i);
		if((int)user.get("java")<60) {
			user.put("java", 60);
		}
	}
		System.err.println(list);
		
	}
	
}
