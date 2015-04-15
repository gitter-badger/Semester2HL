import java.util.Scanner;


public class Wc {
	public static void main(String[] args) {
		AllWords words = new AllWords(100);
		String t;
		Scanner scanner = new Scanner(System.in);
		do{
			t= scanner.next();
			words.add(t);
		}while(!(t.equals("\n")));
		
		System.out.println(words.toString());
		System.out.println(words.distinctWords());
		System.out.println(words.totalWords());
	}
}
