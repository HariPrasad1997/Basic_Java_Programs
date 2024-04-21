package collections;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.add(0, 1);
		System.out.println(stack);

		Stack<Character> characters = new Stack<>();
		characters.push('K');
		characters.push('a');
		characters.push('r');
		characters.push('t');
		characters.push('h');
		characters.push('i');
		characters.push('k');
		characters.pop();
		System.out.println(characters);

	}

}
