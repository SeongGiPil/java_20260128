package day16;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import day13.DBClass;

public class 수도퀴즈 {
	static Scanner s = new Scanner(System.in);
	int quizNum = 0;

	public static void runQuiz(Statement stmt) {
		try {
			int count = 0;
			int correct = 0;
			while (true) {
				System.out.println("풀 문제수입력:");
				count = s.nextInt();
				if (count >= 3 && count <= 5) {
					break;
				} else {
					System.out.println("3~5사이 숫자 입력:");
				}

			}

			String sql = "SELECT * FROM (SELECT * FROM TBL_QUIZ ORDER BY DBMS_RANDOM.VALUE) WHERE ROWNUM <= " + count;

			ResultSet rs = stmt.executeQuery(sql);

			int quizNum = 1;
			while (rs.next()) {
				System.out.println(quizNum + "번." + rs.getString("Country") + ":");
				
				String answer = s.next();
				if (answer.equals(rs.getString("CAPITAL"))) {
					System.out.println("정답");
					correct++;

				} else {
					System.out.println("오답! 정답은" + rs.getString("CAPITAL"));
				}
				quizNum++;

			}

			System.out.println("총 " + count + "문제 중 " + correct + "문제 맞히셨습니다.");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void addQuiz(Statement stmt) {
		//추가할 나라 입력받은 후 db에있는지 확인해라
		try {
			System.out.println("추가할 나라이름");
			String country=s.next();
			String sql="SELECT * FROM TBL_QUIZ WHERE Country = '"+ country+ "'";
			ResultSet rs=stmt.executeQuery(sql);
			if(rs.next()) {
				System.out.println("이미 등록된 나라입니다");
			}else {
				System.out.println("수도를 입력해주세요:");
				String capital=s.next();
				sql="INSERT INTO TBL_QUIZ VALUES(QUIZ_SEQ.NEXTVAL,"
						+"'"+country+"',"
						+"'"+capital+"')";
				int result=stmt.executeUpdate(sql);
				if(result>0) {
					System.out.println("등록됨");
				}else {
					System.out.println("등록실패");
				}
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}

	public static void editQuiz(Statement stmt) {
		try {
			System.out.println("수정할 나라이름");
			String country=s.next();
			
			String sql="SELECT * FROM TBL_QUIZ WHERE Country = '"+ country+ "'";
			ResultSet rs=stmt.executeQuery(sql);
			if(rs.next()) {
				System.out.println("현재 등록된 수도명은"+rs.getString("CAPITAL"));
				System.out.println("수정하실래Y/N");
				
				
				
				while(true) {
					String yn=s.next();
					if(yn.toLowerCase().equals("y")) {
						System.out.println("수정할수도");
						 String capital=s.next();
						 sql="UPDATE TBL_QUIZ SET"
								 +"CAPITAL='"+capital+"'"
								 +"WHERE COUNTRY='"+country+"'";
						 int result=stmt.executeUpdate(sql);
						 if(result>0) {
							 System.out.println("수정됨");
						 }else {
							 System.out.println("실패");
						 }
						 break;
						 
					}else if(yn.toLowerCase().equals("N")) {
						break;
				}else {
					System.out.println("y/n중에 입력");
					
				}	
				}
			}else {
			System.out.println("없는 나라입니다");
			
					 
				 }
			 
			
		
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public static void removeQuiz(Statement stmt) {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.문제풀이, 2.문제추가,3.문제 수정 4.문제 삭제,5.종료

		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		boolean closeFlg = true;

		while (closeFlg) {
			System.out.print("1.문제풀이, 2.문제추가,3.문제 수정 4.문제 삭제,5.종료");
			
			int menu = s.nextInt();
			switch (menu) {
			case 1:
				runQuiz(stmt);

				break;

			case 2:
				addQuiz(stmt);
				break;
			case 3:

				break;

			case 4:

				break;

			case 5:
				System.out.println("종료되었습니다");
				closeFlg = false;
				break;

			default:
				System.out.println("1~5부터의 메뉴중 선택해주세요");

				break;
			}
		}

	}

}
