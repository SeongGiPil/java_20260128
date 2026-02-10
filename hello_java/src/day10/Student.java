package day10;

import java.util.Scanner;

public class Student {
	static Scanner s = new Scanner(System.in);
	private String name;
	private String stuNo;
	private int age;

	private int java;
	private int oracle;
	private int html;

	public Student(String stuNo, String name, int age) {
		this.stuNo = stuNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return this.name + "(" + this.stuNo + "객체";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {

		if (java < 0 || java > 100) {
			System.out.println("시험점수 범위는 0~100입니다");
			return;
		}
		this.java = java;
	}

	public void setJava() {
		while (true) {
			System.out.println("자바:");
			int java = s.nextInt();
			if (java < 0 || java > 100) {
				System.out.println("시험점수 범위는 0~100입니다");

			} else
				this.java = java;
			break;
		}
	}

	public int getOracle() {
		return oracle;
	}

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}

	public String getName() {
		return name;
	}

	public String getStuNo() {
		return stuNo;
	}

}
