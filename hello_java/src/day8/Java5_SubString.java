package day8;

import java.util.Scanner;

public class Java5_SubString {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String input= s.next();
		for(int i=0; i<input.length();i++) {
			input.substring(0,1);
			input.substring(1);
			input=input.substring(1)+input.substring(0, 1);
			System.out.println(input);
		}

			
		
			
}
}
