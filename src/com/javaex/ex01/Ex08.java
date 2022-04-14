package com.javaex.ex01;

public class Ex08 {
	public static void main(String[] args) {
	
		//대입연산자
		int a = 7;
		int b = 2;
		
		System.out.println("산술연산자");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		System.out.println(a/b); //정수 나누기 정수기 때문에 결과값 3
		System.out.println(a%b); // 나머지
		
		//산술연산자 / %자세히
		System.out.println("산술연산자 / % 자세히");
		System.out.println("========"); 
		System.out.println(7/2);               //3
		System.out.println(7.0/2.0);          //3.0
		System.out.println(7%2);               //1
		System.out.println(7.0%2.0);          //1.0
		System.out.println("========");
		
		//부호 연산자
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		
		System.out.println(pVar);
		System.out.println(mVar);
		
		//증감연산자     int a = 7;    int b = 2;﻿﻿
		System.out.println("증감연산자");
		System.out.println(a);       //7
		System.out.println(++a);    //8
		System.out.println(a);
		
		System.out.println(b);      //2
		System.out.println(--b);  //2-->1
		System.out.println(b);
		
		System.out.println(a);    //8
		System.out.println(a++); //8
		System.out.println(a);   //9
		
		System.out.println(b);     //1
		System.out.println(b--); //1
		System.out.println(b);    //0
		
		/*System.out.println(++a); 
		---> 앞에 ++기호가 오면 가장 먼저 해야하는 일로 계산이 즉각적으로 일어남.

		System.out.println(a++); 
		---> 뒤에 기호가 오는 경우 다른 연산이 이루어진 후 맨 마지막에 계산됨.*/
		
	}
}
