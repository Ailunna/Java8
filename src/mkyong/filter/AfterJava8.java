package mkyong.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AfterJava8 {
	public static void main(String[] args) {
		List<String> lines = Arrays.asList("mkyong","Ailunna","Eddy","Tidy");
		List<String> result = lines.stream().filter(line2->!"mkyong".equals(line2)).collect(Collectors.toList());
		result.forEach(System.out::println);
	}

}
