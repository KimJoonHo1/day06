package day06_while;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i = 0, sum = 0;
		while(true) {
			System.out.print("1~20������ ���� �Է��� �ּ��� : ");
			i = scanner.nextInt();
			if(1 <= i && i <= 20) {
				break;
			}
		}
		for(int j=1; j<=i; j++) {
			sum += j;
		}
		System.out.print("1���� " +i +"������ �� : " + sum);
		
		
	}

}