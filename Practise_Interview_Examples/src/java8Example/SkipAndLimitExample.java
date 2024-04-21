package java8Example;

import java.util.stream.IntStream;

public class SkipAndLimitExample {
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 10).skip(1).limit(5).forEach(result -> System.out.print(result + " "));

	}

}
