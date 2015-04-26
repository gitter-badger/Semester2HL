package LinkedList;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Iterator;

import org.junit.Test;

public class LinkedListSetTest {

	

	@Test
	public void test() {
		LinkedListSet<String> list = new LinkedListSet<String>();
		assertThat(null,is(equalTo(list.get())));
		assertTrue(list.add("Java"));
		
		
		
	}

}
