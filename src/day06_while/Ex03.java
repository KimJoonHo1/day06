package day06_while;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i, temp;
		System.out.print("�� �Է� : ");
		i = scanner.nextInt();
		while(true) {
			temp = i % 10;
			i = i/10;
			System.out.print(temp + "");
			if(i ==0) {
				break;
			}
		}
		System.out.println();
	}

}
