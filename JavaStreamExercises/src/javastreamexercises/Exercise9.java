package javastreamexercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise9 {

	public static void main(String[] args) {
		// Write a Stream Expression to convert a char list to a string
		
		ArrayList<Character> alma = new ArrayList<>(Arrays.asList('A', 'l', 'm', 'a'));
		
		String word = alma.stream().map(c -> c.toString()).collect(Collectors.joining());
		
		System.out.println(word);

	}

}
