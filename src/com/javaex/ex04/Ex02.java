package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {   //구구단 단 만들기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력하세요");
		System.out.println("단: ");
		
		int dan = sc.nextInt();
		int t=1; //초기값

		while(t<=9) {
			System.out.println(dan + " * " +t +" = " + dan*t );
			
			t++;   // t=t+1;
		}
		
		sc.close();
	}
}
