package com.javaex.ex04;

public class Ex11 {
	public static void main(String[] args) {
		
		for(int i=1; i<=20; i++) {
			if(i%2==0 || i%3==0) { //&& 사용하면 2의 배수이면서 3의 배수를 둘 다 만족시켜야함 
				continue; //2와3을 공통 배수인 6만 출력되지 않음
			}
			System.out.println(i);
		}
		
		System.out.println("=============================================");
		for(int i=1; i<=20; i++) {
			if(i%2==0 || i%3==0) { //2의 배수 이면서 3의 배수이면->true 암것도 안함!!
				//아무것도 안한다 1 5 7 결과값
				//반대로 2와3의 배수가 아니면-> false 일함
			} else {
				System.out.println(i);
			}
		}
		
		System.out.println("=============================================");
		for(int i=1; i<=20; i++) {
			if(!(i%2==0 || i%3==0)) { 	 // !T => F / !F=> T 부정으로 서로 반대
				System.out.println(i);
			}
		}
	}
}
