package day18;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class 수도퀴즈 {
	public static void main(String[] args) {
		
		Random ran=new Random();
		Scanner s=new Scanner(System.in);
		CapitalQuiz  obj=new CapitalQuiz();
		ArrayList<Quiz>quizList=obj.getList();
		ArrayList<String>questionList=new ArrayList<>();
		ArrayList<Integer>selectList=new ArrayList<>();
		int Num=0;
		while(true) {
		System.out.println("원하는 문제수를 입력햐세요");
		Num=s.nextInt();
		if(Num>quizList.size()||Num<3) {
			System.out.println("최대문제수는 "+quizList.size()+",최소 문제수는 3문제입니다");
			continue;
		}
		break;
		}
		
		for(int i=1;i<=Num;i++) {
			
			int ranNum=ran.nextInt(quizList.size());
			Quiz quiz=quizList.get(ranNum);
			if(questionList.contains(quiz.getCountry())) {
				i--;
				continue;
			}
			int ranIndex=ran.nextInt(4);//리스트의 정답위치를 표시하는 ranindex
				for(int j=0;j<4;j++) {
					int index=ran.nextInt(quizList.size());
					if(ranIndex==j) {
						selectList.add(ranNum);
					}else if(selectList.contains(index)||index==ranNum) {
						j--;
						
					}else {
						selectList.add(j,index);
					}
			}
	
	
	
		System.out.println(i+")"+quiz.getCountry()+"수도:");
		for(int j=0;i<4;j++) {//리스트에있는 index를 기준으로 보기가작성됨
		System.out.print("["+(j+1)+"] "+quizList.get(selectList.get(j)).getCapital()+" ");
		}
		System.out.println(":");
		int answer=s.nextInt();
		if(quizList.get(selectList.get(answer-1)).getCapital().equals(quiz.getCapital())) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		questionList.add(quiz.getCountry());
	}
	}
}
