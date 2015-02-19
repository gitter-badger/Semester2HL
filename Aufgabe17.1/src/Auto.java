/**
 * Die Klasse Auto erbt Klasse Bestand
 * 
 * @author Sven Marquardt
 *
 */
public class Auto  {
	private String hersteller;
	private long laufleistung;
	private double preis;
	private String farbe;
	private boolean unfallwagen;
	private String kraftstoff;
	private double psleistung;
	private Bestand bestand;

	/**
	 * Konstruktur für Klasse Auto
	 * Ruft für jedes attribut die set-Mehtode auf um die werte zu speichern 
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
		this.setHersteller(hersteller);
		this.setLaufleistung(laufleistung);
		this.setPreis(preis);
		this.setFarbe(farbe);
		this.setUnfallwagen(unfallwagen);
		this.setKraftstoff(kraftstoff);
		this.setPsleistung(psleistung);

	}

	/**
	 * Fügt ein Auto dem Bestand hinzu durch prüfen mit
	 * {@link #istVorhanden(Auto)} und fügt es dann mit {@link #}
	 * hinzu
	 * 
	 * @param bestand
	 *            Der Bestand der Autohauses
	 * @return true oder false ob hinzufügen erfolgreich war
	 * @see #istVorhanden(Auto)
	 */
	public boolean zumBestandHinzu(Bestand bestand) {
		if(bestand.aufnehmen(this)) return true;
		return false;
	}

	/**
	 * entfernt ein Auto aus dem Bestand
	 * prueft vorher mit
	 * {@link #istVorhanden(Auto)} und entimmmt es mit {@link #entnehmen(Auto)} 
	 * danach ist das Auto aus dem Bestand entfernt
	 * 
	 * @return true oder false wenn Auto entfernt erfolgreich war oder nicht 
	 * @see #istVorhanden(Auto)
	 * @see #entnehmen(Auto)
	 */
	public boolean ausDemBestand() {
		if(bestand.entnehmen(this)) return true;
		return false;
	}

	/**
	 * Soll das Auto wie in Aufgabe 15.1 beschrieben liefern
	 * 
	 * @return Ein Auto als String wie in Aufgabe 15.1 beschrieben
	 */
	public String toString() {
		return "-------\nHersteller: " + this.hersteller + "\n" + "Preis: "
				+ this.preis + "€\n" + "Motor: " + this.psleistung + "PS ("
				+ this.kraftstoff + ")\n" + "KM-Stand: " + this.laufleistung
				+ " km\n" + "Farbe: " + this.farbe + "\n"
				+ (!this.unfallwagen?"unfallfrei\n--------\n":"--------\n");
	}

	public String getHersteller() {
		return hersteller;
	}

	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}

	public long getLaufleistung() {
		return laufleistung;
	}

	public void setLaufleistung(long laufleistung) {
		this.laufleistung = laufleistung;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public boolean isUnfallwagen() {
		return unfallwagen;
	}

	public void setUnfallwagen(boolean unfallwagen) {
		this.unfallwagen = unfallwagen;
	}

	public String getKraftstoff() {
		return kraftstoff;
	}

	public void setKraftstoff(String kraftstoff) {
		this.kraftstoff = kraftstoff;
	}

	public double getPsleistung() {
		return psleistung;
	}

	public void setPsleistung(double psleistung) {
		this.psleistung = psleistung;
	}

	public Bestand getBestand() {
		return bestand;
	}

	public void setBestand(Bestand bestand) {
		this.bestand = bestand;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}
}
