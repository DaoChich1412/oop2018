package week2.task2;

public class Fraction {
	
	// TODO: khai báo các thuộc tính
    int numerator;
	int denominator;

    public Fraction(int numerator, int denominator) {
		// TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator=numerator;
		this.denominator=denominator;
    }

    public Fraction add(Fraction other) {
		// TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction temp=new Fraction(1,1);
		temp.numerator=numerator*other.denominator+denominator*other.numerator;
		temp.denominator=denominator*other.denominator;
        return temp;
    }

    public Fraction subtract(Fraction other) {
		// TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction temp=new Fraction(1,1);
		temp.numerator=numerator*other.denominator-denominator*other.numerator;
		temp.denominator=denominator*other.denominator;
        return temp;
    }

    public Fraction multiply(Fraction other) {
		// TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction temp=new Fraction(1,1);
		temp.numerator=numerator*other.numerator;
		temp.denominator=denominator*other.denominator;
        return temp;
    }

    public Fraction divide(Fraction other) {
		// TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction temp=new Fraction(1,1);
		temp.numerator=numerator*other.denominator;
		temp.denominator=denominator*other.numerator;
        return temp;
    }
	
	public boolean equals(Object obj){
		// TODO: Phương thức so sánh hai phân số
		if(this.numerator/((Fraction)obj).numerator==this.denominator/((Fraction)obj).denominator) return true;
		else return false;
	}
}
