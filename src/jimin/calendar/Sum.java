package jimin.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		//입력: 키보드로 두 수의 입력을 받는다.
		int a,b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("두수를 입력해주세요");
		s1 = scanner.next();
		s2 = scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.println(a + " , " + b);
		
		//출력: 화면에 두 수의 합을 출력한다.
		System.out.println("두 수의 합은" + (a + b) + "입니다.");
		System.out.printf("두 수의 합은%d입니다.", a + b);
		scanner.close();
	}
}
