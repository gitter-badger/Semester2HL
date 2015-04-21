import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Wc {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		AllWords words = new AllWords();
		BufferedReader fs = new BufferedReader(new FileReader("Faust.txt"));
		String word;//Einzelne wörter
		String letters="";//Einzelnes Wort
		while((word=fs.readLine())!=null){
			for (String s : word.split(" ")) {
				//Einzelne charavters abfangen
				for(String c :  s.split("")){
					//Überprüfen auf sonerzeichen 
					try {
						if(!(c.matches("[!?.:,()-;'\"]"))){
							letters+=c;
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					words.add(letters);
				} catch (Exception e) {
					System.out.println(e.getLocalizedMessage());
					System.out.println(e.getMessage());
				}
				letters="";
			}
		}
		
		System.out.println(words.toString());//Liefert alle woerter mit Anzahl
		System.out.println(words.distinctWords());//Liefert Anzahl der verschiedenen Woerter 
		System.out.println(words.totalWords());//Liefert Anzahl aller Woerter
		System.out.println(words.mostUsed());//Liefert das meist genutzte Wort 
	}
}
