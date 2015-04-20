/**
 * 
 * @author Sven Marquardt
 *
 */
public class Word implements Comparable<Word> {
	
	/**
	 * Der Inhalt eines Wortes
	 */
	private String content;
	/**
	 * Die Anzahl eines Wortes im Text
	 */
	private int n=0;
	
	public Word(String s) {
		this.setContent(s);
		this.n=1;
	}
	
	/**
	 * Get anzahl des Wortes
	 * @return	Anzahl des Wortes
	 */
	public int count(){ return this.n;}
	
	/**
	 * Inkrementiere Anzahl des Wortes um einen
	 */
	public void inc(){ this.n++;}
	

	public int compareTo(Word w) throws ClassCastException {
		if(w==null) throw new ClassCastException();
		if(this.content.length()==w.content.length()){
			return 0;
		}else if(this.content.length()>w.content.length()){
			return 1;
		}
		return -1;
	}

	/**
	 * Liefert den Inhalt eines Wortes 
	 * @return	Den Inhalt eines Wortes
	 */
	public String getContent() {
		return this.content;
	}

	/**
	 * Setzt den Inhalt eines Wortes 
	 * @param content	Der Inhalt 
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * Liefert das Wort samt Anzahl als String content:count
	 */
	public String toString() {
		return this.getContent()+": "+this.count();
	}

}
