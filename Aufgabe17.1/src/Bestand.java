/**
 * Die klasse Bestand hält die Klasse Auto 
 * @author eiamnacken
 *
 */
public class Bestand {
	
	/**
	 * Prüft ob ein Auto Vorhanden ist und liefert boolean Autos müssen nur referenzgleich sein 
	 * @param auto Das auto das geprüft wird ob es vorhanden ist 
	 * @return true oder false wenn Auto vorhanden oder nicht
	 */
	public  boolean istVorhanden(Auto auto) {
		return true;
	}
	
	/**
	 * Nimmt ein Auto in den Bestand auf durch prüfen mit {@link #istVorhanden(Auto)}
	 * @param auto Das Auto das in den Bestand aufgenommen wird 
	 * @return true oder false ob das Auto aufgenommen wurde 
	 * @see #istVorhanden(Auto)
	 */
	public  boolean aufnehmen(Auto auto) {
		return true;
	}
	
	/**
	 * Ein Auto aus dem Bestand entnehmen 
	 * @param auto Das Auto das aus dem Bestand entnommen wird 
	 * @return true oder false ob entnehmen erfolgreich war 
	 */
	public  boolean entnehmen(Auto auto) {
		return true;
	}
	
	/**
	 * Liefert den Bestand als Auto[] 
	 * @return Auto[] um es Besser sortieren zu können 
	 */
	public  Auto[] getAutosAlsArray() {
		return null ;
	}
	
	/**
	 * Sortiert die Autos nach preis mit {@link #getAutosAlsArray()}
	 * @return Das Auto[] nach preis sortiert 
	 * @see #getAutosAlsArray()
	 */
	public Auto[] sortiertNachPreis() {
		return null;
	}

}
