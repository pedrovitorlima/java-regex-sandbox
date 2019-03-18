package br.pedro.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicUseRegex {

	public static void main(String[] args) {
		//Create the regex pattern: .s = single character
		Pattern pattern = Pattern.compile(".s");
		//Apply this pattern on String "as"
		Matcher matcher = pattern.matcher("as");
		//If the pattern is applicable
		boolean found = matcher.matches();
		
		System.err.println(found);
	}
}
