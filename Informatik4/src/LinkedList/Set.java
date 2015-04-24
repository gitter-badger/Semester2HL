package LinkedList;

public interface Set<E> extends Collection<E>{
	public E get();
	public void goToFirst();
	public void goToNext();
	public boolean atEnd();
}
