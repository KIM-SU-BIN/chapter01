//기본자료형(실제값) int.float,double,,, 파일 복붙
//참조자료형(주소값) 파일 바로가기 생성 -> 주소가 기재되어 있기 때문

package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		
		
		int[] arrA = new int[3];
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		int[] arrB = arrA; //주소가 복사된다 (같은주소)
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("====================");
		
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
	}
}