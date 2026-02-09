package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java12_리스트맵 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<HashMap<String,Object>>list=new ArrayList<>();
		
//		2명의사람정보입력해서 리스트에 저장
//		이름(name),나이(age)
		for(int i=0;i<3;i++) {
			HashMap<String,Object>map=new HashMap<>();
			System.out.println("이름");
			String name=s.next();
			map.put("name", name);
			System.out.println("나이");
			int age=s.nextInt();
			map.put("age", age);
			
			
				list.add(map);	
		}
		System.out.println(list);
		//리스트가 있는 맵에서 나이가 25이상인 맵에
		//나이를 +1 하기
		
		for(int i=0;i<list.size();i++) {
			HashMap<String,Object>map=	list.get(i);
			map.get("age");
			if((int)map.get("age")>=25) {
				map.put("age",(int)map.get("age")+1);
			}
		}
		System.out.println(list);
	}

}
