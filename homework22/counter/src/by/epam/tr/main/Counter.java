package by.epam.tr.main;

public class Counter {

	private int count;
	private final int from;
	private final int to;
	public Counter() {
		from=0;
		count=0;
		to=100;
	}
	public Counter(int from, int to) {
		count=from;
		this.from=from;
		this.to=to;
		if(from>to) {
			throw new RuntimeException("from>to");
		}
		if(from<0 || to<0) {
			throw new RuntimeException("count can not be negative");
		}
	}
	public Counter(int from, int to, int count) {
		this.count=count;
		this.from=from;
		this.to=to;
		if(from>to) {
			throw new RuntimeException("from>to");
		}
		if(from<0 || to<0 ) {
			throw new RuntimeException("count can not be negative");
		}
		if(count <from || count>to ) {
			throw new RuntimeException("incorrect count");
		}
	}
	public int getCount() {
		return count;
	}
	public void increace() {
		if(count==to) {
			return;
		}
		this.count++;
	}
	public void decreeace() {
		if(count==from) {
			return;
		}
		count--;
	}
}
