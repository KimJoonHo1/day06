package day06_while;

public class Quiz10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1; i<=1000; i++) {
			if(i % 4 == 1 && i % 6 == 1) {
				sum += i;
			}
		}
		System.out.println("sum : " + sum);
	}

}