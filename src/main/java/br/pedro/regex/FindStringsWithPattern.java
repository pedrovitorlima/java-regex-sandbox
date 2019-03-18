package br.pedro.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindStringsWithPattern {
	
	private FindStringsWithPattern() {
		//Only static
	}

	public static Matcher search(String regex, String toSearch) {
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(toSearch);
	}
}
