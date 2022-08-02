package by.epam.tr.main;

import java.util.List;

public class TreangleLogic {
	
	public double spaseTreangle(List<Point> points) {
		if(points.size()!=3) {
			throw new RuntimeException("Incorrect amount of points");
		}
		Point p1=points.get(0);
		Point p2=points.get(1);
		Point p3=points.get(2);
		double s;
		s=(((p1.getX()-p3.getX())*(p2.getY()-p3.getY()))-((p1.getY()-p3.getY())*(p2.getX()-p3.getX())))/2;
		return s;
	}
	public double perimeterTreangle(List<Point> points) {
		if(points.size()!=3) {
			throw new RuntimeException("Incorrect amount of points");
		}
		Point p1=points.get(0);
		Point p2=points.get(1);
		Point p3=points.get(2);
		double perim;
		double a;
		double b;
		double c;
		a=Math.sqrt(Math.pow((p1.getX()-p2.getX()),2) + Math.pow((p1.getY()-p2.getY()),2));
		b=Math.sqrt(Math.pow((p1.getX()-p3.getX()),2) + Math.pow((p1.getY()-p3.getY()),2));
		c=Math.sqrt(Math.pow((p2.getX()-p3.getX()),2) + Math.pow((p2.getY()-p3.getY()),2));
		perim=a+b+c;
		return perim;
	}
}
