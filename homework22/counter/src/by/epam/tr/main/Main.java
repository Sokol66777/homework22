package by.epam.tr.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter count = new Counter(10,30,9);
		
		System.out.println(count.getCount());
		
		count.increace();
		System.out.println(count.getCount());
		count.decreeace();
		count.decreeace();
		System.out.println(count.getCount());
	}

}
