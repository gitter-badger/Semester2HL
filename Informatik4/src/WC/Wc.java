package WC;
import java.util.Scanner;


public class Wc {
	public static void main(String[] args) {
		AllWords words = new AllWords();
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			words.add(scanner.next());
		}
		scanner.close();
		
		System.out.println(words);
		System.out.println(words.distinctWords());
		System.out.println(words.totalWords());
	}
}
