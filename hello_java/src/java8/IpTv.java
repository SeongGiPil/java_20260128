package java8;

public class IpTv extends ColorTv {
	String ip;
	IpTv(String ip,int size,int color){
		super(size,color);
		this.ip=ip;
	}
	@Override
	public void printProperty() {
		// TODO Auto-generated method stub
		System.out.print("나의 Iptv"+"주소의");
		super.printProperty();
	}
	
	
}

