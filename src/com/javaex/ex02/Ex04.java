package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		
		System.out.println("이름을 입력해주세요.");
		System.out.print("이름:");
		String name =sc.nextLine();
		
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이:");
		int num1 =sc.nextInt(); //num 대신 age 써도됨
		/*숫자가 문자보다 먼저 입력하도록 순서를 정하는 경우 버그 생김
		 * 반드시 sc nextLine(); 입력할 것*/
		
		System.out.println("당신의 이름은 " +name + " 나이는 " +num1+ "입니다.");
		sc.close();
	
	}

}
