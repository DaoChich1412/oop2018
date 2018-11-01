package week7.task1;

public class Square extends Expression{
	protected Expression expression;
	public Square(Expression e){
		this.expression=e;
	}
	@Override
	public String toString() {
		String s="("+expression.toString()+")^2";
		return s;
	}

	@Override
	public int evaluate() {
		return expression.evaluate()*expression.evaluate();
	}
}
