package day4;

public class Calc {
public static void main(String[] args) {
	Calculator calc=new Calculator();
	
	calc.intro();
	int a=calc.abs(-10);
	int b=calc.sum(5, 10);
	int c=calc.abs(99);
	calc.sum(5, 10.8);
	
}
}