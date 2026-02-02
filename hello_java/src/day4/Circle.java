package day4;

public class Circle {
 int radius;
 String name;
 //생성자는 생략가능
 
 Circle(){}
 Circle(String name,int radius){
	 this.name=name;
	 this.radius=radius;
 }
 
 //default,public,protected,private등이 있음
 double getArea() {
	 return 3.14*radius*radius;
 }
 
}
