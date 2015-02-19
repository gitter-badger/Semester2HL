import java.util.ArrayList;

/**
 * Die Klasse Mitarbeiter erbt von Person 
 * @author Sven Marquardt
 *
 */
public class Mitarbeiter extends Person{
	private String email;
	protected ArrayList<Reservierung> reservierung = new ArrayList<Reservierung>();
	
	/**
	 * Konstruktur fuer den Mitarbeiter
	 * Konstruktur fuer den Mitarbeiter ruft den Konstruktur von Person auf 
	 * @param vorname Vorname der Person 
	 * @param nachname Nachname der Person 
	 * @param email Email der Person 
	 */
	public Mitarbeiter(String vorname,String nachname,String email){
		super(vorname,nachname);
		this.email=email;
	}
	
	/**
	 * Gibt den Mitarbeiter als String zurueck z.B. {@code Max Mustermann(email@beispiel.com)} 
	 */
	public String toString() {
		return super.toString() + " (" + this.email+")";
	}
	
	/**
	 * Reserviert fuer einen Mitarbeiter einen Raum wie in der Aufgabe beschrieben 
	 * @param raum Der raum der reserviert wird 
	 * @param stunde Die zeit in stunden in der reserviert wird 
	 * @param minute Die zeit in minuten in der reserviert wird 
	 * @param str Die Abteilung die reserviert hat z.B. "IT"
	 */
	public void reserviere(Raum raum,Uhrzeit beginn, Uhrzeit ende,String bemerkung) {
		Reservierung r = new Reservierung(beginn, ende);
		reservierung.add(r);
		reservierung.get(reservierung.indexOf(r)).setBemerkung(bemerkung);
		reservierung.get(reservierung.indexOf(r)).setMitarbeiter(this);
		reservierung.get(reservierung.indexOf(r)).setRaum(raum);
		
		
	}
	
	
}
