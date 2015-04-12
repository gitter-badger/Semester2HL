package lexer;

import static org.junit.Assert.*;

import  org.hamcrest.*;
import org.hamcrest.core.Is;
import org.junit.Test;

public class PostfixTest {


	@Test
	public void testPostfix() {
		Postfix post = new Postfix("22 2 +  3 + + \n");
		System.out.println(post.evaluPostfix());
	}

	

}
