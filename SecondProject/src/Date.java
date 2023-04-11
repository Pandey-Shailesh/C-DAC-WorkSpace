import java.nio.file.spi.FileSystemProvider;

public class Date {
	private int day = 1;
	private int month = 1;
	private int year = 2023;

	public void setDate(int day, int month, int year) {
		// System.out.println(day + "/" + month + "/" + year);
		if (year < 1900 || year > 3000)
			this.year = 2023;
		else {
			this.year = year;
		}

		if (month < 1 || month > 12)
			this.month = 1;
		else
			this.month = month;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8|| month==10 || month == 12) {
			if (day < 1 || day > 31)
				this.day = 1;
			else
				this.day = day;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day < 1 || day > 30)
				this.day = 1;
			else
				this.day = day;
		} else if (month == 2) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println("Leap year");

				if (day < 1 || day > 28)
					this.day = 1;
				else
					this.day = day;
			}
		}
	}

	public void addDay(int num) {
		this.day = day + num;
		if (day > 30) {
			int val = day % 30;
			this.month++;
			System.out.println(val + "/" + this.month + "/" + this.year);
		}

	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;

	}
}
