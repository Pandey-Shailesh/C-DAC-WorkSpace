package DayThree_Q07;

public class CheckingPrimeNumber {

	public static int primeCheck(int num) {

		if (num == 0 || num == 1)
			return 0;
		for (int itemp = 2; itemp <= num / 2; itemp++)
			if (num % itemp == 0)
				return 0;
		return 1;

	}

	public static void main(String[] args) {
		System.out.print(primeCheck(2));
	}
}
