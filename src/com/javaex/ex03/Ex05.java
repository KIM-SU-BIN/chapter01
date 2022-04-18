package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {
	public static void main (String[] agrs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int time = sc.nextInt();
		int pay;
		if(time<=8) {
			pay = time*10000;
			System.out.print("임금은" + (pay) + "원 입니다.");
		} else if (time>=9) {
			pay = 8*10000 + (time-8)*((int)(1.5*10000)); 
			//1.5를 3/2로 표현 가능하지만, 정수이기 때문에 소수점 결과값 추출을 위해 3.0/2.0으로 작성
			System.out.print("임금은" +pay+ "원 입니다.");
		}
		
		sc.close();
	}
}
