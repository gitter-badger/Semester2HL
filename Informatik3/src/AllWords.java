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
				if (w.getContent().equals(s)) {
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
		return words.size()-1;
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
	
	public Word mostUsed(){
		sort(0,words.size()-1);
		return words.get(words.size()-1);
	}
	
	private  void sort(int low,int high){
		int i=low;
		int j=high;
		
		int pivot = words.get(low+(high-low)/2).count();
		while(i<=j){
			while(words.get(i).count()<pivot){
				i++;
			}
			while(words.get(j).count()>pivot){
				j--;
			}
			if(i<=j){
				swap(i,j);
				i++;
				j--;
			}
		}
			if(low<j){
				sort(low,j);
			}
			if(i<high){
				sort(i,high);
			}
		
	}
	
	private void swap(int i,int j){
		Word tmp = words.get(i);
		words.set(i, words.get(j));
		words.set(j, tmp);
	}
	
	
	
	

}
