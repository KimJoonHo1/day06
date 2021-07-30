package day06_while;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요 : ");
		int num = scanner.nextInt();
		System.out.print(num + "의 약수는 : ");
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("입니다.");
	}

}
