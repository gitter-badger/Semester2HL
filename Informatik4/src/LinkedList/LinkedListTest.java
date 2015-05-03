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
		assertTrue(list.remove("Hallo"));//Entfernen 
		assertTrue(list.contains("Hallo"));
		assertTrue(list.remove("Hallo"));
		System.out.println(list);
		
		
		
		
	}

}
