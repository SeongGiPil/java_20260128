package day17;

public class Car implements CarManager {
	private String kind;
	private int speed;
	private String color;
	
	Car(String kind,int speed,String color){
		this.kind=kind;
		this.speed=speed;
		this.color=color;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return"차종류는"+kind+",색은"+color+"입니다";
	}
	
	
	
	@Override
	public void speedup(int speed) {
		// TODO Auto-generated method stub
		if(this.speed>200) {
			this.speed=200;
	}
	}

	@Override
	public void SpeedDown(int speed) {
		// TODO Auto-generated method stub
		if(this.speed<0) {
			this.speed=0;
		}
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return this.speed;
	}
}


