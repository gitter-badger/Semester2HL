package LinkedList;

public interface List<E> extends Collection<E> {
	/**
	 * Gibt den momentanen Inhalt zurück 
	 * @return Den Inhalt 
	 */
	public E get();
	/**
	 * Setzt den Cursor auf die erste Stelle der Liste 
	 */
	public void goToFirst();
	/**
	 * Setzt den Cursor auf die nächste Stelle
	 */
	public void goToNext();
	/**
	 * Gibt an ob sich  der Cursor am ende der Liste befindet 
	 * @return true wenn am ende der Liste ansonsten false
	 */
	public boolean atEnd();
}
