package studio8;

import java.util.HashSet;
import java.util.Objects;

public class Appointment {

	private Date date;
	private Time time;
	public Appointment(Date d1, Time t1) {
		this.date = d1;
		this.time = t1;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public static void main(String[] args) {
		Date d1 = new Date(4, 6, 2023);
    	Date d2 = new Date(4, 6, 2023);
    	Date d3 = new Date(4, 5, 2023);
    	Date d4 = new Date(12, 25, 2023);
    	Date d5 = new Date(11, 14, 2023);
    	Time t1 = new Time ("3", "09", false);
		Time t2 = new Time ("3", "09", false);
		Time t3 = new Time ("3", "18", false);
		Appointment a1 = new Appointment(d1, t1);
		Appointment a2 = new Appointment(d2, t2);
		Appointment a3 = new Appointment(d3, t3);
		HashSet<Appointment> set = new HashSet<Appointmnet>();
		set.add(a1);
		set.add(a2);
		set.add(a3);
		System.out.println(set);
	}	
	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}
}
