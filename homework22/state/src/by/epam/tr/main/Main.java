package by.epam.tr.main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<City> homelsDistrictCity = new ArrayList<City>();
		homelsDistrictCity.add(new City("Homel"));
		homelsDistrictCity.add(new City("Rogachev"));
		
		List<City> loevsDistrictCity = new ArrayList<City>();
		loevsDistrictCity.add(new City("Loev"));
		loevsDistrictCity.add(new City("Near Loev"));
		
		District homelsDistrict = new District (homelsDistrictCity);
		District loevsDistrict = new District (loevsDistrictCity);
		
		List<District> homelRegion=new ArrayList<District>();
		homelRegion.add(homelsDistrict);
		homelRegion.add(loevsDistrict);
		
		Region homel = new Region("Homel",homelRegion);
		
		List<City> mincksDistrictCity=new ArrayList<City>();
		mincksDistrictCity.add(new City("Minck"));
		mincksDistrictCity.add(new City("near Minck"));
		
		List<City> kleckisDistrictCity=new ArrayList<City>();
		kleckisDistrictCity.add(new City("Kleck"));
		kleckisDistrictCity.add(new City("near Kleck"));
		
		District mincksDistrict = new District(mincksDistrictCity);
		District kleckisDistrict = new District(kleckisDistrictCity);
		
		List<District> minckRegion = new ArrayList<District>();
		minckRegion.add(mincksDistrict);
		minckRegion.add(kleckisDistrict);
		
		Region minck = new Region("Minck",minckRegion);
		
		List<Region> regionsState = new ArrayList<Region>();
		regionsState.add(homel);
		regionsState.add(minck);
		
		State state = new State ("Minck", 207600,regionsState);
		
		PrintToConcole printer = new PrintToConcole();
		printer.printCapital(state);
		printer.printArea(state);
		printer.printAmountOfRegions(state);
		printer.printCentersOfRegions(state);
		
	}

}
