package in.org.cdac;
public class Date {
	private int day = 1;
	private int month = 1;
	private int year = 2023;
	private int[] noOfDays = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	@Override
	public String toString()
	{
		return day +"/" + month + "/" + year;
	}
	public void setDate(int day, int month, int year) {

		if (year > 1900 && year < 3000)
			this.year = year;

		if (month >= 1 && month <= 12)
			this.month = month;

		if (day >= 1 && day <= noOfDays[month])
			this.day = day;

	}

	public void isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			noOfDays[2] = 29;
		else
			noOfDays[2] = 28;

	}

	public void addDay(int num) {
		isLeapYear(year);
		int currunt = 0;
		while (num > noOfDays[month]) {

			if (currunt == 0) {
				num = num - (noOfDays[month] - this.day);
				currunt++;
			} else
				num = num - noOfDays[month];
			month++;
			this.day = num;
			if (month > 12) {
				month = 1;
				year++;
				isLeapYear(year);
			}
		}
	}

	public void addMonth(int num) {

		while (num > 0) {
			num--;
			month++;
			if (month > 12) {
				year++;
				month = 1;
			}
		}
	}

	public void addyear(int num) {
		this.year = year + num;
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
