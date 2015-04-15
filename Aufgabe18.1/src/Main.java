
public class Main {
	public static void main(String[] args) {
		new Rechteck(5, 5, 3, 10, 20);
		new RWDreieck(30, 2, 4, 3, 4);
		new Ellipse(4, 10, 5, 10, 20);
		new Kreis(10, 10, 6, 5);
		new Quadrat(100, 200, -10, 35);
		
		for (Figur f : Figur.getAlleFiguren()) {
			System.out.println(f);
			}
	}
}
