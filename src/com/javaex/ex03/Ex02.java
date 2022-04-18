package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {
	
	public static void main (String[] agrs) {
		System.out.print("점수:");
		Scanner a = new Scanner(System.in);
		int score = a.nextInt();
		
		if (score >= 60) {
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다");
			}
		a.close();
		}
}
