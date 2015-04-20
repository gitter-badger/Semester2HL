import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;


public class Wc {
	public static void main(String[] args) throws IOException {
		AllWords words = new AllWords();
		BufferedReader fs = new BufferedReader(new FileReader("Faust.txt"));
		LinkedList<String> list = new LinkedList<String>();
		String string;
		while((string=fs.readLine())!=null){
			for (String s : string.split(" ")) {
				words.add(s);
			}
		}
		
		System.out.println(words.toString());
		System.out.println(words.distinctWords());
		System.out.println(words.totalWords());
	}
}
