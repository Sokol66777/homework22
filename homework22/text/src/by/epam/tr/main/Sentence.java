package by.epam.tr.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {

	private List<Word> sentence;
	public Sentence(List<Word> sentence) {
		this.sentence= new ArrayList<Word>();
		this.sentence.addAll(sentence);
	}
	public Sentence() {
		sentence=new ArrayList<Word>();
	}
	public List<Word> getSentence() {
		return sentence;
	}
	public void setSentence(List<Word> sentence) {
		this.sentence = sentence;
	}
	public void add(int index, Word word) {
		if(index<0 || index>=sentence.size()) {
			return;
		}
		sentence.add(index, word);
	}
	@Override
	public int hashCode() {
		return Objects.hash(sentence);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		return Objects.equals(sentence, other.sentence);
	}
	@Override
	public String toString() {
		return "Sentence [sentence=" + sentence + "]";
	}
	
}
