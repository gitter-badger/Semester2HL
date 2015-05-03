package LinkedList;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Iterator;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void testInput() {
		LinkedList<String> list = new LinkedList<String>();
		assertTrue(list.add("Hallo"));
		assertThat(true, is(equalTo(list.add("Hallo"))));//Gleiches Element funktioniert 
		assertTrue(list.contains("Hallo"));
		assertThat(false, is(equalTo(list.contains("hallo"))));
		assertThat(null, is(equalTo(list.get())));
		list.goTo("Hallo");
		assertThat("Hallo", is(equalTo(list.get())));
		System.out.println(list);
		list.goToFirst();
		assertTrue(list.add("Welt"));
		System.out.println(list);
		list.goToNext();
		assertTrue(list.add("Welt"));
		assertThat("Hallo", is(equalTo(list.get())));
		System.out.println(list);
		assertTrue(list.remove("Hallo"));//Entfernen
	}
	
	
	/**
	 * Teste das Löschen von Inhalten
	 */
	@Test
	public void testDelete() {
		LinkedList<String> list = new LinkedList<String>();
		assertTrue(list.isEmpty());
		list.add("1");
		assertThat(false, is(equalTo(list.isEmpty())));
		assertTrue(list.remove("1"));
		assertTrue(list.isEmpty());
	}
	
	/**
	 * Teste die size Mehtode
	 */
	public void testSize() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		assertThat(1, is(equalTo(list.size())));
		list.clear();
		assertThat(0, is(equalTo(list.size())));
	}
	
	
	
	@Test
	public void testIterator() {
		LinkedList<Integer> list  = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println(list);
		
	}

}
