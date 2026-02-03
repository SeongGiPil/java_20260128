package day5;

public class Fruit {
	private String name;
	private int Price;
	private int count;
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
	public void setPrice(int price) {
		this.Price = price;
	}

	Fruit(String name,int price,int count){
		this.name=name;
		this.Price=price;
		this.count=count;
		}
	
	public void setprice(int price) {
		if(price<100) {
			System.out.println("가격을 다시확인해주세요!!");
		}else {
			this.Price=price;
	}
		public int getPrice() {
			return this.price;
		}
	
}
}