package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args ) {
		
		//변수선언 + 초기화
		int myAge = 25; 
		/*
		 int myAge; //변수선언 
		  myAge = 25; //초기화
		 */
		
		 //메모리의 값을 출력하는 메소드 
		 System.out.println(myAge);
		 
		 myAge = 26; 
		 System.out.println(myAge);

		
		byte no;
		no = 127; // max:127 이기 때문에 128 넣으면 오류남! -128은 가능 -129는 불가
		System.out.println(no);
		
		long no2;
		no2= 123123123L;
		// long형은 int범위를 넘어가면 마지막에 L을 붙여줘야함.
		System.out.println(no2); 
		//long범위 -9223372036854775808 ~ 9223372036854775807
	
	}
}