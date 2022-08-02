package by.epam.tr.main;

public class TimeLogic {
	public void add(Time time,int sec) {
		time.setSecond(time.getSecond()+sec);
		while(time.getSecond()>59) {
			time.setMinute(time.getMinute()+1);
			time.setSecond(time.getSecond()-60);
		}
		while(time.getMinute()>59) {
			time.setMinute(time.getMinute()-60);
			time.setSecond(time.getHour()+1);
		}
		while(time.getHour()>23) {
			time.setSecond(time.getHour()-24);
		}
	}
	public void add(Time time,int min, int sec) {
		time.setMinute(time.getMinute()+min);
		time.setSecond(time.getSecond()+sec);
		while(time.getSecond()>59) {
			time.setMinute(time.getMinute()+1);
			time.setSecond(time.getSecond()-60);
		}
		while(time.getMinute()>59) {
			time.setMinute(time.getMinute()-60);
			time.setHour(time.getHour()+1);
		}
		while(time.getHour()>23) {
			time.setHour(time.getHour()-24);
		}
	}
	public void add(Time time, int hour, int min,int sec) {
		time.setHour(time.getHour()+hour);
		time.setMinute(time.getMinute()+min);
		time.setSecond(time.getSecond()+sec);
		while(time.getSecond()>59) {
			time.setMinute(time.getMinute()+1);
			time.setSecond(time.getSecond()-60);
		}
		while(time.getMinute()>59) {
			time.setMinute(time.getMinute()-60);
			time.setHour(time.getHour()+1);
		}
		while(time.getHour()>23) {
			time.setHour(time.getHour()-24);
		}
	}
}
