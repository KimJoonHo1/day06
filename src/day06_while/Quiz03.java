package day06_while;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int menny = 1;
		while(i<30) {
				menny = menny * 2;
			i++;
		}
		System.out.println("30일째 예금해야하는 금액 : " + menny);
	}
}
