import java.text.DecimalFormat;
/**
 * Aufgabe 15.3
 * @author Sven Marquard
 *
 */
public class Main {
	/**
	 * 
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
		
	}
	/**
	 * 
	 * @param xs
	 * @return
	 */
	public static double priceCalculation(Auto[]xs,int i,double volume) {
		if(i==xs.length)return volume;
		volume +=xs[i].preis;
		i++;
		return priceCalculation(xs, i, volume);
	}
	/**
	 * 
	 * @param xs
	 * @param i
	 * @param percentage
	 * @return
	 */
	public static float damageCalculation(Auto[]xs,int i,float percentage) {
		if(i==xs.length) return (float) (percentage/(i/100.00));
		if(xs[i].unfallwagen)
		{
			percentage++;
		}
		i++;
		return damageCalculation(xs, i, percentage);
	}
	/**
	 * 
	 * @param xs
	 * @param i
	 * @param percentage
	 * @return
	 */
	public static float fuelCalculation(Auto[]xs,int i,float percentage) {
		if(i==xs.length)return (float) (percentage/(i/100.00));
		if(xs[i].kraftstoff.equals("Diesel"))
		{
			percentage++;
		}
		i++;
		return fuelCalculation(xs, i, percentage);
	}
	/**
	 * 
	 * @param xs
	 * @param i
	 * @param percentage
	 * @return
	 */
	public static float electroCalculation(Auto[]xs,int i,float percentage) {
		if (i==xs.length) return (float)(percentage/(i/100.00));
		if (xs[i].kraftstoff.equals("Diesel")) {
				percentage++;
		}
		i++;
		return electroCalculation(xs, i, percentage);
	}
	/**
	 * 
	 * @param xs
	 * @param i
	 * @param volume
	 * @return
	 */
	public static double discountPriceCalculation(Auto[]xs,int i,double volume) {
		if(i==xs.length)return volume;
		if(xs[i].unfallwagen){
			volume+=75*(xs[i].preis/100);
		}else{
			volume+=90*(xs[i].preis/100);
		}
		i++;
		return discountPriceCalculation(xs, i, volume);
	}
}
