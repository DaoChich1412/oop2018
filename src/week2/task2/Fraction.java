package week2.task2;

public class Fraction {

    int numerator;
	int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator=numerator;
		this.denominator=denominator;
    }

    public Fraction add(Fraction other) {
        Fraction temp;
		temp.numerator=numerator*other.denominator+denominator*other.numerator;
		temp.denominator=denominator*other.denominator;
        return temp;
    }

    public Fraction subtract(Fraction other) {
        Fraction temp;
		temp.numerator=numerator*other.denominator-denominator*other.numerator;
		temp.denominator=denominator*other.denominator;
        return temp;
    }

    public Fraction multiply(Fraction other) {
        Fraction temp;
		temp.numerator=numerator*other.numerator;
		temp.denominator=denominator*other.denominator;
        return temp;
    }

    public Fraction divide(Fraction other) {
        Fraction temp;
		temp.numerator=numerator*other.denominator;
		temp.denominator=denominator*other.numerator;
        return temp;
    }
	
	public boolean equals(Fraction a,Fraction b){
		if(a.subtract(b)>0) return true;
		else return false;
	}
}
