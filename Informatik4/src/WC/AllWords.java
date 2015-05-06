package WC;

import LinkedListSet.LinkedListSet;

public class AllWords {
	private static int allWords;
	private LinkedListSet<Word> words;
	
	public AllWords() {
		this.words= new LinkedListSet<Word>();
		this.allWords=0;
		
	}
	
	/**
	 * Fügt der Liste ein neues Wort hinzu wenn es nicht schon vorhanden ist. 
	 * Groß und kleinschreibung wird missachtet 
	 * @param s	Das neue Wort das hinzuzufügen ist 
	 */
	public void add(String s){
		if(s.isEmpty()||s==null) return;
		s=cutSpecial(s);
		Word wort = new Word(s);
		if(!words.add(wort)){
			words.getMatch(wort).inc();
		}
		this.allWords++;
	}
	
	
	/**
	 * Gibt die Anzahl der verschiedenen Wörter wieder was bei unserer Liste ja nur die groesse ist
	 * @return	Die Anzahl der verschiedenen Woerter
	 */
	public int distinctWords() {
		return this.words.size();
	}
	
	/**
	 * Gibt die Anzahl aller Woerter also auch wenn eines zweimal vorkommt wieder
	 * @return	DIe Anzahl aller Woerter
	 */
	public int totalWords() {
		return allWords;
	}
	
	/**
	 * Gibt fuer jedes Wort in der Liste das Wort aus 
	 * {@link #words.toString}
	 */
	public String toString() {
		String allWordsbelongsToThis="";
		for (Word word : words) {
			allWordsbelongsToThis+=word.toString()+"\n";
		}
		return allWordsbelongsToThis;
	}
	
	/**
	 * Filtert sonderzeichen aus und gibt ein sauberes Wort zurück
	 * @param word Das wort dessen sonderzeichen rausgefitert werden sollen 
	 * @return Das Wort ohne sonderzeichen
	 */
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
