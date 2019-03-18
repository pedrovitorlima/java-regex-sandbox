package br.pedro.regex.examples;

import static br.pedro.regex.FindStringsWithPattern.search;

import java.util.regex.Matcher;

public class ThatStartsWithNumber {

	public static void main(String[] args) {
		final String text = "100 will be catched";
		final String regexNumberStart = "([0-9]*)";
		final String regexNoNumberPhrase = "([0-9]*)(.*)";
		
		final Matcher matcherInitialNumberOfPhrase = search(regexNumberStart, text);
		final Matcher matcherPhraseThatStartsWithNumber = search(regexNoNumberPhrase, text);

		matcherInitialNumberOfPhrase.find();
		matcherPhraseThatStartsWithNumber.find();
		
		System.err.println(matcherInitialNumberOfPhrase.group());
		System.err.println(matcherPhraseThatStartsWithNumber.group());
	}

}
