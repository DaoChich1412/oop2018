package week3;

public class Week3 {
	public static void main(String[] args){}
    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
		if(m>=n) return m;
		else return n;
    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
		int i;
		int min;
		min=array[0];
		for(int a:array){
			if(a<min) min=a;
		}
        return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
		double bmi;
		bmi=weight/(height*height);
		if(bmi>25) return "Béo phì";
		else{
			if(bmi>=23) return "Thừa cân";
			else{
				if(bmi>=18.5) return "Bình thường";
				else return "Thiếu cân";
			}
		}
    }
}

