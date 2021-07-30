package day06_while;

public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		while(i<=1000) {
			if(i % 3 == 0) {
				if(i % 5 != 0) {
					i++;
					continue;
				}
			}
			sum = sum + i;
			i++;
		}
		System.out.println("sumÀÇ °ª : " + sum);
	}

}
