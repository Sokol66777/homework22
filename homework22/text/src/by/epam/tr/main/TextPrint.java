package by.epam.tr.main;

public class TextPrint {

	public void textPrint(Text text) {
		System.out.println("\t\t"+text.getTitle().toUpperCase());
		for(Sentence s:text.getText()) {
			sentencePrint(s);
		}
	}
	private void sentencePrint(Sentence sentence) {
		StringBuilder str = new StringBuilder("");
		for(Word w : sentence.getSentence()) {
			str.append(w.getWord()).append(" ");
		}
		str.replace(str.length()-1, str.length(), ". ");
		str.replace(0, 1, str.substring(0, 1).toUpperCase());
		System.out.print(str);
	}
}
