package com.javaex.ex01;

public class Ex09 {
	
	public static void main(String[] args) {
	
		//관계연산자
		int n1 = 5;
		int n2 = 3;
		
		System.out.println(n1<n2); //5<3 flase
		System.out.println(n1>n2);  //5>3 true
		
		System.out.println(n1<=n2); //5가 3보다 같거나 작니?
		System.out.println(n1>=n2);
		
		System.out.println(n1==n2);  //(긍정질문) n1 n2같니?
		System.out.println(n1!=n2); //﻿(부정질문) n1 n2같지 않니?
		
		boolean result = n1<n2;
		System.out.println(result);
	}

}
