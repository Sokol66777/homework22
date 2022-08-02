package by.epam.tr.main;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		hour=0;
		minute=0;
		second=0;
	}
	public Time(int hour, int minute,int second) {
		if(hour<0 || hour>23) {
			hour=0;
		}
		this.hour=hour;
		if(minute<0 || minute>59) {
			minute=0;
		}
		this.minute=minute;
		if(second<0||second>59) {
			second=0;
		}
		this.second=second;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute, second);
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
		return hour == other.hour && minute == other.minute && second == other.second;
	}
	
}
