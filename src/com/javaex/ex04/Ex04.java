package com.javaex.ex04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String [] args) { //ppt p96
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for (int i = 1; i<=10; i++) {
			sum++; //sum= sum+1;
			System.out.print(i+ "까지의 합은 " + sum);
		}
		System.out.print("1부터 10까지의 정수의 합은"+ sum+" 이다.");
		
		sc.close();
	}

}
