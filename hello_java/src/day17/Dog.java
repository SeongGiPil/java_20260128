package day17;

public class Dog extends Animal {
	
	
	public Dog(String name,int age){
		super(name,age);
	}
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
			System.out.println("이름:"+getName()+
					",나이:"+getAge()+
					"가 멍멍소리를 냅니다");
	}

		
}


	



