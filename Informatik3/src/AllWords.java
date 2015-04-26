import java.util.LinkedList;

import javax.management.ListenerNotFoundException;

/**
 * 
 * @author Sven Marquardt
 *
 */
public class AllWords {
	private LinkedList<Word> words = new LinkedList<Word>();
	
	
	
	/**
	 * Fügt der Liste ein neues Wort hinzu wenn es nicht schon vorhanden ist. 
	 * Groß und kleinschreibung wird missachtet 
	 * @param s	Das neue Wort das hinzuzufügen ist 
	 * @throws Exception 
	 */
	public void add(String s) {
		boolean include = false;//Wenn false wort noch nicht vorhanden 
		String string = cutSpecial(s);
		Word x = new Word(string);
		for(Word w : words){
				if (w.compareTo(x)==0) {
					w.inc();
					include = true;
				}
			
		}
		if(!include){
			words.add(x);
		}
	}
	
	/**
	 * Gibt die Anzahl der verschiedenen Wörter wieder was bei unserer Liste ja nur die groesse ist
	 * @return	Die Anzahl der verschiedenen Woerter
	 * @throws ListenerNotFoundException 
	 */
	public int distinctWords() throws NullPointerException{
		if(words.isEmpty()) throw new NullPointerException("Liste ohne Inhalt!!");
		return words.size();
	}
	
	/**
	 * Gibt die Anzahl aller Woerter also auch wenn eines zweimal vorkommt wieder
	 * @return	DIe Anzahl aller Woerter
	 */
	public int totalWords() throws NullPointerException{
		if(words.isEmpty()) throw new NullPointerException("Liste ohne Inhalt");
		int allWords=0;
		for(Word w : words){
			allWords+=w.count();
		}
		return allWords;
	}
	
	/**
	 * Gibt fuer jedes Wort in der Liste das Wort aus 
	 * {@link #words.toString}
	 */
	public String toString() throws NullPointerException{
		if(words.isEmpty()) throw new NullPointerException("Liste ohne Inhalt");
		String allWordsbelongsToThis="";
		for(Word w : words){
			allWordsbelongsToThis += w.toString() +"\n";
		}
		return allWordsbelongsToThis;
	}
	
	/**
	 * Gibt das am meisten genutzte Wort zurueck und sortiert dabei die Liste mittels Quicksort fuer vielleicht 
	 * spaeter verwendungen
	 * @return	Das am meisten genutzte Wort
	 */
	public Word mostUsed() {
		if(words.isEmpty()) System.out.println("Liste ohne Inhalt");
		sort(0,words.size()-1);
		return words.get(words.size()-1);
	}
	
	/**
	 * Quicksort Methode
	 * @param low	Anfang der Liste
	 * @param high	Ende der Liste
	 */
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
	
	/**
	 * Tauscht zwei elemente in der Liste nur durch Quicksort aufrufen 
	 * @param i	Erstes Listen element
	 * @param j	Zweites Listen element
	 */
	private void swap(int i,int j){
		Word tmp = words.get(i);
		words.set(i, words.get(j));
		words.set(j, tmp);
	}
	
	private String cutSpecial(String word) {
		String string="";
		for (String s : word.split("")) {
			if(!(s.matches("[!?().,:-]"))&&!(s.matches("[\"';&{}]"))){
				string+=s;
			}
		}
		return string;
	}
	
	
	
	

}
