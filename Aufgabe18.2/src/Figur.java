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
		bubblesort();
		return figuren;
	}
	
	
	/**
	 * Sortiert die Liste an Figuren mit einem Array ueber Objekt von klein nach gross bei z
	 */
	public static void bubblesort() {
		Figur[] figur =  figuren.toArray(new Figur[0]);
		boolean sorted = true;
		while(sorted){
			sorted = false;
			for(int i =0;i<figur.length-1;i++){
				if(figur[i].Z > figur[i+1].Z){
					Figur tmp = figur[i];
					figur[i] = figur[i+1];
					figur[i+1]=tmp;
					sorted = true;
				}
			}
		}
		figuren.clear();
		for (Figur figur2 : figur) {
			figuren.add(figur2);
		}
	}
	
}
