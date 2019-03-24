package br.pedro.regex.examples;

import static br.pedro.regex.FindStringsWithPattern.search;

import java.util.regex.Matcher;

public class ThatAreBetweenSomething {
	
	public static void main(String[] args) {
		
		final String command = "This is a command with ${var1} and ${var2} and {var3} vars.";
		
		//anything that has one or more occurrences between ${ and }
		//equivalent of ${(.+?)}
		//pay some attention that {var3} does not have the $ character so it will not match
		final String regexExp = "\\$\\{(.+?)\\}";

		Matcher matcher = search(regexExp, command);
		
		//for every match of our regex...
		while(matcher.find()) {
			System.err.println(matcher.group(0) + " content => " + matcher.group(1));
		}
		
	}

}
