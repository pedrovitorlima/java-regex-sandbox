package br.pedro.regex.examples;

import static br.pedro.regex.FindStringsWithPattern.search;

import java.util.regex.Matcher;

public class ThatStartsAndEndsWithWords {

	public static void main(String[] args) {
		final String text = "since that day mary loves bob";
		final String regex = "mary (.*) bob";
		
		Matcher matcher = search(regex, text);

		matcher.find();
		
		System.err.println(matcher.group());
	}
}
