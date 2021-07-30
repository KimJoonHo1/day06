package day06_while;

public class Quiz15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 5;
		
		int num = 1;
		
		for(int i=1; i<=9; i++) {
			for(int j = 1; j<=cnt; j++) {
				System.out.print(num + "\t");
				num++;
			}
			System.out.println();
			cnt = cnt-1;
			for(int x = 1; x<=cnt; x++) {
				System.out.print(num + "\t");
				num++;
			}
		}
	}

}
