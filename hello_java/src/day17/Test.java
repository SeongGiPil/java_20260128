package day17;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
	
			
			HashMap<Integer,Integer>map=new HashMap<>();
			for(int i=1;i<=20;i++) {
				map.put(i,0);
			}
			Random ran=new Random();
				
				int arr[]=new int [20];
			for(int i=0;i<arr.length;i++) {
				arr[i]=ran.nextInt(20)+1;
				if(map.get(arr[i]) > 2) {
				i--;
				continue;
				
				}
				map.put(arr[i], map.get(arr[i])+1);
			}
			System.out.print("배열에 없는 숫자:");
			for(int i=1;i<=arr.length;i++) {
				if(map.get(i)==0) {
					System.out.print(i+" ");
				}
			}
			
				System.out.println(Arrays.toString(arr));
				
				System.out.println(map);
					
				}
		}

