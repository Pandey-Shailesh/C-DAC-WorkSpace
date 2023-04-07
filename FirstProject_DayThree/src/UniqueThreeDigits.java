

public class UniqueThreeDigits {
	public static void main(String[] args) {
		int count=0;
		for (int itemp = 1; itemp <=4; itemp++) {
			for (int jtemp = 1; jtemp <=4; jtemp++) {
				for (int ktemp = 1; ktemp <=4; ktemp++) {
					if (itemp!=jtemp && jtemp!=ktemp && itemp!=ktemp) {
						System.out.println(itemp+""+jtemp+""+ktemp);
						count++;
					}
				}
			}
		}
		System.out.println("Total number of three digit number is "+count);
	}
}
