package day06_while;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String id = null;
		String pwd = null;
		
		while(true) {
			System.out.println("1.�α��� \n2.ȸ������ \n3.������");
			System.out.print(">>> ");
			int select = scanner.nextInt();
			
			switch(select) {
				case 1:
					System.out.print("���̵� �Է� : ");
					String loginId = scanner.next();
					System.out.print("��й�ȣ �Է� : ");
					String loginPwd = scanner.next();
						
					if(loginId.equals(id) && loginPwd.equals(pwd)) {
						System.out.println("���� ���� !!!");
					} else {
						System.out.println("���� ���� !!!");
					}
					break;
				case 2:
					System.out.print("������ ���̵� �Է� : ");
					id = scanner.next();
					System.out.print("������ ��й�ȣ �Է� : ");
					pwd = scanner.next();
					System.out.println("���� �Ϸ� !!!");
					break;
				case 3:
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(1);
					break;
				default:
					System.out.println("�߸��� �Է����� ���α׷��� �����մϴ�.");
					System.exit(1);
			}
			
		}
	}

}

