package day9;

import java.util.ArrayList;

public class Java1_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(4);
		list.add(6);
		System.out.println(list);
		ArrayList<Object>list2=new ArrayList<Object>();
		list2.add("홍길동");
		list2.add(122);
		list2.add(true);
		
		for(int i=0; i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		
	}
}
