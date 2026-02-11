package day11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Java5_영단어퀴즈 {
	public static void runquiz(ArrayList<Word>quizList) {
		Scanner s=new Scanner(System.in);
		
	ArrayList<String>questonList=new ArrayList();
		ArrayList<Integer>qustonList=new ArrayList();
		for(int i=0;i<quizList.size();i++) {
			qustonList.add(i);
			
		}
			Random ran=new Random();
		//랜덤문제 5개출제
		//맞추면 "정답",틀리면 "오답" 출력
		
		for(int i=0; i<5;i++) {
			int index=ran.nextInt(qustonList.size());
			Word word=quizList.get(qustonList.get(index));
			qustonList.get(index);
		boolean quizFlg=questonList.contains(word.getEnglish());
			if(quizFlg) {//중복문제 발견 시 i를 줄이고 continue로 돌아가 증감식다시수행
				i--;
			continue;
			}
		System.out.print((i+1)+"번문제"+word.getEnglish());
		

		String answer=s.next();
		if(answer.equals(word.getKorean())) {
			System.out.println("정답");
			
			
		}else {
			System.out.println("오답!정답은"+word.getKorean());
		}
			questonList.add(word.getEnglish());
		}	
		}
		public static void addQuiz(WordQuiz quiz) {
			Scanner s=new Scanner(System.in);
			System.out.println("영어:");
			String english=s.next();
			System.out.println("한국어");
			String korean=s.next();
			quiz.setWord(english, korean);
		}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		WordQuiz quiz=new WordQuiz();
		ArrayList<Word>quizList=new ArrayList();
		ArrayList<String>questonList=new ArrayList();
		Random ran=new Random();
		
		while(true) {
			System.out.println("[1.문제풀이,2.문제추가,3믄제수확인]");
			int menu=s.nextInt();
			switch(menu) {
			case 1:
				runquiz(quizList);
				break;
			case 2:
				addQuiz(quiz);
				break;
					
				
				
			case 3:
				System.out.println("현재문제수는"+quizList.size()+"입니다");
				break;
			default:
				if(quizList.size()<0) {
					System.out.println("남은 문항이 존재하지않습니다");
					continue;
				}
		
			}
		}
	}
}

