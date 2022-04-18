package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {
	public static void main (String[] agrs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int time = sc.nextInt();
		//int pay; -> 여기에 쓸 경우 이후 나오는 int는 없어도 됨
	
		if(time<=8) {
			int pay = time*10000; //(int x)
			System.out.print("임금은" + (pay) + "원 입니다.");
			//System.out.print("임금은" + (time*10000) + "원 입니다.");
		} else {
			int pay =  8*10000+(time-8)*12000; //(int x)
			System.out.print("임금은" + pay + "원 입니다.");
			//System.out.print("임금은" + ((8*10000)+(time*12000)-(time*10000)) + "원 입니다.");
		}
		
		sc.close();
	}
}
