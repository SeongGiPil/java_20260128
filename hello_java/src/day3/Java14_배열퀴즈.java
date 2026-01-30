package day3;

public class Java14_배열퀴즈 {
public static void main(String[] args) {


int[]arr= {5,3,8,4,2};
int maxindex=0; //큰수위치  백업
for(int i=0;i<arr.length;i++) {
	if(arr[i]>arr[maxindex]) {
		maxindex=i;
	}
	
}
System.out.println(maxindex);
	}
}