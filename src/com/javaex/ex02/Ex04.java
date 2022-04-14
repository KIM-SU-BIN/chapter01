package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		
		System.out.println("이름을 입력해주세요.");
		System.out.println("이름:");
		String name =sc.nextLine();
		
		System.out.println("나이:");
		int num1 =sc.nextInt();
		
		System.out.println("당신의 이름은 " +name + " 나이는 " +num1+ "입니다.");
		sc.close();
	
	}

}
