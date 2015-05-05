package LinkedListSet;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Iterator;

import org.junit.Test;

public class LinkedListSetTest {

	/**
	 * Teste input
	 */
	@Test
	public void testInput() {
		LinkedListSet<String> list = new LinkedListSet<String>();
		assertTrue(list.add("Hallo"));
		assertThat(false, is(equalTo(list.add("Hallo"))));//Gleiche elemente nicht in einer Menge
		list.goToFirst();
		assertTrue(list.add("Welt"));
		list.goTo("Hallo");
		assertThat("Hallo", is(equalTo(list.get())));
	}
	
	
	/**
	 * Teste das Löschen von Inhalten
	 */
	@Test
	public void testDelete() {
		LinkedListSet<String> list = new LinkedListSet<String>();
		assertTrue(list.isEmpty());
		list.add("1");
		assertThat(false, is(equalTo(list.isEmpty())));
		assertTrue(list.remove("1"));
		assertTrue(list.isEmpty());
		assertTrue(list.add("1"));
		list.goToFirst();
		assertTrue(list.remove());
		assertTrue(list.isEmpty());
		assertThat(false, is(equalTo(list.remove())));
		assertThat(false, is(equalTo(list.remove("1"))));
	}
	
	
	/**
	 * Teste die size Mehtode
	 */
	@Test
	public void testSize() {
		LinkedListSet<String> list = new LinkedListSet<String>();
		list.add("1");
		assertThat(1, is(equalTo(list.size())));
		list.clear();
		assertThat(0, is(equalTo(list.size())));
		assertTrue(list.add("1"));
		assertThat(1, is(equalTo(list.size())));
	}
	
	
	
	@Test
	public void testIterator() {
		LinkedListSet<Integer> list  = new LinkedListSet<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println(list);
		
	}
	@Test
	public void testMatch() {
		LinkedListSet<String> list = new LinkedListSet<String>();
		list.add("String");
		assertThat("String", is(equalTo(list.getMatch("String"))));
		assertThat(null, is(equalTo(list.getMatch("hallo"))));
	}
}
