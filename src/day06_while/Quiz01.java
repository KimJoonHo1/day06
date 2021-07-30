package day06_while;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i = 0, sum = 0;
		while(true) {
			System.out.print("1~10까지의 수를 입력해 주세요 : ");
			i = scanner.nextInt();
			if(1 <= i && i <= 100) {
				break;
			}
		}
		for(int j=1; j<=i; j++) {
			sum += j;
		}
		System.out.print("1부터 " +i +"까지의 합 : " + sum);
	}

}
