package com._520it._05_Grade;

public class GradeDemo {
	public static void main(String[] args) {
		int grade = 70;
		if(grade < 90 && grade >= 60){
			System.out.println("B");	
		}else if(grade < 60){
				System.out.println("C");
			}else if(grade >= 90){
				System.out.println("A");
			}
	}

}