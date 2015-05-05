package LinkedList;

public interface Collection<E> extends Iterable<E> {
	/**
	 * Gibt die größe der Collection an
	 * @return Die größe der Collection
	 */
	int size();
	/**
	 * Prüft ob die Collection leer list
	 * @return true wenn leer anonsten false
	 */
	boolean isEmpty();
	/**
	 * Prüft ob ein bestimmtes Objekt bereits in der Collection vorhanden ist 
	 * @param e	Das zu überprüfende Objekt
	 * @return	True wenn es enthalten ist ansonsten false
	 */
	boolean contains (E e);
	/**
	 * Fügt ein Objekt der Collection hinzu 
	 * @param e Das Objekt das hinzugefügt wird 
	 * @return	true wenn das hinzufügen geklappt hat ansonsten false 
	 */
	boolean add(E e);
	/**
	 * Löscht ein element aus der Collection 
	 * @param e das zu löschende Objekt
	 * @return	false wenn löschen fehlgeschlagen ansonsten true 
	 */
	boolean remove(E e);
	/**
	 * Löscht das Element auf dem der Cursor gerade steht 
	 * @return true wenn es was zu löschen gab ansonsten false
	 */
	boolean remove();
	/**
	 *	Löscht alle Objekte aus der Liste 
	 */
	void clear();
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
