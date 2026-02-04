package day6;

public class Java4_업캐스팅 {
	
//	object는 제약이없이 아무값만 들어올수 있음
	static void FruitBoxing(Fruit f) {
		 if(f instanceof Apple) {
			 System.out.println("토마토 서비스로드림");
		 }
	System.out.println(f.name+" 를포장한다!");
	}
	
//	static void appleBoxing(Apple a) {
//		System.out.println(a.name+"포장한다!");
//	}
//	static void BananaBoxing(Banana b) {
//		System.out.println(b.name+"포장한다!");
//	}
//	static void OrangeBoxing(Orange o) {
//		System.out.println(o.name+"포장한다!");
//	}
	public static void main(String[] args) {
		
	
	//부모클래스->Fruit
	//	자식->apple,banana,orange
	Apple apple=new Apple("청주사과",1000);
	//부모클래스->Fruit
	//	자식->apple,banana,orange
	

	
	Apple a=new Apple("청주사과",1000);
	FruitBoxing(apple);
	Banana banana=new Banana("맛있는 바나나",500);
	Orange orange=new Orange("그냥오렌지",2000);
	FruitBoxing(banana);
	FruitBoxing(orange);
	
	int arr[]=new int[5];
	Object arr2[]= {1,"zz",apple,true};
	//object에 배열을 넣게되면 문자형과 관계없이 다양한타입의 데이터를 넣을 수 있다.
	
//	Fruit a=apple;
//	Fruit b=banana;
//	Fruit o=orange;
	
	
	
	
	}
}