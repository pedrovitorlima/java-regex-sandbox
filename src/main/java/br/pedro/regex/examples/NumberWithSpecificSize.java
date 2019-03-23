package br.pedro.regex.examples;

import java.util.regex.Matcher;
import static br.pedro.regex.FindStringsWithPattern.search;

public class NumberWithSpecificSize {

	public static void main(String[] args) {
		//occurrence of a group (limited by parentesis) of
		//5 numbers and 3 numbers, splitted by an -
		final String cepRegex = "(\\d{5}-\\d{3})+";
		final String phrase = "My Brazilian's CEP is 59600-000!";
		
		final Matcher matcher = search(cepRegex, phrase);
		
		matcher.find();
		
		System.err.println("CEP: " + matcher.group(0));
	}
}
