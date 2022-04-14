package com.javaex.ex01;

public class Ex07 {
	
	public static void main(String[] args) {
		
		/*숫자 5와 4는 정수 이기 때문에 나누면 1.25에서 0.25가 날라감 
		 * 정수와 정수는 소수점이 나와도 정수값만 결과로 추출됨*/
		double v01 = 5/4;
		System.out.println(v01);
		
		/* 5.0 나누기 4.0 = 1.25ㄴ */
		double v02 =(double)5 / 4; 
		System.out.println(v02);
		
		/* 5.0 4.0 */
		double v03 =5 / (double)4; 
		System.out.println(v03);
		
		double v04 = (double)5/ (double)4;
		System.out.println(v04);
		
		/* int는 소수점 뒤 빼고 1+1 */
		int v05 = (int)1.3 + (int)1.8; 
		System.out.println(v05);
		}

}
