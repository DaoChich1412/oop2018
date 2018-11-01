package week7.task1;

abstract public class BinaryExpression extends Expression{
	abstract public Expression left();
	abstract public Expression right();
	abstract public String toString();
	abstract public int evaluate();
}
