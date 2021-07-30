package day06_while;

public class Quiz06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 100000;
		int j = 2;
		int day = 1;
		while(i>0) {
			i = i - j * 20;
			if(day % 10 == 0) {
				j *= 2;
			}
			day++;
		}
		day--;
		System.out.println("쌀 100통이 사라지는데 걸린 시간 : " + day);
		System.out.println("쥐의 수 : " + j);
	}

}
