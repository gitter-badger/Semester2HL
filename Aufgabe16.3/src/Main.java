/**
 * 
 * @author Sven Marquardt 
 *
 */
public class Main {
	public static void main(String[] args) {
		new Auto("Ford", 125000, 7999.99, "silber metallic", false, "Diesel", 101.0);
		new Auto("Mercedes", 63000, 22999.99, "blue silver", true, "Super", 137.0);
		new Auto("Daihatsu", 12000, 3099.99, "green dynamite", false, "Benzin", 75.0);
		new Auto("Ford", 1700, 17999.99, "silber metallic", false, "Diesel", 101.0);
		new Auto("Mercedes", 63000, 22999.99, "blue silver", true, "Elektro", 37.0);
		Auto.bubbleSort();
		for(Auto a : Auto.getBestand()) System.out.println(a);
		System.out.println("Dieselautos: " + Auto.anteil_kraftstoffart("Diesel") + "%");
		System.out.println("Elektroautos: " + Auto.anteil_kraftstoffart("Elektro") + "%");
		System.out.println("Unfallwagen: " + Auto.anteil_unfallwagen() + "%");
		System.out.println("Erlös ohne Nachlass: " + Auto.erloes_inkl_nachlass(0, 0) + " EUR");
		System.out.println("Erlös mit Nachlass: " + Auto.erloes_inkl_nachlass(0.1, 0.25) + " EUR");
	}
}
