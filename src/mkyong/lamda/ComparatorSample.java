package mkyong.lamda;

import java.util.Comparator;

public class ComparatorSample {

	public static void main(String[] args) {
		Comparator<Developer> byName =
				(Developer o1, Developer o2)->o1.getName().compareTo(o2.getName());
		
		Developer d1 = new Developer();
		d1.setName("a");
		Developer d2 = new Developer();
		d2.setName("d");
		int dd = byName.compare(d1, d2);
		System.out.println(dd);

	}

	public static void classicComparator() {
		Comparator<Developer> byName = new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
	}
}
