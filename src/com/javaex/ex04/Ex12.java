//do~while 반복문 ppt105
package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {
	public static void name(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("숫자를 입력하세요[0이면 종료]");
			
			//1. 입력 2. 합계
			int sum = 0; 
			//1이나 다른 숫자가 있을 경우 밑에 입력받은 값과 계산시 맞지 않기 때문에 
			//아무것도 없응 0으로 기입해야함
			int num;
			
			/*
			do {
				num = sc.nextInt(); //입력받은 값, 짜여질 코드와 동일하게 한 번 더 작성되야함 왜?
				sum = sum + num;
				System.out.println("합계" + sum);
			} while (num !=0); */
			
			System.out.println("=================================");
			while (true) {
				num = sc.nextInt(); //입력받은 값
				sum = sum + num;
				System.out.println("합계" + sum);
				if(num==0) {
					break;
				}
			}
			System.out.println("종료");
			sc.close();
		}
	}
}
