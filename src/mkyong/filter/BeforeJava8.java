package mkyong.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeforeJava8 {

	public static void main(String[] args) {
		List<String> lines = Arrays.asList("mkyong","ailunna","eddy");
		List<String> result = getFilterOutputResult(lines,"mkyong");
		for(String line:result) {
			System.out.println(line);
		}

	}

	private static List<String> getFilterOutputResult(List<String> lines, String toBeFilterOutStr) {
		List<String> resultList = new ArrayList<String>();
		for(String line:lines) {
			if(line.contains(toBeFilterOutStr) == false) {
				resultList.add(line);
			}
		}
		return resultList;
	}

}
