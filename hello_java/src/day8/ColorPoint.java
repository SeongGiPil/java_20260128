package day8;

public class ColorPoint extends Point {




private String color;


public ColorPoint(int x, int y, String color) {
		// TODO Auto-generated constructor stub
	super(x,y);
	this. color=color;
	}


void setXY(int x,int y) {
	super.move(x,y);
}
void setColor(String color) {
	this.color=color;
}

	
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.color+"색의("+getX()+","+getY()+")의점";
	}
}
