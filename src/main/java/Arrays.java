package main.java;

public class Arrays {

	public static void main(String[] args) {
		int array[]={1,5,4,9,3};
		int numeroMaximo=maximo(array);
		System.out.println(numeroMaximo);
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