import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;



public class AllWordsTest {

	

	@Test
	/**
	 * Testet Liste mit leerem Inhalt 
	 */
	public void Emptytest() {
		AllWords words = new AllWords();
		Word wort = new Word("da");
		Word wort2 = new Word("");
		Word wort3 = new Word("");
		try {
			words.add("");
			words.distinctWords();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			words.mostUsed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			words.totalWords();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			words.toString();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			wort.compareTo(wort2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			wort3.compareTo(wort);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	/**
	 * Testet distinct
	 */
	public void testDistinct() {
		AllWords w2 = new AllWords();
		w2.add("Eins)");
		w2.add("Zwei");
		w2.add("(Eins");
		w2.add("zwei");
		w2.add("eins");
		assertThat(4, is(equalTo(w2.distinctWords())));
		
	}
	@Test
	/**
	 * Testet totalWords
	 */
	public void testTotalWords() {
		AllWords w3 = new AllWords();
		w3.add("Eins)");
		w3.add("(Eins");
		w3.add("zwei");
		assertThat(3, is(equalTo(w3.totalWords())));
	}
	
	@Test
	/**
	 * Testet die mostUsed Methode
	 */
	public void testMostUsed() {
		AllWords words = new AllWords();
		words.add("Und");
		words.add("und");
		words.add("Und");
		words.add("Ach");
		words.add("und");
		words.add("Ach");
		words.add("Und");
		assertTrue("Und: 3".equals(words.mostUsed().toString()));
		System.out.println(words);
	}
	
	/**
	 * Testet die CompareTo Mehtode
	 */
	/*public void testCompareTo() {
		Word wort = new Word("Eins");
		Word wort2 = new Word("Eins");
		assertThat(0, is(equalTo(wort.compareTo(wort2))));
		Word wort3 = new Word("Ein");
		assertThat(1, is(equalTo(wort.compareTo(wort3))));
		Word wort4 = new Word("Großes");
		assertThat(-1, is(equalTo(wort.compareTo(wort4))));
	}*/

}
