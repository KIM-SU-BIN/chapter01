package com.javaex.ex04;

public class Ex10 {
	public static void name(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i%2==0 && i%3==0) { //&& 사용하면 2의 배수이면서 3의 배수를 둘 다 만족시켜야함
				/* break; */ 
				continue; //2와3을 공통 배수인 6만 출력되지 않음
			}
			System.out.println(i);
		}
		System.out.println("종료");
	}
}
