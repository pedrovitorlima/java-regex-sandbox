package br.pedro.regex.examples;

import static br.pedro.regex.FindStringsWithPattern.search;

import java.util.regex.Matcher;

public class ThatHasPhraseModel {

	public static void main(String[] args) {
		final String phraseInFormatCorrect1 = "how much is 100 gold credits?";
		final String phraseInFormatCorrect2 = "how much is 1958 iron credits?";
		final String phraseWrongFormat1 = "how much is 100 credits?";
		final String phraseWrongFormat2 = "how much is 100 iron credits";
		
		final String regexPhraseFormat = "how much is ([0-9]*) (gold|silver|iron) credits\\?";
		
		final Matcher matcherCorrectFormatPhrase1 = search(regexPhraseFormat, phraseInFormatCorrect1);
		final Matcher matcherCorrectFormatPhrase2 = search(regexPhraseFormat, phraseInFormatCorrect2);
		final Matcher matcheerWrongFormatPhrase1 = search(regexPhraseFormat, phraseWrongFormat1);
		final Matcher matcheerWrongFormatPhrase2 = search(regexPhraseFormat, phraseWrongFormat2);

		System.err.println(matcherCorrectFormatPhrase1.find()); //true
		System.err.println(matcherCorrectFormatPhrase2.find()); //true
		
		System.err.println(matcheerWrongFormatPhrase1.find()); //false
		System.err.println(matcheerWrongFormatPhrase2.find()); //false
	}
}
