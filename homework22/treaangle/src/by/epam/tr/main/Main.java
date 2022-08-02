package by.epam.tr.main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Point> points = new ArrayList<Point>();
		points.add(new Point(7,10));
		points.add(new Point(1,-4));
		points.add(new Point(6,4));
		TreangleLogic log = new TreangleLogic();
		double s=log.spaseTreangle(points);
		double perim=log.perimeterTreangle(points);
		System.out.println(s);
		System.out.println(perim);
		
	}

}
