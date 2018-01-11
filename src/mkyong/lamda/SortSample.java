package mkyong.lamda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortSample {

	public static void main(String[] args) {
		// sortWithoutLamda();

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

		System.out.println("After Sort");

		
		Comparator<Developer> salaryComparator = (o1, o2)->o1.getSalary().compareTo(o2.getSalary());
		listDevs.sort(salaryComparator.reversed());
		
		// lambda here!
		//listDevs.sort((Developer o1, Developer o2) -> o1.getAge() - o2.getAge());

		// java 8 only, lambda also, to print the List
		listDevs.forEach((developer) -> System.out.println(developer));
	}

	public static void sortWithoutLamda() {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

		//sortBySalary(listDevs);
		//sortByReverseSalary(listDevs);
		Comparator<Developer> salaryComparator = (o1, o2)->o1.getSalary().compareTo(o2.getSalary());
		listDevs.sort(salaryComparator.reversed());

		System.out.println("After Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));

		return result;
	}

	public static void sortByAge(List<Developer> listDevs) {
		// sort by age
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});

		// lambda
		listDevs.sort((Developer o1, Developer o2) -> o1.getAge() - o2.getAge());

		// lambda, valid, parameter type is optional
		listDevs.sort((o1, o2) -> o1.getAge() - o2.getAge());
	}

	public static void sortByName(List<Developer> listDevs) {
		// sort by name
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		// lambda
		listDevs.sort((Developer o1, Developer o2) -> o1.getName().compareTo(o2.getName()));

		// lambda
		listDevs.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

	}

	public static void sortBySalary(List<Developer> listDevs) {
		// sort by salary
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getSalary().compareTo(o2.getSalary());
			}
		});

		// lambda
		listDevs.sort((Developer o1, Developer o2) -> o1.getSalary().compareTo(o2.getSalary()));

		// lambda
		listDevs.sort((o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));

	}
	public static void sortByReverseSalary(List<Developer> listDevs) {
		Comparator<Developer> salaryComparator = (o1, o2)->o1.getSalary().compareTo(o2.getSalary());
		listDevs.sort(salaryComparator.reversed());

	}
	public static void reverseComparator(List<Developer> listDevs) {
//		Comparator<Developer> salaryComparator = (o1, o2)->o1.getSalary().compareTo(o2.getSalary());
//		listDevs.sort(salaryComparator);
		
		Comparator<Developer> salaryComparator = (o1, o2)->o1.getSalary().compareTo(o2.getSalary());
		listDevs.sort(salaryComparator.reversed());
	}
}