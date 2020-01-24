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
		int numeroMaximo=maximo(array);
		System.out.println("Numero maximo "+numeroMaximo);
		System.out.println("Mediana "+mediana(array));
	}
	public static int maximo(int[]maximo) {
		int numeroMaximo=0;
		for(int i=0;i<maximo.length;i++) {
			if(maximo[i]>numeroMaximo) {
				numeroMaximo=maximo[i];
			}
		}
		return numeroMaximo;
	}
}