package day11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Java4_영단어퀴즈예제 {
	public static void main(String[] args) {
		
	
	Scanner s=new Scanner(System.in);
	
	WordQuiz quiz=new WordQuiz();
	ArrayList<Word>quizList=new ArrayList();
//	ArrayList<String>questonList=new ArrayList();
	ArrayList<Integer>qustonList=new ArrayList();
	for(int i=0;i<quizList.size();i++) {
		qustonList.add(i);
		
	}
		Random ran=new Random();
	//랜덤문제 5개출제
	//맞추면 "정답",틀리면 "오답" 출력
	
	for(int i=0; i<10;i++) {
		int index=ran.nextInt(qustonList.size());
		Word word=quizList.get(qustonList.get(index));
		qustonList.remove(index);
//		boolean quizFlg=questonList.contains(word.getEnglish());
//		if(quizFlg) {//중복문제 발견 시 i를 줄이고 continue로 돌아가 증감식다시수행
//			i--;
//			continue;
//		}
	System.out.print((i+1)+"번문제"+word.getEnglish());
	

	String answer=s.next();
	if(answer.equals(word.getKorean())) {
		System.out.println("정답");
		
		
	}else {
		System.out.println("오답!정답은"+word.getKorean());
	}
//	questonList.add(word.getEnglish());
//	
	}
}
}
