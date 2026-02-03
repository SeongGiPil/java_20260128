package day5;

public class Student_1 extends Human {
	String stuNo;
	
	void Student(String name,int age,String stuNo){
		this.name=name;
		this.age=age;
		this.stuNo=stuNo;
		
	}
	void study() {
		System.out.println(this.name+"가공부를 합니다!");
		}
}
