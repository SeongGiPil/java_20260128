package day7;

public class Person {
	private String name;
	private int age;
	private String phone;
Person(String name,int age){
	this(name, age, "");
//	this.name=name;
//	this.age=age;
}
Person(String name,int age,String phone){
	this.name=name;
	this.age=age;
	this.phone=phone;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
//	return this.name+"의 나이는"+this.age+"살입니다";
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
	


}
