/**
 * 
 * @author eiamnancken
 *
 * @param <E>
 */
class Zelle<E>{
	E inhalt;
	Zelle<E> next;
	public Zelle(E e) {
		inhalt=e;
	}
}

class StackFehler extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	public StackFehler(String m) {
		message = m;
	}
}
/**
 * 
 * @author eiamnancken
 *
 * @param <E>
 */
public class ListStack<E> implements Stack<E> {
	
	private Zelle<E> top;
	
	
	/**
	 * 
	 * 
	 */
	public boolean istLeer() {
		return top == null;
	}

	/**
	 * 
	 */
	public void push(E e) {
		Zelle<E> neueZelle = new Zelle<E>(e);
		neueZelle.next=top;
		top=neueZelle;
	}

	/**
	 * 
	 */
	public void pop() throws StackFehler {
		if(istLeer()) throw new StackFehler("Stack ist leer!");
		top=top.next;
		
	}

	/**
	 * 
	 */
	public E top() throws StackFehler {
		if(istLeer()) throw new StackFehler("Stack ist leer!");
		return top.inhalt;
	}

	/**
	 * 
	 */
	public E poptop() {
		E value = top();
		pop();
		return value;
	}
	
}
