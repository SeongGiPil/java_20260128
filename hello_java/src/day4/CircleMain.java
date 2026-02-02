package day4;

public class CircleMain {
	public static void main(String[] args) {
		
		Circle pizza=new Circle();
		pizza.name="자바피자";
		pizza.radius=10;
		System.out.println(pizza.getArea());
		
		
		Circle donut=new Circle();
		donut.name="자바도넛";
		donut.radius=2;
		System.out.println(donut.getArea());
		
	}

}
