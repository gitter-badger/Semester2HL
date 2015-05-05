package LinkedList;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Iterator;

import org.junit.Test;

public class LinkedListTest {

	/**
	 * Testet input der Liste 
	 */
	@Test
	public void testInput() {
		LinkedList<String> list = new LinkedList<String>();
		assertTrue(list.add("Hallo"));
		assertThat(true, is(equalTo(list.add("Hallo"))));//Gleiches Element funktioniert 
		list.add("Welt");
		list.goTo("Hallo");
		assertThat("Hallo", is(equalTo(list.get())));
		System.out.println(list);
		list.goToNext();
		assertTrue(list.add("Neu"));
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
		list.add("3");
		list.goToFirst();
		assertTrue(list.remove());
		assertThat(false, is(equalTo(list.remove("3"))));
	}
	
	
	/**
	 * Teste die size Mehtode
	 */
	@Test
	public void testSize() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		assertThat(1, is(equalTo(list.size())));
		list.clear();
		assertThat(0, is(equalTo(list.size())));
		assertTrue(list.add("1"));
		assertThat(1, is(equalTo(list.size())));
	}
	
	
	/**
	 * Teste den Iterator
	 */
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
	
	/**
	 * Teste Match 
	 */
	@Test
	public void testMatch() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("String");
		assertThat("String", is(equalTo(list.getMatch("String"))));
		assertThat(null, is(equalTo(list.getMatch("hallo"))));
	}

}
