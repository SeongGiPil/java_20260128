package day4;

public class Java6_Math클래스 {
	public static void main(String[] args) {
		int arr[]= {-5,-3,10,-9,6};
		//배열안에 있는 모든숫자를 양수로 변경
		//음수인 숫자들을 양수로 (-3->3)
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
		arr[i]=Math.abs(arr[i]);//절대값으로변경
		if(Math.abs(arr[i])>max){//절대값중 가장 큰값을찾음
			max=Math.abs(arr[i]);
			}
		}
			
		
				
				
			}
		}
