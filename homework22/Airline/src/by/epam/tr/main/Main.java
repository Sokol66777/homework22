package by.epam.tr.main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Airline> airlines = new ArrayList<Airline>();
		AirlineLogic logic=new AirlineLogic();
		airlines.add(new Airline("Moscow",2,"name1",15,34,00,"monday"));
		airlines.add(new Airline("Minsk",12,"name2",17,12,00,"friday"));
		airlines.add(new Airline("Moscow",45,"name3",11,00,00,"Sunday"));
		airlines.add(new Airline("Prague",1,"name4",13,34,00,"monday"));
		airlines.add(new Airline("Paris",11,"name5",15,34,01,"monday"));
		airlines.add(new Airline("Tel-Aviv",13,"name6",21,17,00,"monday"));
		airlines.add(new Airline("Moscow",9,"name7",15,35,00,"Sunday"));
		List<Airline> arrived=logic.placeOfArrived(airlines, "Moscow");
		for(Airline arr:arrived) {
			System.out.println(arr.toString());
		}
		List<Airline> day = logic.dayLeave(airlines, "monday");
		for(Airline d:day) {
			System.out.println(d.toString());
		}
		System.out.println();
		List<Airline> dayAtTime= logic.dayAtTime(airlines, "monday", 15, 34, 00);
		for(Airline d:dayAtTime) {
			System.out.println(d.toString());
		}
	}

}
