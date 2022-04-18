package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수: ");
		int point = sc.nextInt();
		//if절에 point = 조건문 대입 (﻿조건식은 true or false로 답이 나와야함, 14일 정리본 참고)
		if(point>=60) {
			System.out.println("합격입니다.");
		}
		
		sc.close();
		}

}
