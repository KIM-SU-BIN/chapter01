package com.javeex.ex03;

import java.util.Scanner;

public class Ex06 {
	public static void main (String[] agrs) {

			System.out.println("점수를 입력하세요");
			Scanner a = new Scanner(System.in);
			int num = a.nextInt();
			if (num % 3 == 0) {
				System.out.printf("%d은 (는) 3의 배수입니다", num);
			} else  {
				System.out.printf("%d은 (는) 3의 배수가 아닙니다", num);
			}
			a.close();
		}

	}