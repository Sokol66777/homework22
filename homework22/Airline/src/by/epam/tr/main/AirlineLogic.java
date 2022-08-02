package by.epam.tr.main;

import java.util.ArrayList;
import java.util.List;

public class AirlineLogic {

	public List<Airline> placeOfArrived(List<Airline> airlines, String place){
		List<Airline> arrived =new ArrayList<Airline>();
		for(Airline airline:airlines) {
			if(airline.getPlace().equals(place)) {
				arrived.add(airline);
			}
		}
		return arrived;
	}
	public List<Airline> dayLeave(List<Airline>airlines,String day){
		List<Airline> dayleave =new ArrayList<Airline>();
		for(Airline airline:airlines) {
			if(airline.getDay().equals(day)) {
				dayleave.add(airline);
			}
		}
		return dayleave;
	}
	public List<Airline> dayAtTime(List<Airline> airlines,String day, int hour,int min,int sec){
		List<Airline> time=new ArrayList<Airline>();
		for(Airline airline:airlines) {
			if(airline.getDay().equals(day)) {
				if(airline.getHour()>hour) {
					time.add(airline);
				}
				else if(airline.getHour()==hour) {
					if(airline.getMin()>min) {
						time.add(airline);
					}
					else if(airline.getHour()==hour) {
						if(airline.getSec()>sec) {
							time.add(airline);
						}
					}
				}
			}
		}
		return time;
	}
}
