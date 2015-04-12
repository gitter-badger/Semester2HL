package lexer;

import java.util.Stack;

public class Postfix extends ExprLexer {
	private static Stack<Double> stack = new Stack<Double>();
	private static double value1; // Für die brechnung von plus minus usw.
	private static double value2; // Für die berechnung von plus minus usw.
	private static Token token;

	public Postfix(String post) {
		super(post);
	}

	public double evaluPostfix() {
		do {
			token = nextToken();
			if (token.getType() != INT&&stackBiggerThanTwo()) {
				if (token.getType() == DIV) {
					value1 = stack.pop();
					value2 = stack.pop();
					stack.push(value2 / value1);

				} else if (token.getType() == MINUS) {
					value1 = stack.pop();
					value2 = stack.pop();
					stack.push(value2 - value1);

				} else if (token.getType() == MUL) {
					value1 = stack.pop();
					value2 = stack.pop();
					stack.push(value2 * value1);
				} else if (token.getType() == PLUS) {
					value1 = stack.pop();
					value2 = stack.pop();
					stack.push(value1 + value2);
				} else if (token.getType() == UMINUS) {
					stack.push(stack.pop() * -1);
				} else if (token.getType() == POW) {
					value1 = stack.pop();
					value2 = stack.pop();
					stack.push(Math.pow(value2, value1));
				}
			} else if (token.getType() == INT) {
				stack.push(Double.parseDouble(token.getText()));
			}
		} while (token.getType() != NL);

		return stack.pop();

	}

	private boolean stackBiggerThanTwo() {
		if (stack.size() >= 2)
			return true;
		return false;
	}

}
