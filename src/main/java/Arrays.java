package main.java;

public class Arrays {
	
	public static int mediana(int [] array) {
		int mediana=0;
		java.util.Arrays.sort(array);
		if(array.length%2!=0) {
			mediana=array[array.length/2];
		}else {
			mediana=(array[array.length/2]+array[array.length/2-1])/2;
		}
		
		return mediana;
	}
	
	public static void main(String[] args) {
		int array[]={1,5,4,9,3};
		System.out.println(mediana(array));
	}

}
