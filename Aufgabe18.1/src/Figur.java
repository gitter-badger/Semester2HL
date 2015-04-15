import java.util.List;
import java.util.LinkedList;

/**
 * 
 * @author Sven Marquardt
 *
 */
public class Figur {

	protected int X;
	protected int Y;
	protected int Z;
	private static List<Figur> figuren = new LinkedList<Figur>();
	
	/**
	 * Initiiert ein Objekt von Figur
	 * Erstellt ein Objekt vom typ Figur
	 * @param x X-Achse auf dem Blatt
	 * @param y Y-Achse auf dem Blatt
	 * @param z Z-Achse auf dem Blatt
	 */
	public Figur(int x,int y,int z){
		this.X=x;
		this.Y=y;
		this.Z=z;
		figuren.add(this);
	}
	
	/**
	 * Git die anzahl der Figuren aus in figuren
	 * @return Die anzahl de Figuren
	 */
	@SuppressWarnings("unused")
	public static int anzFiguren() {
		int anzahl=0;
		if(figuren.isEmpty()||figuren.size()==0) return 0;
		for (Figur figur : figuren) {
			anzahl++;
		}
		return anzahl;
	}
	
	/**
	 * Gibt die Liste an Figuren 
	 * @return Die Liste an Figuren
	 */
	public static List<Figur> getAlleFiguren() {
		return figuren;
	}
	
}
