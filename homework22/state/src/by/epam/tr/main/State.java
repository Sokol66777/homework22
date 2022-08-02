package by.epam.tr.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class State {

	private String capital;
	private List<Region> state;
	private int area;
	public State() {
		capital="";
		state=new ArrayList<Region>();
		area=0;
	}
	public State(String capital) {
		this.capital=capital;
		state=new ArrayList<Region>();
	}
	public State(String capital, List<Region> regions) {
		this.capital=capital;
		state=new ArrayList<Region>();
		state.addAll(regions);
	}
	public State(String capital, int area,List<Region> regions) {
		this.capital=capital;
		this.area=area;
		state=new ArrayList<Region>();
		state.addAll(regions);
	}
	public State(List<Region> regions) {
		state=new ArrayList<Region>();
		state.addAll(regions);
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public List<Region> getState() {
		return state;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public void setState(List<Region> state) {
		this.state = state;
	}
	@Override
	public int hashCode() {
		return Objects.hash(capital, state);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		return Objects.equals(capital, other.capital) && Objects.equals(state, other.state);
	}
	@Override
	public String toString() {
		return "State [capital=" + capital + ", state=" + state + "]";
	}
	
}
