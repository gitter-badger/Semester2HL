/*
 * Das Interface des Stacks 
 */
public interface Stack<E> {
	/**
	 * Liefert {@code true} oder {@code false} wenn ein Stack leer ist oder nicht
	 * @return {@code true} bei leerem Stack, {@code false} bei nicht leeren Stack
	 */
	boolean istLeer();
	/**
	 * Platziert einen neuen Wert auf den stack 
	 * @param e Der wert der auf den Stack gelegt wird 
	 */
	void push(E e);
	/**
	 * Entfernt das erste element vom Stack und verringert dessen groessee um einen
	 */
	void pop();
	/**
	 * Liefert den obersten wert des Stacks
	 * @return Liefert den obersten wert des Stacks {@code E}
	 */
	E top();
	/**
	 * Lifert das oberste Element und löscht es 
	 * @return Das oberste Element des Stacks {@code E} 
	 */
	E poptop();
	/**
	 * Fürht eine mehrfaches pop aus 
	 * @param e Definiert wie oft pop angewendet wird
	 */
	void multiPop(int e);

}
