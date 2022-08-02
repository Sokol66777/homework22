package by.epam.tr.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time = new Time (3,43,15);
		TimeLogic log =new TimeLogic();
		TimePrint timePr = new TimePrint();
		timePr.timePrint(time);
		log.add(time, 34, 15, 45);
		timePr.timePrint(time);
		
	}

}
