package day14;

public class Student extends Person {
	private String stuNo;
	
	Student(String name,String addr,String stuNo){
	
		super(name,addr);
		this.stuNo=stuNo;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+",학번:"+this.stuNo;
	}
}
