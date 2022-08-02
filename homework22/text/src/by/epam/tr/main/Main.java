package by.epam.tr.main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextPrint printToConcole = new TextPrint();

		List<Word> w1 = new ArrayList<Word>();
		w1.add(new Word("hi"));
		w1.add(new Word("11"));
		w1.add(new Word("2"));
		w1.add(new Word("45"));
		
		List <Word> w2 = new ArrayList<Word>();
		w2.add(new Word("home"));
		w2.add(new Word("222"));
		w2.add(new Word("333"));
		w2.add(new Word("444"));
		Sentence s1 = new Sentence (w1);
		Sentence s2 = new Sentence (w2);
		s2.add(1, new Word("welcome"));
		List<Sentence> sentences = new ArrayList<Sentence>();
		sentences.add(s1);
		Text text = new Text(sentences, "my life");
		text.add(0, s2);
		printToConcole.textPrint(text);
	}
}
