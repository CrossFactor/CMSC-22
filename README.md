public class Date {
	private int day;
	private int month;
	private int year;
	//Constructor w/ parameters
	public Date(int y, int m, int d){
		setDate(y, m, d);
	}
	//Blank Constructor
	public Date(){
		setDate(1000, 1, 1);
	}

	public String toString(){
		return String.format("%02d/%02d/%04d", day, month, year);
	}

	//all getters and setters
	public int getDay(){
		return this.day;
	}

	public void setDay(int d){
		if (d < 1){
			throw new IllegalArgumentException("Day below 1 is invalid");
		}
		else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (d > 31 || d < 1)){ //checks errors for months with 31 days
			throw new IllegalArgumentException("Month " + month + "  only has up to 31 days");
		}
		else if (month == 2){ //checks for valid days for February
			if (year % 4 != 0 && d > 28){
				throw new IllegalArgumentException("It's not a leap year bruh!");
			}
			else if (year % 4 == 0 && d > 29){
				throw new IllegalArgumentException("You can only have up to 29 days");
			}
		}
		else if ( (month == 4 || month == 6 || month == 9 || month == 11) && (d > 30 || d < 1)){ //checks errors for months with 30 days
			throw new IllegalArgumentException("Month " + month + " only has up to 30 days");
		}
		this.day = d;
	}

	public int getMonth(){
		return this.month;
	}

	public void setMonth(int m){
		if(m > 12 || m < 1){
			throw new IllegalArgumentException("Invalid month date (1 - 12)");
		}
		this.month = m;
	}

	public int getYear(){
		return this.year;
	}

	public void setYear(int y){
		if (y > 9999 || y < 1000){
			throw new IllegalArgumentException("Invalid year (1000 - 9999)");
		}
		this.year = y;
	}

	public void setDate(int y, int m, int d){
		setYear(y);
		setMonth(m);
		setDay(d);
	}
	//getters and setters end here
}
