package day9;

import java.util.HashMap;

public class Java2_Map {

	public static void main(String[] args) {
		HashMap<String,Object>hong=new HashMap<>();
		hong.put("name", "홍길동");
		hong.put("자바",90 );
		hong.put("oracle", 95);
		hong.put("html", 80);
		System.out.println(hong);
		//json
		HashMap<String,Object>kim=new HashMap<>();
		kim.put("name","김철수");
		kim.put("java",90);
		kim.put("oracle",90);
		kim.put("html", 80);
		System.out.println(kim.get("java"));
		
		
	}
}
