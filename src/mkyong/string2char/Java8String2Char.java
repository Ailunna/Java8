package mkyong.string2char;

public class Java8String2Char {

	public static void main(String[] args) {

		String password = "password123";

		password.chars() // IntStream
				.mapToObj(x -> (char) x)// Stream<Character>
				.forEach(System.out::println);

	}

}

class StringToCharArray {

    public static void main(String[] args) {

        String password = "password123";

        char[] passwordInCharArray = password.toCharArray();

        for (char temp : passwordInCharArray) {
            System.out.println(temp);
        }

    }

}
