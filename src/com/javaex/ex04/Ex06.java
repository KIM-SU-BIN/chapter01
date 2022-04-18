package com.javaex.ex04;

public class Ex06 {
	public static void main (String[] args) {
	
			for (int y=1; y <=6; y++ ) { //5행
				for (int x=1; x<=y; x++) { //5열 별의 갯수 달라짐
				System.out.print("*");
			} 
			System.out.println(""); //자동 줄바꿈
		}		
	}
}
