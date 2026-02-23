package day14;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


import day13.DBClass;

public class Java09_DB {
	
	public static void searchStudent(Statement stmt) {
		try {
			String sql="SELECT * FROM TBL_STUDENT"; 
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
			System.out.println("학번:"+rs.getString("STU_NO")+",");
			System.out.println("이름:"+rs.getString("STU_NAME"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static void addStudent(Statement stmt) {
		Scanner s=new Scanner(System.in);
		try {
			String stuNo="";
		while(true) {
			System.out.println("학번:");
			stuNo=s.next();
			String Sql= "SELECT * FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
			ResultSet rs=stmt.executeQuery(Sql);
			if(rs.next()) {
				System.out.println("이미 사용중인학번");
				
			continue;	
			}
			break;
		}
			
			System.out.println("이름:");
			String name=s.next();
			System.out.println("학과:");
			String dept=s.next();
			String sql="INSERT INTO TBL_STUDENT(STU_NO,STU_NAME,STU_DEPT)"
					+"VALUES('"
					+stuNo+"','"
					+name+"','"
					+dept+"')";
			
			int result=stmt.executeUpdate(sql);
			if(result>0) {
				System.out.println("추가되었다");
			}else {
				System.out.println("잘못되었다");
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
//		s.close();
	}
	
	public static void removeStudent(Statement stmt) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.print("삭제할학생의 학번입력:");
			String stuNo=s.next();
			String sql="DELETE FROM TBL_STUDENT WHERE='"+stuNo+"'";
			int result=stmt.executeUpdate(sql);
			if(result>0) {
				System.out.println("삭제됨");
			}else {
				System.out.println("삭제실패");
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		DBClass db = new DBClass();
		Statement stmt = db.getStmt();

		// 1.검색 2.추가 3.수정 4.삭제
		while (true) {
			System.out.println("[1.검색 2.추가 3.수정 4.삭제]:");
			int menu = s.nextInt();
			if (menu == 1) {
				searchStudent(stmt);
			} else if (menu == 2) {
				addStudent(stmt);
			} else if (menu == 3) {
			} else if (menu == 4) {
				removeStudent(stmt);
				
			} else if (menu == 5) {
				System.out.println("종료되었습니다");
			} else {
				System.out.println("1~5사이의 메뉴를 선택해주세요");
			}

		}

	}
}
