import java.util.LinkedList;


public class AllWords {
	private int allWords=0;
	private LinkedList<Word> words = new LinkedList<Word>();
	
	public AllWords() {
		allWords++;
		
	}
	
	public void add(String s){
		boolean include = false;
		int counter=0;
		for(Word w : words){
			if (w!=null) {
				if (w.getContent().equalsIgnoreCase(s)) {
					w.inc();
					include = true;
				}
				counter++;
			}
			
		}
		if(!include){
			words.add(new Word(s));
		}
	}
	
	@SuppressWarnings("unused")
	public int distinctWords() {
		int counter=0;
		for (Word word : words) {
			counter++;
		}
		return counter;
	}
	
	public int totalWords() {
		return allWords;
	}
	
	public String toString() {
		String allWordsbelongsToThis="";
		while(!(words.isEmpty())){
			allWordsbelongsToThis+= words.pop() + " ";
		}
		return allWordsbelongsToThis;
	}
	
	

}
