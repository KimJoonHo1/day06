package day06_while;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("����� ���� �ϼ��� >>> ");
		int menny = scanner.nextInt();
		while(true) {
			System.out.println("============Ŀ�� ���Ǳ�============\n");
			System.out.println("1. Ŀ��(200) \t 2.���ھ�(250) \t 3. ��ȯ \t 4. ����");
			System.out.print("�Ŵ��� �����ϼ��� >>> ");
			int sw = scanner.nextInt();
			
			switch(sw) {
				case 1:
					if(menny >= 200) {
						System.out.println("���ְ� �弼��.");
						menny = menny - 200;
					} else {
						System.out.println("����� �����մϴ�.");
					}
					break;
				case 2:
					if(menny >= 250) {
						System.out.println("���ְ� �弼��.");
						menny = menny - 250;
					} else {
						System.out.println("����� �����մϴ�.");
					}
					break;
				case 3:
					System.out.println("�Ž����� : " + menny);
					break;
				case 4:
					System.out.println("����");
					System.exit(1);
					break;
				default:
					System.out.println("�߸��� �Է����� �����մϴ�.");
					System.exit(1);
			}
		}
	}

}
