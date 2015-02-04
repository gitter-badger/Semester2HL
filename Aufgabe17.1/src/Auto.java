/**
 * Die Klasse Auto erbt Klasse Bestand
 * 
 * @author Sven Marquardt
 *
 */
public class Auto extends Bestand {
	private String hersteller;
	private long laufleistung;
	private double preis;
	private String farbe;
	private boolean unfallwagen;
	private String kraftstoff;
	private double psleistung;

	/**
	 * Konstruktur für Klasse Auto
	 * 
	 * @param hersteller
	 *            Der Hersteller des Autos
	 * @param laufleistung
	 *            Die laufleistung des Autos
	 * @param preis
	 *            Der Preis des Autos
	 * @param farbe
	 *            Die Farbe des Autos
	 * @param unfallwagen
	 *            Ob ein Unfallwagen oder nicht
	 * @param kraftstoff
	 *            Der Kraftstoff des Autos
	 * @param psleistung
	 *            Die ps Leistung des Autos
	 */
	public Auto(String hersteller, long laufleistung, double preis,
			String farbe, boolean unfallwagen, String kraftstoff,
			double psleistung) {
		this.hersteller = hersteller;
		this.laufleistung = laufleistung;
		this.preis = preis;
		this.farbe = farbe;
		this.unfallwagen = unfallwagen;
		this.kraftstoff = kraftstoff;
		this.psleistung = psleistung;

	}

	/**
	 * Fügt ein Auto dem Bestand hinzu durch prüfen mit
	 * {@link #istVorhanden(Auto)} und fügt es dann mit {@link #aufnehmen(Auto)}
	 * hinzu
	 * 
	 * @param bestand
	 *            Der Bestand der Autohauses
	 * @return true oder false ob hinzufügen erfolgreich war
	 * @see #istVorhanden(Auto)
	 */
	public boolean zumBestandHinzu(Bestand bestand) {
		return true;
	}

	/**
	 * entfernt ein Auto aus dem Bestand prueft vorher mit
	 * {@link #istVorhanden(Auto)} und entimmmt es mit {@link #entnehmen(Auto)}
	 * 
	 * @return true oder false wenn Auto entfernt erfolgreich war oder nicht 
	 * @see #istVorhanden(Auto)
	 * @see #entnehmen(Auto)
	 */
	public boolean ausDemBestand() {
		return true;
	}

	/**
	 * Soll das Auto wie in Aufgabe 15.1 beschrieben liefern
	 * 
	 * @return Ein Auto als String wie in Aufgabe 15.1 beschrieben
	 */
	public String toString() {
		return "";
	}
}
