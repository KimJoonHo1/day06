package day06_while;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String id = null;
		String pwd = null;
		
		while(true) {
			System.out.println("1.로그인 \n2.회원가입 \n3.나가기");
			System.out.print(">>> ");
			int select = scanner.nextInt();
			
			switch(select) {
				case 1:
					System.out.print("아이디 입력 : ");
					String loginId = scanner.next();
					System.out.print("비밀번호 입력 : ");
					String loginPwd = scanner.next();
						
					if(loginId.equals(id) && loginPwd.equals(pwd)) {
						System.out.println("인증 성공 !!!");
					} else {
						System.out.println("인증 실패 !!!");
					}
					break;
				case 2:
					System.out.print("저장할 아이디 입력 : ");
					id = scanner.next();
					System.out.print("저장할 비밀번호 입력 : ");
					pwd = scanner.next();
					System.out.println("가입 완료 !!!");
					break;
				case 3:
					System.out.println("프로그램을 종료합니다.");
					System.exit(1);
					break;
				default:
					System.out.println("잘못된 입력으로 프로그램을 종료합니다.");
					System.exit(1);
			}
			
		}
	}

}

