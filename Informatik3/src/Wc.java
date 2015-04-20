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
		String word;
		String letters="";
		while((word=fs.readLine())!=null){
			for (String s : word.split(" ")) {
				for(String c :  s.split("")){
					if(!(c.matches("[!?.:,()]"))){
						letters+=c;
					}
				}
				words.add(letters);
				letters="";
			}
		}
		
		System.out.println(words.toString());
		System.out.println(words.distinctWords());
		System.out.println(words.totalWords());
	}
	
	public static String  cutSpecial(String s){
		if(s.isEmpty()) return s;
		if(s.length()<2) {
			return s.substring(s.indexOf("[a-zA-Z]"));
		}
		return (String) s.subSequence(s.indexOf("[a-zA-Z]"), s.lastIndexOf("[a-zA-Z]"));
	}
}
