package day06_while;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 수를 입력해주세요 : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int multiple = 0;
		int divisor = 0;
		
		int i = 1;
		int j = 1;
		
		while(i <= num1 && i <= num2) {
			if(num1 % i == 0 && num2 % i == 0) {
				divisor = i;
			}
			i++;
		}
		while(true) {
			if(j % num1 == 0 && j % num2 == 0) {
				multiple = j;
				break;
			}
			j++;
		}
		System.out.println(num1 + "과 " + num2 + "의 최대 공약수는 " +  divisor + "입니다");
		System.out.println(num1 + "과 " + num2 + "의 최소 공배수는 " +  multiple + "입니다.");
	}

}
