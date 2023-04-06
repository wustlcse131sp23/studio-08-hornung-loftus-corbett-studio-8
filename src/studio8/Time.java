package studio8;

import java.util.Objects;

public class Time {

	/*
	 * @param hours tells us the hour that we are on
	 * @param minutes tells us the minute that we are on
	 * @param format tells us whether we are on the 12 or 24 hour format
	 */
	private String hours;
	private String minutes;
	private boolean format;
	
	public Time (String chosenHour, String chosenMinutes, boolean isTwentyFour) {
		this.hours = chosenHour;
		this.minutes = chosenMinutes;
		this.format = isTwentyFour;
	}
	public String toString() {
		return hours + ":" + minutes;
	}
	public static void main(String[] args) {
		Time t1 = new Time ("3", "09", false);
		Time t2 = new Time ("3", "09", false);
		Time t3 = new Time ("3", "18", false);
		System.out.println(t1.equals(t3));
		System.out.println(t2.equals(t3));
    }
	@Override
	public int hashCode() {
		return Objects.hash(hours, minutes);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return Objects.equals(hours, other.hours) && Objects.equals(minutes, other.minutes);
	}

}