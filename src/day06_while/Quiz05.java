package day06_while;

public class Quiz05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		while(true) {
			if(i % 2 != 0) {
				sum = sum + i;
			}
			if(sum >= 10000) {
				i = i - 2;
				break;
			}
			i++;
		}
		System.out.println(i);
	}

}
