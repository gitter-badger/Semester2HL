/**
 * 
 * @author Sven Marquardt
 *
 */
public class Main {
	public static void main(String[] args) {
		Bestand bestand = new Bestand();
		Auto a = new Auto("Ford", 125000, 7999.99, "silber metallic", false, "Diesel", 101.0);
		a.zumBestandHinzu(bestand);
		
		a = new Auto("Mercedes", 63000, 22999.99, "blue silver", true, "Super", 137.0);
		a.zumBestandHinzu(bestand);
		
		a = new Auto("Daihatsu", 12000, 3099.99, "green dynamite", false, "Benzin", 75.0);
		a.zumBestandHinzu(bestand);
		
		a = new Auto("Ford", 1700, 17999.99, "silber metallic", false, "Diesel", 101.0);
		a.zumBestandHinzu(bestand);
		
		a = new Auto("Mercedes", 63000, 22999.99, "blue silver", true, "Elektro", 37.0);
		a.zumBestandHinzu(bestand);
		
		for(Auto auto : bestand.sortiertNachPreis()){ System.out.println(auto);}
	}
}
