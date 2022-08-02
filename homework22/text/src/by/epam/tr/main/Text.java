package by.epam.tr.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text {

	private String title;
	private List<Sentence> text;
	public Text() {
		text=new ArrayList<Sentence>();
	}
	public Text(List<Sentence> sentences) {
		this.text=new ArrayList<Sentence>();
		this.text.addAll(sentences);
	}
	public Text(List<Sentence> sentences,String title) {
		this.text=new ArrayList<Sentence>();
		this.text.addAll(sentences);
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Sentence> getText() {
		return text;
	}
	public void setText(List<Sentence> text) {
		this.text = text;
	}
	public void add(int index, Sentence sentence) {
		if(index<0||index>text.size()) {
			return;
		}
		text.add(index, sentence);
	}
	@Override
	public int hashCode() {
		return Objects.hash(text, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		return Objects.equals(text, other.text) && Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "Text [title=" + title + ", text=" + text + "]";
	}
	
}
