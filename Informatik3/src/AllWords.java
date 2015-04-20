import java.util.LinkedList;


public class AllWords {
	private LinkedList<Word> words = new LinkedList<Word>();
	
	public AllWords() {
	}
	

	public void add(String s){
		boolean include = false;
		if(s.isEmpty()) return;
		if(s.equals("")) return;
		for(Word w : words){
			if (w!=null) {
				if (w.getContent().equalsIgnoreCase(s)) {
					w.inc();
					include = true;
				}
			}
			
		}
		if(!include){
			words.add(new Word(s));
		}
	}
	
	public int distinctWords() {
		int counter=0;
		for (@SuppressWarnings("unused") Word word : words) {
			counter++;
		}
		return counter;
	}
	
	public int totalWords() {
		int allWords=0;
		for(Word w : words){
			allWords+=w.count();
		}
		return allWords;
	}
	
	public String toString() {
		String allWordsbelongsToThis="";
		for(Word w : words){
			allWordsbelongsToThis += w.toString() +"\n";
		}
		return allWordsbelongsToThis;
	}
	
	

}
