package week1.day1;

public class ForEvenOdd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for (i = 1; i <= 50; i++) {
			if (i % 2 == 0)
				System.out.println(i);
			else if (i % 2 != 0)
				System.out.println("");
		}
	}
}
