package com.javaex.ex05;

public class Ex04 {

	public static void main(String [] args) {  //주소형 자료형은 따라가면 뭐가 있는지?
	
		int[] intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		
		for(int i=0; i<intArray.length; i++) { //i++ 방 번호 하나씩 올리기 때문
			System.out.println(intArray[i]); }
		
		
		
		//위에보다 더 줄여서 쓴 것
		/* int[] intArray = new int[] {3,6,9};
		
		for(int i =0; i<intArray.length; i++) {
			System.out.println(intArray[i]);} */
		
		
		
		/* for(int i =0; i<intArray.length; i++) {
			System.out.println(intArray[i]);}n */
		
		
		
		System.out.println("======================");
		double[] dArray = new double[3];
		dArray[0] = 1.1;   //같은 종류만 사용 가능! 1(x) -> 1.0(o)
		dArray[1] = 7.3;
		dArray[2] = 5.2;

		for(int i=0; i<dArray.length; i++) {
			System.out.println(dArray[i]);
			
		}
		
		System.out.println("======================");
		char[] cArray = new char[5];
		cArray[0] = '안';
		cArray[0] = '녕';
		cArray[0] = '하';
		cArray[0] = '세';
		cArray[0] = '요';
		
		for(int i=0; i<cArray.length; i++) {
			System.out.println(cArray[i]);
			}
		
		System.out.println("======================");
		boolean[]  bArray = new boolean[4];
		bArray[0] = true;
		bArray[1] = false;
		bArray[2] = 3==5;
		
		for(int i=0; i<bArray.length; i++) {
			System.out.println(bArray[i]);
			}
		
	}
}
