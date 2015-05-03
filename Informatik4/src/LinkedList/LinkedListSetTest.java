package LinkedList;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Iterator;

import org.junit.Test;

public class LinkedListSetTest {

	

	@Test
	public void test() {
		LinkedListSet<Integer> list = new LinkedListSet<Integer>();
		assertThat(null,is(equalTo(list.get())));
		assertTrue(list.add(7));
		assertTrue(list.add(8));
		assertThat(false, is(equalTo(list.add(7))));
		assertTrue(list.contains(7));
		
		
	}

}
