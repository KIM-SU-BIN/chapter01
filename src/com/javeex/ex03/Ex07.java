package com.javeex.ex03;

import java.util.Scanner;

public class Ex07 {
	public static void main (String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		
		int score = sc.nextInt();
		if (score>=90) {
			 System.out.print("A등급");
		} else if (90>score && score>=80) {	
			//90>85 && 85>=80 --> T&&T --> T 85점일때
			//90>74 && 75>=80 --> T%%F --> F 75점일때
			// 14일 논리연산자 자료 참고하기 
			System.out.println("B등급");
		} else if (80>score && score>=70) {
			System.out.println("C등급");
		} else if (70>score && score>=60) {
			System.out.println("D등급");
		} else {
			System.out.println("F등급");
		}
/* System.out.print("A등급입니다.");
} else if (score>=80) {
System.out.print("B등급입니다.");
} else if (score>=70) {
System.out.print("C등급입니다.");
} else if (score>=60) {
System.out.print("D등급입니다.");
}else if (score>=50) {
System.out.print("F등급입니다.");*/
		sc.close();
	}
}
