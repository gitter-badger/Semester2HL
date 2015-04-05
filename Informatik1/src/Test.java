import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.Scanner;


public class Test {
	
	@org.junit.Test
	public void testArrayStack() {
		Scanner in = new Scanner(System.in);
		String input;
		ArrayStack<String> string = new ArrayStack<String>(10);
		assertThat(true, is(equalTo(string.istLeer())));
		try {
				string.pop();
				fail("pop on empty stack should throw StackFehler(Leerer Stack)");
		} catch (StackFehler e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Eingabe:");
		do{
			input = in.next();
			string.push(input);
			assertThat(input, is(equalTo(string.top())));
		}while(!(string.istVoll()));
		try{
			string.push("Noch");
			fail("push on full stack should throw an StackFehler(Stack ist voll)");
		}catch(StackFehler e){
			System.out.println(e.getMessage());
		}
		System.out.println("Ausgabe:");
		do{
			System.out.println(string.poptop());
		}while(!(string.istLeer()));
		
		try {
				System.out.println(string.poptop());
				fail("pop on empty stack should throw StackFehler(Leerer Stack)");
		} catch (StackFehler e) {
			System.out.println(e.getMessage());
		}
	}
	
	@org.junit.Test
	public void testListStack() {
		Scanner in = new Scanner(System.in);
		String input;
		ListStack<String> string = new ListStack<String>();
		try {
			string.poptop();
			fail("pop on empty stack should throw StackFehler(Leerer Stack)");
			
		} catch (StackFehler e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Eingabe:");
		do {
			input=in.nextLine();
			string.push(input);
			assertThat(input,is(equalTo(string.top())));
		} while (!(input.isEmpty()));
		System.out.println("Ausgabe:");
		
		while(!(string.istLeer())){
			System.out.println(string.poptop());
		}
		
		

	}

}
