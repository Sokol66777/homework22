package by.epam.tr.main;

public class PrintToConcole {
	public void printCapital(State state) {
		System.out.println(state.getCapital());
	}
	public void printArea(State state) {
		System.out.println(state.getArea()+" sqare km");
	}
	public void printAmountOfRegions(State state) {
		System.out.println("amount of regions="+state.getState().size());
	}
	public void printCentersOfRegions(State state) {
		for(Region r:state.getState()) {
			System.out.print(r.getRegionCenter()+ " ");
		}
	}
}
