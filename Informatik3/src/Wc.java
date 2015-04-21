import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Wc {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		AllWords words = new AllWords();
		BufferedReader fs = new BufferedReader(new FileReader("Faust.txt"));
		String word;//Einzelne wörter
		while((word=fs.readLine())!=null){
			for (String s : word.split(" ")) {
				words.add(s);
			}
		}
		
		System.out.println(words.toString());//Liefert alle woerter mit Anzahl
		System.out.println(words.distinctWords());//Liefert Anzahl der verschiedenen Woerter 
		System.out.println(words.totalWords());//Liefert Anzahl aller Woerter
		System.out.println(words.mostUsed());//Liefert das meist genutzte Wort 
	}
}
