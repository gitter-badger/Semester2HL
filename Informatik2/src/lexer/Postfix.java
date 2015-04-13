package lexer;

import java.util.Stack;
/**
 * Sorgt für korrekte ausführung der Mathematischen Operationen innerhalb des Postfix Audrucks
 * @author Sven Marquardt
 *
 */
public class Postfix extends ExprLexer {
	/**
	 * Der stack in dem die Werte und die Ergebnise des Postfix ausdrucks gespeichert werden
	 */
	private static Stack<Double> stack = new Stack<Double>();
	/*
	 * Für die brechnung von plus minus usw.
	 */
	private static double value1;
	/*
	 * Für die berechnung von plus minus usw.
	 */
	private static double value2;
	/*
	 * Zur Speicherung der eigenschaften des Übergebenen Tokens
	 */
	private static Token token;

	public Postfix(String post) {
		super(post);
	}
	/**
	 * Führt den Postfixaussdruck korrekt aus
	 * @return Das ergebnis des Postfix Ausdrucks
	 * @throws Exception wenn eine undefinierte Operation ausgeführt z.B. Dividieren durch 0
	 */
	public double evaluPostfix() throws Exception{
		do{
			token = nextToken();
			switch(token.getType()){
			case INT:{
				stack.push(Double.parseDouble(token.getText()));
			}
			break;
			case DIV:
				divide();
				break;
			case MINUS:
				minus();
				break;
			case MUL:
				multiple();
				break;
			case PLUS:
				addition();
				break;
			case POW:
				pow();
				break;
			case UMINUS:
				uminus();
				break;
			case SQRT:
				sqrt();
				break;
			}
		}while(true);

		

	}
	
	/**
	 * Zieht die Wurzel des Obersten auf den Stack gelegten Double wert
	 * @throws Exception Wenn Stack leer ist
	 */
	private void sqrt() throws Exception{
		if(stackEmpty()) throw new Exception("Stack ist leer");
		else{
			value1 = stack.pop();
			stack.push(Math.sqrt(value1));
		}
		
	}
	/**
	 * Negiert den Letzen Ausdruck im Stack
	 * @throws Exception Wenn der Stack leer ist
	 */
	private void uminus() throws Exception{
		if(stackEmpty()) throw new Exception("Stack ist leer");
		else{
			value1=stack.pop();
			stack.push(value1*(-1));
		}
		
	}

	/**
	 * Quaddriert die vorletzte zahl im Stack um den faktor der Zahl die als letztes auf dem Stack liegt
	 * @throws Exception Wenn der Stack weniger als 2 zahlen hat
	 */
	private void pow() throws Exception{
		if(!(stackBiggerThanTwo())) throw new Exception("Stack hat zu wenig einträge mindestens 2 werden gebraucht!!");
		else {
			value1= stack.pop();
			value2= stack.pop();
			stack.push(Math.pow(value2, value1));
		}
	}
	
	/**
	 * Addiert die letzten zwei Zahlen im Stack
	 * @throws Exception Wenn der Stack weniger als 2 zahlen hat
	 */
	private void addition() throws Exception {
		if(!(stackBiggerThanTwo())) throw new Exception("Stack hat zu wenig einträge mindestens 2 werden gebraucht!!");
		else{
			value1=stack.pop();
			value2=stack.peek();
			stack.push(value2+value1);
		}
		
	}

	/**
	 * Multipliziert die letzten zwei Zahlen im stack
	 * @throws Exception Wenn der Stack weniger als 2 zahlen hat
	 */
	private void multiple() throws Exception{
		if(!(stackBiggerThanTwo())) throw new Exception("Stack hat zu wenig einträge mindestens 2 werden gebraucht!!");
		else{
			value1=stack.pop();
			value2=stack.pop();
			stack.push(value1*value2);
		}
	}
	
	/**
	 * Dividiert die letzten beiden Zahlen auf dem Stack
	 * @throws Exception Wenn der Stack weniger als 2 zahlen hat oder durch null Dividiert wird
	 */
	private void divide()throws Exception{
		if(!(stackBiggerThanTwo())) throw new Exception("Stack hat zu wenig einträge mindestens 2 werden gebraucht!!");
		else{
			value1=stack.pop();
			value2=stack.pop();
			if(value1==0) throw new Exception("Dividieren durch 0 nicht definiert");
			else{
				stack.push(value2/value1);
			}
		}
	}
	/**
	 * Subtrahiert die letzten beiden zahlen voneinandern Summand 1 ist dabei die vorletzte Zahl
	 * @throws Exception Exception Wenn der Stack weniger als 2 zahlen hat
	 */
	private void minus() throws Exception{
		if(!(stackBiggerThanTwo())) throw new Exception("Stack hat zu wenig einträge mindestens 2 werden gebraucht!!");
		else{
			value1=stack.pop();
			value2=stack.pop();
			stack.push(value2-value1);
		}
	}
	
	/**
	 * Überptrüft ob mindestens 2 Zahlen auf dem Stack liegen 
	 * @return	True wenn mehr als 2 Zahlen auf dem Stack liegen ansonsten false
	 */
	private boolean stackBiggerThanTwo() {
		if (stack.size() >= 2)
			return true;
		return false;
	}
	
	/**
	 * Überprüft ob eine Zahl auf dem Stack liegt 
	 * @return	Liefert true wenn keine Zahl auf dem Stack liegt ansonsten false
	 */
	private boolean stackEmpty(){
		if(stack.size()<1||stack.isEmpty()){
			return true; 
		}
		return false;
	}
	

}
