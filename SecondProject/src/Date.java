
public class Date {
	public int day = 1;
	public int month = 4;
	public int year = 2023;

	public Date() {
		day = 11;
	}

	public void display(int temp) {
		System.out.println(day + "/" + month + "/" + year);
	}

	public void setDate(int day, int month, int year) {
		//System.out.println(day + "/" + month + "/" + year);
		if (year < 1900 || year > 3000)
			this.year = 2023;
		else
			this.year = year;

		if (month < 1 || month > 12)
			this.month = 1;
		else
			this.month = month;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 9 || month == 12) {
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
			if (day < 1 || day > 28)
				this.day = 1;
			else
				this.day = day;
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
