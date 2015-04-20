
public class Word implements Comparable<Word> {
	
	private String content;
	private int n=0;
	
	public Word(String s) {
		this.setContent(s);
		this.n=1;
	}
	
	public int count(){ return this.n;}
	
	public void inc(){ this.n++;}
	

	@Override
	public int compareTo(Word w) {
		if(this.content.length()==w.content.length()){
			return 0;
		}else if(this.content.length()>w.content.length()){
			return 1;
		}
		return -1;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public String toString() {
		return this.getContent()+": "+this.count();
	}

}
