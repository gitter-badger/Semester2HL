/**
 * 
 * @author eiamnancken
 *	Erstellt eine klasse ds Objektes Zelle mit der eigenschaft {@code E}
 * @param <E> Der Objekttyp der Klasse Zelle 
 */
class Zelle<E>{
	E inhalt;
	Zelle<E> next;
	public Zelle(E e) {
		inhalt=e;
	}
}

/**
 * Die Fehler klasse des Stacks
 * @author Sven Marquardt
 *
 */
@SuppressWarnings("serial")
class StackFehler extends RuntimeException{
	
	private String message;
	public StackFehler(String m) {
		message = m;
	}
	
	/**
	 * 
	 * Liefert eine fehler Nachricht 
	 */
	public String getMessage() {
		return this.message;
	}
}
/**
 * Erstellt eine ListStack 
 * @author Sven Marquardt
 *
 * @param <E> dateityp des ListStacks
 */
public class ListStack<E> implements Stack<E> {
	
	private Zelle<E> top;
	
	

	public boolean istLeer() {
		return top == null;
	}

	
	public void push(E e) {
		Zelle<E> neueZelle = new Zelle<E>(e);
		neueZelle.next=top;
		top=neueZelle;
	}

	
	public void pop() throws StackFehler {
		if(istLeer()) throw new StackFehler("ListStack ist leer!");
		top=top.next;
		
		
	}

	
	public E top() throws StackFehler {
		if(istLeer()) throw new StackFehler("ListStack ist leer!");
		return top.inhalt;
	}


	public E poptop() throws StackFehler {
		E value = top();
		pop();
		return value;
	}


	
	public void multiPop(int e) throws StackFehler {
		for(int i=0;i<e;i++){
			if(istLeer()) throw new StackFehler("ListStack ist leer");
			pop();
		}
		
	}

	
}
