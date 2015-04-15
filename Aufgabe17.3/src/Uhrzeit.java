/**
 * Klasse Uhrzeit 
 * @author Sven Marquardt 
 *
 */
public class Uhrzeit {

	private int stunde;
	private int minute;
	
	/**
	 * Konstruktur fuer die Klasse Uhrzeit 
	 * Erstellt ein Objekt von Uhrzeit 
	 * @param stunde Die stunde der Uhr 
	 * @param minute Die minute der Uhr
	 */
	Uhrzeit(int stunde,int minute){
		this.stunde=stunde;
		this.minute=minute;
	}
	
	/**
	 * Gibt die Uhrzeit als String aus beispiel {@code 12:30}
	 */
	public String toString() {
		return this.stunde +":"+this.minute+" Uhr";
	}
}
