package com.javaex.ex02;

public class Ez01 {
	
	public static void main(String[] args) {
		int i = 2345;
		double d = 3.14;
		char c = '한';
		String s = "한";
		String str = "굿모닝";
		String n = "김수빈";
				
		System.out.println("안녕하세요");
		System.out.println(str);
		
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println(str + str + "안녕하세요");
		System.out.println(str + i);
		String var01 = str+i;
		System.out.println(str + " 랑 " + i); // 공백도 문자로 포함됨!
		
		System.out.println(str + d);
		System.out.println(d + i);
		
		System.out.println(c);
		System.out.println(c + c); //숫자로 연산된다
		
		System.out.println(s);
		System.out.println(s + s);
		
		System.out.println("제 이름은 " + n + "입니다.");
		
		System.out.println("=================");
		
		System.out.println("안녕\n하세요");  // "\n"은 줄바꿈!!
		System.out.println("안녕\t하세요"); // "\t"는 tab키
		
		System.out.println("안녕\"\"하세요"); // "" 쌍따옴표 사용시 앞에 \ 붙이기
		System.out.println("안녕\\\\하세요"); // \기호 넣을 때 앞에 \ 한 번 더 붙이기
	
	}
}
