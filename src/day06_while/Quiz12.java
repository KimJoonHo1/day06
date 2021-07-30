package day06_while;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("요금을 투입 하세요 >>> ");
		int menny = scanner.nextInt();
		while(true) {
			System.out.println("============커피 자판기============\n");
			System.out.println("1. 커피(200) \t 2.코코아(250) \t 3. 반환 \t 4. 종료");
			System.out.print("매뉴를 선택하세요 >>> ");
			int sw = scanner.nextInt();
			
			switch(sw) {
				case 1:
					if(menny >= 200) {
						System.out.println("맛있게 드세요.");
						menny = menny - 200;
					} else {
						System.out.println("요금이 부족합니다.");
					}
					break;
				case 2:
					if(menny >= 250) {
						System.out.println("맛있게 드세요.");
						menny = menny - 250;
					} else {
						System.out.println("요금이 부족합니다.");
					}
					break;
				case 3:
					System.out.println("거스름돈 : " + menny);
					break;
				case 4:
					System.out.println("종료");
					System.exit(1);
					break;
				default:
					System.out.println("잘못된 입력으로 종료합니다.");
					System.exit(1);
			}
		}
	}

}
