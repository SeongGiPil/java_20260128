package day4;

public class Calculator {
	double pi=3.141592;
	
	Calculator(){
		System.out.println("계산기 생성!");
		
	}
			void intro() {
				System.out.println("아주 아주 좋은 계산기입니다!");
				
			}
			int abs(int x) {
				return x<0?-x:x;
//				int y;
//				if(x<0) {
//					y=-x;
//				}else {
//					y=x;
//				}
//				
//				return y;

			
			
			}
			
			int sum(int x,int y) {
				return x+y;
			}
			double sum(int x,double y) {
				return  x+y;
			}
			
			int sum(int x,int y,int z) {
			
			return x+y+z;
			}
	}

			



