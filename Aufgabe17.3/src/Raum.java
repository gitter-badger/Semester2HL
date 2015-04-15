import java.util.ArrayList;

/**
 * Klasse Raum
 * @author Sven Marquardt
 *
 */
public class Raum {
	private int geb;
	private int etage;
	private int raum;
	protected ArrayList<Reservierung> reservierung = new ArrayList<Reservierung>();
	
	/**
	 * Konstruktur fuer Raum
	 * Erstellt ein Objekt von Raum 
	 * @param geb Das gebaeude fuer den Raum 
	 * @param etage Die Etage des Raums 
	 * @param raum Die Raumnummer des Raums
	 */
	public Raum(int geb,int etage,int raum){
		this.geb=geb;
		this.etage=etage;
		this.raum=raum;
	}
	/**
	 * Gibt den Raum als String aus
	 * Gibt den Raum als String aus Beispiel der Aufruf {@code new Raum r1 = new Raum(18,0,1)} liefert 
	 * {@code 18-0.1}
	 * plus der Reservierung toString() methode   
	 */
	 public String toString() {
		String str = null;
		str = this.geb +"-"+this.etage+"."+this.raum;
		for (Reservierung r : reservierung) {
			str += r.toString();
		}
		return str+"\n";
	}
	
	public void addReservierung(Reservierung neuReservierung) {
		reservierung.add(neuReservierung);
	}
	 
	
}
