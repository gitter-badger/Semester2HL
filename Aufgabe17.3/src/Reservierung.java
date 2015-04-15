
/**
 * Klasse Reservierung
 * @author Sven Marquardt
 *
 */
public class Reservierung  {
	
	private String bemerkung;
	private Uhrzeit beginn;
	private Uhrzeit ende;
	protected Mitarbeiter mitarbeiter;
	protected Raum raum;
	
	/**
	 * Konstruktur fuer Reservierung 
	 * Erstellt ein neues Objekt von Reservierung 
	 * @param beginn Anfang der Reservierung
	 * @param ende Ende der Reservierung
	 */
	public Reservierung(Uhrzeit beginn,Uhrzeit ende){
		this.beginn=beginn;
		this.ende=ende;
	}
	
	/**
	 * Setzt die bemerkung einer reservierung
	 * @param bemerkung Die bemerkung zu der reservierung 
	 */
	public void setBemerkung(String bemerkung) {
		this.bemerkung= bemerkung;
	}
	
	/**
	 * Setzt den Mitarbeiter 
	 * @param mitarbeiter Der Mitarbeiter 
	 */
	public void setMitarbeiter(Mitarbeiter mitarbeiter) {
		this.mitarbeiter=mitarbeiter;
	}
	
	/**
	 * Setzt den Raum
	 * @param raum Der Raum 
	 */
	public void setRaum(Raum raum) {
		raum.addReservierung(this);
	}
	
	/**
	 * Gibt die reservierung als String aus wie in der Aufgabe beschrieben
	 */
	public String toString() {
		return 	" \ngebucht von "+ mitarbeiter.toString() +
				" von "+ this.beginn + " bis " + this.ende + " fuer " + this.bemerkung;
	}
}
