package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {
	public static void main (String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		
		int number = sc.nextInt();
		
		if (number>0) {  //양수(홀,짝 구분)
				if(number%2==0) { //짝수니??
					System.out.println("짝수");
				} else { //아니면 홀수니?
					System.out.println("홀수");
				}
		}  else if (number<0) { //음수니??
			System.out.println("음수");
		} else {
			System.out.println(0);
		}
		sc.close();
	}
}
