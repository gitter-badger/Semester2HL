package LinkedList;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Iterator;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void test() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Hallo");
		list.add("hallo");
		System.out.println(list.get());
		Iterator<String> li = list.iterator();
		while(li.hasNext()){
			System.out.println(li.next());
		}
		list.goTo("Hallo");
		assertThat("Hallo",is(equalTo(list.get())));
		
		
	}

}
