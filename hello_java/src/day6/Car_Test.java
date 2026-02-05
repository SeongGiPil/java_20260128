package day6;

public class Car_Test{
	private String name;
	private String color;
	private int speed;
	Car_Test(){
		this("기본차","하얀색",0);
	}
	
	Car_Test(String name,String color,int speed){
		this.name=name;
		this.color=color;
		this.speed=speed;
	}
	void setInfo(String name,String color,int speed) {
		this.name=name;
		this.color=color;
		this.speed=speed;
	}
	void carInfo(){
		System.out.println("자동차의 이름은"+this.name+"색상은"+this.color+"입니다");
	}
	void speedUp(int speed) {
	this.speed+=speed;
	if(this.speed>200) {
		System.out.println(" 200 이상의 속도는 불가합니다. 200으로 변경됩니다.");
		this.speed=200;
	}
	

	}
	
	void speedDown(int speed) {
		this.speed-=speed;
	}

	public int getSpeed() {
		return speed;
	}
}
