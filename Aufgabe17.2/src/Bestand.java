import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Die klasse Bestand hält die Klasse Auto
 * 
 * @author eiamnacken
 *
 */
public class Bestand {
	private ArrayList<Auto> bestand = new ArrayList<Auto>();
	private static DecimalFormat format = new DecimalFormat("#.##");

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
	 * Ermittelt die groesse des Bestandes
	 * 
	 * @return Die groesse des Bestandes kann auch null sein
	 */
	public int getBestandGroesse() {
		return bestand.size();
	}

	/**
	 * Prueft ob im bestand sich Autos befinden Prueft ob im bestand sich Autos
	 * befinden wenn ja wird ein true zurueck gegeben andernfalls false
	 * 
	 * @return true oder false je nach dem ob es leer ist oder nicht
	 */
	public boolean isBestandEmpty() {
		if (bestand.isEmpty() || bestand.size() == 0)
			return true;
		return false;
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
					auto[i] = auto[i + 1];
					auto[i + 1] = tmp;
					sorted = true;

				}

			}

		}
		return auto;
	}

	/**
	 * Errechnet die Erloese mit und ohne nachlass
	 * 
	 * @param nachlassUnfallfrei
	 *            Der Nachlass bei Unfallfreien Autos
	 * @param nachlass
	 *            Der Nachlass bei unfall Autos
	 * @return double Der Erloes
	 */
	public double erloes_inkl_nachlass(double nachlassUnfallfrei,
			double nachlass) {
		double summe = 0.0;
		if (isBestandEmpty())
			return 0.00d;
		for (Auto a : getAutosAlsArray()) {
			if (a.isUnfallwagen()) {
				summe += a.getPreis() - (a.getPreis() * nachlass);
			} else {
				summe += a.getPreis() - (a.getPreis() * nachlassUnfallfrei);
			}
		}
		// Replace muss sein wegen der Formatierung
		return Double.parseDouble(format.format(summe).replace(",", "."));
	}

	/**
	 * Gibt den vergeich mit nachlasss in % aus
	 * @param normal Der Nachlass ohne unfallwagen
	 * @param unfall Der Nachlass mit unfallwagen 
	 * @return In % den vergleich wie viel prozent mehr erloes erwitschaftet
	 *         wurde
	 */
	public double getNachlassProzent(double normal, double unfall) {
		return Double.valueOf(format.format(
				(erloes_inkl_nachlass(normal, normal) / erloes_inkl_nachlass(
						normal, unfall)) * 10).replace(",", "."));
	}

	/**
	 * Gibt den vergleich mit nachlass in € aus
	 * @param normal Der nachlass ohne unfallwagen
	 * @param unfall Der nachlass mit unfallwagen 
	 * @return Den wert in €
	 */
	public double getNachlassEuro(double normal, double unfall) {
		return Double.valueOf(format.format(
				erloes_inkl_nachlass(normal, normal)
						- erloes_inkl_nachlass(normal, unfall)).replaceAll(",",
				"."));
	}

}
