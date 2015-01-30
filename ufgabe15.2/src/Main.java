/**
 * Aufgabe15.2
 * 
 * @author Sven Marquardt
 *
 */
public class Main {
	/**
	 * Sortiert Autos und gibt danach sortiert aus
	 * 
	 * @param args
	 *            werden nicht ausgewertet
	 */
	public static void main(String[] args) {
		Auto[] autos = {
				new Auto("Ford", 125000, 7999.99, "silber metallic", false,
						"Diesel", 101.0),
				new Auto("Mercedes", 63000, 22999.99, "blue silver", true,
						"Super", 137.0),
				new Auto("Daihatsu", 12000, 3099.99, "green dynamite", true,
						"Benzin", 75.0) };
		bubbleSort(autos);
		for (Auto a : autos) {
			System.out.println(a);
		}
	}

	/**
	 * Sortiert die Autos nach Preis absteigend
	 * 
	 * @param autos
	 *            Die Autos die sortiert werden müssen
	 */
	public static void bubbleSort(Auto[] autos) {
		boolean unsorted = true;
		while (unsorted) {
			unsorted = false;
			for (int i = 0; i < autos.length - 1; i++) {
				if (!(autos[i].preis >= autos[i + 1].preis)) {
					double dummy = autos[i].preis;
					autos[i].preis = autos[i + 1].preis;
					autos[i + 1].preis = dummy;
					unsorted = true;
				}
			}
		}

	}
}
