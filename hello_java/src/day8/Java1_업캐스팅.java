package day8;

public class Java1_업캐스팅 {
	
	
	static void test1(Point p) {
		System.out.println(p.getX()*p.getY());
	}
	static void test1(Point3D p3) {
		System.out.println(p3.getX()*p3.getY());
	}
	
	
	
	
	
public static void main(String[] args) {
	Point point=new Point(1,2);
	ColorPoint colorpoint =new ColorPoint(10,20,"blue");
	Point3D point3d=new Point3D(1,2,3);
	PositivePoint positivepoint=new PositivePoint(5,10);
	
	
	
}
}
