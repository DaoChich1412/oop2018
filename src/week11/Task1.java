package week11;

public class Task1{
	public static <T extends Comparable> void Sort(T[] a){
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i].compareTo(a[j])>0){
					T temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
	}
	public static void main(String[] args){
		Byte[] bytes=new Byte[]{3,2,5,1,4};
		Short[] shorts=new Short[]{3,5,4,2,7};
		Integer[] integers=new Integer[]{12,34,32,21,14};
		Long[] longs=new Long[]{12L,2L,32L,45L,21L};
		Character[] characters=new Character[]{'d','s','a','o','p'};
		Sort(bytes);
		Sort(shorts);
		Sort(integers);
		Sort(longs);
		Sort(characters);
	}
}
