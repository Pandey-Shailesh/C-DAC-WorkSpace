package DayThree_Q6;

public class SumOfPimeNumber {

	public static int primeCheck(int num) {

		if (num == 0 || num == 1)
			return 0;
		for (int itemp = 2; itemp <= num / 2; itemp++)
			if (num % itemp == 0)
				return 0;
		return 1;

	}

	public static void main(String[] args) {

		int count = 0;
		int val = 1;
		int sum = 0;
		while (count < 100) {

			if (primeCheck(val) == 1) {
				count++;
				sum = sum + val;
			}
			val++;
		}
		System.out.println("Sum of the First 100 prime numbers is:" + sum);

	}

}
