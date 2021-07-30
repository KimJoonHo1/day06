package day06_while;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String n1, n2;
		System.out.println("첫 문자 입력");
		n1 = scanner.next();
		System.out.println("두 문자 입력");
		n2 = scanner.next();
		System.out.println("n1 길이 : " + n1.length());
		System.out.println("n2 길이 : " + n2.length());
		System.out.println("n1 == n2 : " + (n1==n2));
		System.out.println("n1.equals(n2) : " + n1.equals(n2));
		System.out.println("n2.equals(n1) : " + n2.equals(n1));
		

	}

}
