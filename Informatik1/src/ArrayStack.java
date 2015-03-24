
/*
 * 
 */
public class ArrayStack<E> implements Stack<E> {
	
	private E[] array;
	private int top;
	
	@SuppressWarnings("unchecked")
	public ArrayStack() {
		array = (E[]) new Object[10];
		top = -1;
	}

	/*
	 * (non-Javadoc)
	 * @see Stack#istLeer()
	 */
	public boolean istLeer() {
		return top == -1;
		
	}
	
	/*
	 * 
	 */
	public boolean istVoll() {
		return top+1==array.length;
	}

	/*
	 * (non-Javadoc)
	 * @see Stack#push(java.lang.Object)
	 */
	public void push(E e) throws StackFehler {
		if(istVoll()) throw new StackFehler("Stack ist voll");
		array[++top]=e;
	}

	/*
	 * (non-Javadoc)
	 * @see Stack#pop()
	 */
	public void pop() throws StackFehler {
		if(istLeer()) throw new StackFehler("Stack ist leer");
		array[top--]=null;		
	}

	/*
	 * (non-Javadoc)
	 * @see Stack#top()
	 */
	public E top() throws StackFehler {
		if(istLeer()) throw new StackFehler("Stack ist leer");
		return array[top];
	}

	/*
	 * (non-Javadoc)
	 * @see Stack#poptop()
	 */
	public E poptop() {
		E value = top();
		pop();
		return value;
	}
	
}
