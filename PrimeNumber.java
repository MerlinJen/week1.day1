package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 13, rem, quo;
		boolean flag = false;
		quo = num / 2;
		if (num == 0 || num == 1)
			System.out.println(num + "is neither prime nor composite");
		else {
			for (int i = 2; i <= quo; i++) {
				rem = num % i;
				if (rem == 0) {
					flag = true;
					System.out.println(num + "is not a Prime Number");
					break;
				}
			}
			if (flag == false) {
				System.out.println(num + "is a Prime Number");
			}
		}
	}
}
