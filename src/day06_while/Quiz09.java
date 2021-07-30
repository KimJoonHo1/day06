package day06_while;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("1.걷기 2.대중교통 3.종료");
			int select = scanner.nextInt();
			switch(select) {
			case 1:
				System.out.println("걸어가자");
				break;
			case 2:
				System.out.println("버스타자");
				break;
			case 3:
				System.out.println("종료하자");
				System.exit(1);
			}
		}
	}

}
