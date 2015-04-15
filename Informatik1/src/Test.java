import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.Scanner;


public class Test {
	
	@org.junit.Test
	public void testArrayStack() {
		Scanner in = new Scanner(System.in);
		int input;
		//ArrayStack<Integer> string = new ArrayStack<Integer>(10);
		ListStack<Integer> string = new ListStack<Integer>();
		assertThat(true, is(equalTo(string.istLeer())));
		//Priefen auf leer um fehler zu provozieren
		try {
				assertThat(true, is(equalTo(string.istLeer())));
				string.pop();
				fail("pop on empty stack should throw StackFehler(Leerer Stack)");
		} catch (StackFehler e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Eingabe:");
		string.push(2);
		assertThat(2, is(equalTo(string.top())));
		System.out.println(string.top());
		string.push(3);
		assertThat(3, is(equalTo(string.top())));
		System.out.println(string.top());
		string.push(4);
		System.out.println(string.top());
		string.push(5);
		System.out.println(string.top());
		string.push(6);
		System.out.println(string.top());
		string.push(7);
		System.out.println(string.top());
		string.push(8);
		System.out.println(string.top());
		string.push(9);
		System.out.println(string.top());
		string.push(10);
		System.out.println(string.top());
		//Try and catch fuer ArrayStack um das voll sein zu simulieren 
		/*try{
			string.push(2);
			fail("push on full stack should throw an StackFehler(Stack ist voll)");
		}catch(StackFehler e){
			System.out.println(e.getMessage());
		}*/
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
		
		//Multipop Test
		string.push(2);
		assertThat(2, is(equalTo(string.top())));
		string.push(3);
		assertThat(3, is(equalTo(string.top())));
		string.push(4);
		string.multiPop(2);
		assertThat(2, is(equalTo(string.top())));
		try {
			string.multiPop(2);
			fail("pop on empty stack should throw StackFehler(Leerer Stack)");
		} catch (StackFehler e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}


}
