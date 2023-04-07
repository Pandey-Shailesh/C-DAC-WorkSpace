

public class HCF_Problem {
	public static int getHCF(int num1, int num2) {
		int hcf = 1;

		for (int temp = 2; temp <= num1 / 2; temp++) {
			if (num1 % temp == 0 && num2 % temp == 0)
				hcf = hcf * temp;
		}
		return hcf;
	}

	public static void main(String[] args) {
		System.out.println("Enter 2 numbers");
		int num1 = ConsoleInput.getInteger();
		int num2 = ConsoleInput.getInteger();
		System.out.println("HCF of the given numbers is " + getHCF(num1, num2));
	}
}
