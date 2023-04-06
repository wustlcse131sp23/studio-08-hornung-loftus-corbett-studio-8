package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	
	/*
	 * @param month tells us the month of the date
	 * @param day tells us the day of the date
	 * @param year tells us the year of the date
	 */
	
	private int month;
	private int day;
	private int year;
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Date (int chosenMonth, int chosenDay, int chosenYear) {
		this.month = chosenMonth;
		this.day = chosenDay;
		this.year = chosenYear;
		
	}
	 public String toString() {
		return month + "/" + day + "/"+ year;
	}
    public static void main(String[] args) {
    	Date d1 = new Date(4, 6, 2023);
    	Date d2 = new Date(4, 6, 2023);
    	Date d3 = new Date(4, 5, 2023);
    	Date d4 = new Date(12, 25, 2023);
    	Date d5 = new Date(11, 14, 2023);
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(d1);
    	list.add(d2);
    	list.add(d3);
    	list.add(d4);
    	list.add(d5);
    	System.out.println(list);
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(d1);
    	set.add(d2);
    	set.add(d3);
    	set.add(d4);
    	set.add(d5);
    	System.out.println(set);
    	
    	//Sets don't include duplicates, while lists do include duplicates
    }
    
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

}
