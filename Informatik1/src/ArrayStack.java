
/*
 * 
 */
public class ArrayStack<E> implements Stack<E> {
	
	
	/**
	 * 
	 */
	private E[] array; 
	private int top;
	
	@SuppressWarnings("unchecked")
	public ArrayStack(int size) {
		array = (E[]) new Object[size];
		top = -1;
	}

	/*
	 * (non-Javadoc)
	 * @see Stack#istLeer()
	 */
	public boolean istLeer() {
		return top == -1;
		
	}
	
	/**
	 * Prueft ob der Stack voll ist 
	 * @return Liefert {@code true} wenn der Stack voll ist, liefert {@code false} wenn nicht
	 */
	public boolean istVoll() {
		return top+1==array.length;
	}

	/*
	 * (non-Javadoc)
	 * @see Stack#push(java.lang.Object)
	 */
	public void push(E e) throws StackFehler {
		if(istVoll()) throw new StackFehler("ArrayStack ist voll");
		array[++top]=e;
	}

	/*
	 * (non-Javadoc)
	 * @see Stack#pop()
	 */
	public void pop() throws StackFehler {
		if(istLeer()) throw new StackFehler("ArrayStack ist leer");
		array[top--]=null;		
	}

	/*
	 * (non-Javadoc)
	 * @see Stack#top()
	 */
	public E top() throws StackFehler {
		if(istLeer()) throw new StackFehler("ArrayStack ist leer");
		return array[top];
	}

	/*
	 * (non-Javadoc)
	 * @see Stack#poptop()
	 */
	public E poptop()throws StackFehler {
		E value = top();
		pop();
		return value;
	}
	
	
	public void multiPop(int e) throws StackFehler {
		for(int i =0;i<e;i++){
			if(istLeer()) throw new StackFehler("ArrayStack ist leer");
			pop();
		}
		
	}
	


	
}
