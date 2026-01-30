package day3;

public class Java4_while문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(선언부;조건식;증감식)
		//while(조건),선언은 밖,증감은 안쪽에 존재
		//		for(int i=1; i<=10; i++)
		int i=2;
		while(i<=9) {
			System.out.println("==="+i+"단===");
			
			
			int j=1;
			while(j<=9) {
				System.out.println(i+"*"+j+"="+(i*j));
				j++;
			}
			i++;
		}
		

	}

}
