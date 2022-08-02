package by.epam.tr.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Region {

	private String regionCenter;
	private List<District> region;
	public Region() {
		this.region=new ArrayList<District>();
		this.regionCenter="";
	}
	public Region(String regionCenter) {
		this.regionCenter=regionCenter;
		this.region=new ArrayList<District>();
	}
	public Region(String regionCenter,List<District> districts) {
		this.regionCenter=regionCenter;
		this.region=new ArrayList<District>();
		this.region.addAll(districts);
	}
	public Region(List<District> districts) {
		this.regionCenter="";
		this.region=new ArrayList<District>();
		this.region.addAll(districts);
	}
	public String getRegionCenter() {
		return regionCenter;
	}
	public void setRegionCenter(String regionCenter) {
		this.regionCenter = regionCenter;
	}
	public List<District> getRegion() {
		return region;
	}
	public void setRegion(List<District> region) {
		this.region = region;
	}
	public void add(District district) {
		this.region.add(district);
	}
	@Override
	public int hashCode() {
		return Objects.hash(region, regionCenter);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		return Objects.equals(region, other.region) && Objects.equals(regionCenter, other.regionCenter);
	}
	@Override
	public String toString() {
		return "Region [regionCenter=" + regionCenter + ", region=" + region + "]";
	}
	
}
