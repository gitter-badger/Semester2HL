/**
 * Klasse Person 
 * @author Sven Marqaurdt
 *
 */
public class Person {
	private String vorname;
	private String nachname;
	
	/**
	 * Konstruktur fuer Person 
	 * Erstellt ein Objekt von Person 
	 * @param vorname Der vorname der Person 
	 * @param nachname Der nachname der Person 
	 */
	public Person(String vorname,String nachname){
		this.vorname=vorname;
		this.nachname=nachname;
	}
	
	/**
	 * Gibt die Person als String aus 
	 */
	public String toString() {
		return this.vorname + " "+this.nachname;
	}
}
