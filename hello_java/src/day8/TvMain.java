package day8;

public class TvMain {
	public static void main(String[] args) {
		   ColorTv myTV = new ColorTv(32,1024);
		   myTV.printProperty();
		   
		
		   IpTv iptv = new IpTv("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32인치, 2048컬러
		   iptv.printProperty();
//}
	}
}