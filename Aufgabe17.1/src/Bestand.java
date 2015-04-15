import java.util.ArrayList;

/**
 * Die klasse Bestand hält die Klasse Auto
 * 
 * @author eiamnacken
 *
 */
public class Bestand {
	private ArrayList<Auto> bestand = new ArrayList<Auto>();

	/**
	 * Prüft ob ein Auto Vorhanden ist und liefert boolean Autos müssen nur
	 * referenzgleich sein
	 * 
	 * @param auto
	 *            Das auto das geprüft wird ob es vorhanden ist
	 * @return true oder false wenn Auto vorhanden oder nicht
	 */
	public boolean istVorhanden(Auto auto) {
		for (int i = 0; i < bestand.size(); i++) {
			if (bestand.get(i).equals(auto))
				return true;
		}
		return false;
	}

	/**
	 * Nimmt ein Auto in den Bestand auf durch prüfen mit
	 * {@link #istVorhanden(Auto)}
	 * 
	 * @param auto
	 *            Das Auto das in den Bestand aufgenommen wird
	 * @return true oder false ob das Auto aufgenommen wurde
	 * @see #istVorhanden(Auto)
	 */
	public boolean aufnehmen(Auto auto) {
		if (istVorhanden(auto))
			return false;
		bestand.add(auto);
		return true;
	}

	/**
	 * Ein Auto aus dem Bestand entnehmen
	 * 
	 * @param auto
	 *            Das Auto das aus dem Bestand entnommen wird
	 * @return true oder false ob entnehmen erfolgreich war
	 */
	public boolean entnehmen(Auto auto) {
		if (istVorhanden(auto)) {
			bestand.remove(bestand.indexOf(auto));
			return true;
		}
		return false;
	}

	/**
	 * Liefert den Bestand als Auto[]
	 * 
	 * @return Auto[] um es Besser sortieren zu können
	 */
	public Auto[] getAutosAlsArray() {
		Auto[] auto = new Auto[bestand.size()];
		for (int i = 0; i < bestand.size(); i++) {
			auto[i] = bestand.get(i);
		}
		return auto;
	}

	/**
	 * Sortiert die Autos nach preis mit {@link #getAutosAlsArray()}
	 * 
	 * @return Das Auto[] nach preis sortiert
	 * @see #getAutosAlsArray()
	 */
	public Auto[] sortiertNachPreis() {
		boolean sorted = true;
		Auto[] auto = getAutosAlsArray();
		while (sorted) {
			sorted = false;
			for (int i = 0; i < auto.length - 1; i++) {
				if (auto[i].getPreis() < auto[i + 1].getPreis()) {
					Auto tmp = auto[i];
					auto[i] = auto[i+1];
					auto[i+1]=tmp;
					sorted = true;

				}

			}

		}
		return auto;
	}

}
