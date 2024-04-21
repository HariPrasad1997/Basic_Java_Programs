package programs_Java8;

import java.util.stream.IntStream;

public class SkipAndLimitMethodExample {
	public static void main(String[] args) {
		IntStream rangeClosed = IntStream.rangeClosed(1, 10);
		rangeClosed.skip(5).limit(5).forEach(System.out::println);
	}

}
