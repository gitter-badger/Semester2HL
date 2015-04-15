
public class AllWords {
	private static int allWords=0;
	private Word words[];
	
	public AllWords(int max) {
		this.words= new Word[max];
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
			words[counter] = new Word(s);
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
		for (Word word : words) {
			allWordsbelongsToThis+=word.getContent()+" ";
		}
		return allWordsbelongsToThis;
	}
	
	

}
