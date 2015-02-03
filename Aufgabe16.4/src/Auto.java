import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.LinkedList;
import java.util.List;

/**
 * Erstellt eine Klasse Auto
 * 
 * @author Sven Marquardt
 *
 */
public class Auto {
	private String hersteller;
	private long laufleistung;
	private double preis;
	private String farbe;
	private boolean unfallwagen;
	private String kraftstoff;
	private double leistung;
	private static List<Auto> autos = new LinkedList<Auto>();
	private static DecimalFormat format = new DecimalFormat("#.##");

	/**
	 * Zum erstellen mehrer Autos
	 * 
	 * @param h
	 *            Der hersteller des Autos
	 * @param l
	 *            Die Laufzeit des Autos
	 * @param p
	 *            Der Preis des Autos
	 * @param f
	 *            Die farbe des Autos
	 * @param u
	 *            Ob Unfallwagen oder nicht
	 * @param k
	 *            Der Kraftstoff des Autos
	 * @param le
	 *            Die leistung des Autos
	 */
	public Auto(String h, long l, double p, String f, boolean u, String k,
			double le) {
		this.hersteller = h;
		this.laufleistung = l;
		this.preis = p;
		this.farbe = f;
		this.unfallwagen = u;
		this.kraftstoff = k;
		this.leistung = le;
		autos.add(this);
	}

	/**
	 * Gibt den Bestand an Autos aus {@link #autos}
	 * 
	 * @return List Die Autos
	 */
	public static List<Auto> getBestand() {
		return autos;
	}

	/**
	 * Zählt die anzahl der Autos in {@link #autos}
	 * 
	 * @return int Die Anzahl der Autos
	 */
	public static int getAnzahl() {
		int i = 0;
		for (@SuppressWarnings("unused")
		Auto a : autos) {
			i++;
		}
		return i;
	}

	/**
	 * Getter Methode
	 * 
	 * @return String Den Herrsteller
	 */
	public String getHersteller() {
		return this.hersteller;
	}

	/**
	 * Getter Methode
	 * 
	 * @return Die Laufleistung
	 */
	public double getLaufleistunng() {
		return this.laufleistung;
	}

	/**
	 * Getter Mehtode
	 * 
	 * @return Den Preis
	 */
	public double getPreis() {
		return this.preis;
	}

	/**
	 * Getter Methode
	 * 
	 * @return Die Farbe
	 */
	public String getFarbe() {
		return this.farbe;
	}

	/**
	 * Getter Methode
	 * 
	 * @return Den Unfalltyp
	 */
	public boolean isUnfallwagen() {
		return this.unfallwagen;
	}

	/**
	 * Getter Methode
	 * 
	 * @return Den Kraftstoff
	 */
	public String getKraftstoff() {
		return this.kraftstoff;
	}

	/**
	 * Getter Methode
	 * 
	 * @return Die Leistung
	 */
	public double getLeistung() {
		return this.leistung;
	}

	/**
	 * Is Mehtode für List {@link #autos}
	 * 
	 * @return Wenn leer true ansonsten false
	 */
	private static boolean isemptyAutos() {
		return autos == null || autos.isEmpty() ? true : false;
	}

	/**
	 * Gibt die Autos als String zurück
	 */
	public String toString() {
		return "-------\nHersteller: " + this.hersteller + "\n" + "Preis: "
				+ this.preis + "€\n" + "Motor: " + this.leistung + "PS ("
				+ this.kraftstoff + ")\n" + "KM-Stand: " + this.laufleistung
				+ " km\n" + "Farbe: " + this.farbe + "\n"
				+ (!this.unfallwagen ? "unfallfrei" : "" + "------\n");

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
	public static double erloes_inkl_nachlass(double nachlassUnfallfrei,
			double nachlass) {
		double summe = 0.0;
		if (isemptyAutos())
			return 0.00d;
		for (Auto a : autos) {
			if (a.isUnfallwagen()) {
				summe += a.preis - (a.preis * nachlass);
			} else {
				summe += a.preis - (a.preis * nachlassUnfallfrei);
			}
		}
		// Replace muss sein wegen der Formatierung
		return Double.parseDouble(format.format(summe).replace(",", "."));
	}
	
	
	public static double erloes_vergleich_prozent() {
		return Double.valueOf(format.format((erloes_inkl_nachlass(0.1 ,0.1)/erloes_inkl_nachlass(0.1, 0.25))*10).replace(",", "."));
	}
	
	public static double erloes_vergleich_wert() {
		return Double.valueOf(format.format(erloes_inkl_nachlass(0.10, 0.1)-erloes_inkl_nachlass(0.10, 0.25)).replaceAll(",", "."));
	}

	/**
	 * Berrechnung der Kraftstoffarten
	 * 
	 * @param string
	 *            Die zu berrechnende Kraftstoffart
	 * @return String In Prozent den Kraftstoffanteil
	 */
	public static String anteil_kraftstoffart(String string) {
		int i = 0;
		if (isemptyAutos())
			return "";
		for (Auto a : autos) {
			if (a.kraftstoff.equals(string)) {
				i++;
			}
		}
		return "" + i / ((double) getAnzahl() / 100);
	}

	/**
	 * Errechnet den Prozentigen anteil an Unfallwagen in {@link #autos}
	 * 
	 * @return String Den Prozentigen Anteil an Unfallwagen
	 */
	public static String anteil_unfallwagen() {
		int i = 0;
		if (isemptyAutos())
			return "";
		for (Auto a : autos) {
			if (a.isUnfallwagen()) {
				i++;
			}
		}
		return "" + i / ((double) getAnzahl() / 100);
	}

	/**
	 * Sortiert {@link #autos} nach dem Preis
	 */
	public static void bubbleSort() {
		Auto volume;
		if (isemptyAutos())
			return;
		boolean unsorted = true;
		while (unsorted) {
			unsorted = false;
			for (int i = 0; i < autos.size() - 1; i++) {
				if (!(autos.get(i).preis <= autos.get(i + 1).preis)) {
					volume = autos.get(i);
					autos.set(i, autos.get(i + 1));
					autos.set(i + 1, volume);
					unsorted = true;

				}
			}

		}

	}

}

