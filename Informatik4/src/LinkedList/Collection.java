package LinkedList;

public interface Collection<E> extends Iterable<E> {
	public int size();
	public boolean isEmpty();
	public boolean contains (E e);
	public boolean add(E e);
	public boolean remove(E e);
	public void clear();
	/**
	* getMatch is not part of standard Java.
	* Like contains, it checks if e is in the set.
	* If it is, it returns the reference to the matching
	* object; otherwise it returns null.
	* @param e the object to search for.
	* @return if contains(e) is false, the return value is null;
	* otherwise, the return value is the object that causes
	* contains(e) to return true.
	*/
	E getMatch(E e);
}
