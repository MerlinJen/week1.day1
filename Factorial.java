package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = 5, factor = 0;
		int facto = fact - 1;
		System.out.println(fact);
		for (int i = 3; i <= fact; i++) {
			System.out.println(facto);
			factor = fact * facto;
			fact = factor;
			facto = facto - 1;
			if (facto == 0)
				break;
		}
		System.out.println(factor);
	}
}
