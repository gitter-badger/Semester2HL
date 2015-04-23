package LinkedList;

public interface List<E> extends Collection<E> {
	public E get();
	public boolean remove();
	public void goToFirst();
	public void goToNext();
	public boolean atEnd();
}
