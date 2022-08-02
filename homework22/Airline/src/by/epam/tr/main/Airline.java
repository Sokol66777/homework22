package by.epam.tr.main;

import java.util.Objects;

public class Airline {
	
	private String place;
	private int number;
	private String name;
	private int hour;
	private int min;
	private int sec;
	private String day;
	public Airline() {
		place="";
		number=0;
		name="";
		hour=0;
		min=0;
		sec=0;
		day="";
	}
	public Airline(String place,int number,String name,int hour,int min,int sec,String day) {
		this.place=place;
		this.number=number;
		this.name=name;
		this.hour=hour;
		this.min=min;
		this.sec=sec;
		this.day=day;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	@Override
	public int hashCode() {
		return Objects.hash(day, hour, min, name, number, place, sec);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		return Objects.equals(day, other.day) && hour == other.hour && min == other.min
				&& Objects.equals(name, other.name) && number == other.number && Objects.equals(place, other.place)
				&& sec == other.sec;
	}
	@Override
	public String toString() {
		return "Airline [place=" + place + ", number=" + number + ", name=" + name + ", hour=" + hour + ", min=" + min
				+ ", sec=" + sec + ", day=" + day + "]";
	}
	
}
