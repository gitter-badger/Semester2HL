package WC;

public class Word implements Comparable<Word> {
	
	private String content;
	private int n=0;
	
	public Word(String s) {
		this.setContent(s);
		this.n=1;
	}
	
	/**
	 * Liefert die Anzahl eines Wortes
	 * @return Die Anzahl eiens Wortes 
	 */
	public int count(){ return this.n;}
	
	/**
	 * Incrementiert die Anzahl eines wortes 
	 */
	public void inc(){ this.n++;}
	
	
	@Override
	public int compareTo(Word w) {
		boolean equals=true;
		if(this.content.length()<w.getContent().length()){
			return -1;
		}
		if(this.content.length()==w.getContent().length()){
			for(int i=0;i<this.content.length();i++){
				if(this.content.charAt(i)!=w.getContent().charAt(i)){
					equals=false;
				}
			}
			if(equals){
				return 0;
			}
		}
		return 1;
	}

	/**
	 * Gibt den Inhalt eines Wortes 
	 * @return Den Inhalt eines Wortes
	 */
	public String getContent() {
		return this.content;
	}

	/**
	 * Setzt den Inhalt eines Wortes 
	 * @param content Den Inhalt den dieses Wort haben soll
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * Gibt das wort plus Anzahl aus 
	 */
	public String toString() {
		return this.getContent()+": "+this.count();
	}

}
