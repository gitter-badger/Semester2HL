import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class CountTest {

	/**
	 * Pruefe ob countChars bei einem typischen Aufruf funktioniert.
	 */
	@Test
	public void testCaseInsensitive() {
		Map<Character, Integer> m = Count.countChars(false, "Hello World", 'o',
				'e');
		// Pruefe die Struktur der Rueckgabe
		assertTrue(m.keySet().size() == 2);
		assertTrue(m.keySet().contains('o'));
		assertTrue(m.keySet().contains('e'));
		// Pruefe Inhalt der Rueckgabe
		assertTrue(m.get('o') == 2);
		assertTrue(m.get('e') == 1);
	}

	/**
	 * Pruefe ob countChars case sensitive korrekt verarbeitet.
	 */
	@Test
	public void testCaseSensitive() {
	Map<Character, Integer> m = Count.countChars(true, "Hello World", 'o', 'e', '!');
	assertTrue(m.get('o')==2);
	assertTrue(m.get('O')==2);
	assertTrue(m.get('e')==1);
	assertTrue(m.get('E')==1);
	assertTrue(m.get('!')==0);
	}
	
	@Test
	public void testEmpty() {
		Map<Character, Integer> m = Count.countChars(false, " ", 'a','b');
		assertTrue(m.get('a')==0);
		assertTrue(m.get('b')==0);
	}
	
	@Test
	public void testCount() {
		Map<Character, Integer> m = Count.countChars(false, "12344 Hallo So  ", 'a','b','1','4');
		assertTrue(m.get('a')==1);
		assertTrue(m.get('b')==0);
		assertTrue(m.get('1')==1);
		assertTrue(m.get('4')==4);
	}

}
