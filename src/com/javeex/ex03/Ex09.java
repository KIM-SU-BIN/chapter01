package com.javeex.ex03;

import java.util.Scanner;

public class Ex09 {
	public static void main (String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("과목번호");
		int c = sc.nextInt();
	
		if (c == 1) {
			System.out.println("R101");
		} else if (c == 2) {
			System.out.println("R102");
			} else if(c == 3) {
				System.out.println("R103");
			} else if(c == 4) {
				System.out.println("R104");
			}else {
				System.out.println("상담원에게 문의하세요");
			}
		sc.close();
	}
}
