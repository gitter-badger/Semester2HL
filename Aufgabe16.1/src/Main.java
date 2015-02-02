import java.text.DecimalFormat;
/**
 * Aufgabe 15.3
 * @author Sven Marquard
 *
 */
public class Main {
	/**
	 * Hautpfunktion 
	 * Autobestand und ausgabe der Autos 
	 * @param args
	 */
	public static void main(String[] args) {
		DecimalFormat f = new DecimalFormat("##.00");
		Auto[] autobestand = {
				new Auto("Ford", 125000, 7999.99, "silber metallic", false,
						"Diesel", 101.0),
				new Auto("Mercedes", 63000, 22999.99, "blue silver", true,
						"Super", 137.0),
				new Auto("Daihatsu", 12000, 3099.99, "green dynamite", false,
						"Benzin", 75.0),
				new Auto("Ford", 1700, 17999.99, "silber metallic", false,
						"Diesel", 101.0),
				new Auto("Mercedes", 63000, 22999.99, "blue silver", true,
						"Elektro", 37.0),
				new Auto("Daihatsu", 12000, 3099.99, "green dynamite", true,
						"Benzin", 75.0),
				new Auto("Ford", 12500, 12999.99, "silber metallic", false,
						"Super", 121.0),
				new Auto("Mercedes", 6300, 32999.99, "blue silver", false,
						"Super", 137.0),
				new Auto("Daihatsu", 12000, 3099.99, "green dynamite", true,
						"Benzin", 75.0),
				new Auto("Ford", 1700, 17999.99, "silber metallic", false,
						"Diesel", 101.0),
				new Auto("Mercedes", 63000, 22999.99, "blue silver", true,
						"Elektro", 37.0),
				new Auto("Daihatsu", 12000, 3099.99, "green dynamite", true,
						"Benzin", 75.0) };
		System.out.println("Erlös ohne nachlass: "+priceCalculation(autobestand,0,0)+"€");
		System.out.println("Anteil an Unfallwagen: "+damageCalculation(autobestand, 0, 0)+"%");
		System.out.println("Anteil an Diesel: "+fuelCalculation(autobestand, 0, 0)+"%");
		System.out.println("Anteil an Elektroautos: "+electroCalculation(autobestand, 0, 0)+"%");
		System.out.println("Erlös mit nachlass: "+f.format(discountPriceCalculation(autobestand, 0, 0))+"€");
		for (Auto a : autobestand) {
			System.out.println(a);
		}
		
	}
	/**
	 * Brechnet den gesamt Wert der Autos 
	 * @param xs Die Autoliste 
	 * @param i Hilfszhler um die liste durchzugehen 
	 * @param volume Der gesamte Wert der Autos 
	 * @return Den gesamtbetrag der Autos in € 
	 */
	public static double priceCalculation(Auto[]xs,int i,double volume) {
		if(i==xs.length)return volume;
		volume +=xs[i].getPreis();
		i++;
		return priceCalculation(xs, i, volume);
	}
	/**
	 * Anteil der Unfallwagen in %
	 * @param xs Die Autoliste 
	 * @param i Hifszähler für die autoliste
	 * @param percentage Der Anteil der Unfallwagen 
	 * @return Den Anteil der Unfallwagen in % 
	 */
	public static float damageCalculation(Auto[]xs,int i,float percentage) {
		if(i==xs.length) return (float) (percentage/(i/100.00));
		if(xs[i].isUnfallwagen())
		{
			percentage++;
		}
		i++;
		return damageCalculation(xs, i, percentage);
	}
	/**
	 * Berrechnet den Anteil der Autos die Diesel als Kraftstoff haben 
	 * @param xs Die Autoliste 
	 * @param i Hifszähler für die autoliste
	 * @param percentage Anteil der Autos die Diesel als Kraftstoff haben 
	 * @return Anteil der Autos die Diesel als Kraftstoff haben 
	 */
	public static float fuelCalculation(Auto[]xs,int i,float percentage) {
		if(i==xs.length)return (float) (percentage/(i/100.00));
		if(xs[i].getKraftstoff().equals("Diesel"))
		{
			percentage++;
		}
		i++;
		return fuelCalculation(xs, i, percentage);
	}
	/**
	 * Berrechnet den Anteil an Elektroautos
	 * @param xs Die Autoliste 
	 * @param i Hifszähler für die autoliste
	 * @param percentage Anteil der Autos die Elektroauto sind 
	 * @return Anteil der Autos die Elektroauto sind 
	 */
	public static float electroCalculation(Auto[]xs,int i,float percentage) {
		if (i==xs.length) return (float)(percentage/(i/100.00));
		if (xs[i].getKraftstoff().equals("Diesel")) {
				percentage++;
		}
		i++;
		return electroCalculation(xs, i, percentage);
	}
	/**
	 * Berrechnet den Erloes mit Nachlass
	 * @param xs Die Autoliste 
	 * @param i Hifszähler für die autoliste
	 * @param volume Der Erloes mit Nachlass
	 * @return Der Erloes mit Nachlass
	 */
	public static double discountPriceCalculation(Auto[]xs,int i,double volume) {
		if(i==xs.length)return volume;
		if(xs[i].isUnfallwagen()){
			volume+=75*(xs[i].getPreis()/100);
		}else{
			volume+=90*(xs[i].getPreis()/100);
		}
		i++;
		return discountPriceCalculation(xs, i, volume);
	}
}
