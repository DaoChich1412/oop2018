package week7.task1;

public class Division extends BinaryExpression {
	protected Expression left;
	protected Expression right;
	public Division(Expression left,Expression right){
		this.left=left;
		this.right=right;
	}
	@Override
	public Expression left() {
		return left;
	}

	@Override
	public Expression right() {
		return right;
	}

	@Override
	public String toString() {
		return ""+left.toString()+"/"+right.toString();
	}

	@Override
	public int evaluate() throws java.lang.ArithmeticException{
		int t=left.evaluate()/right.evaluate();
		return t;
	}
}
