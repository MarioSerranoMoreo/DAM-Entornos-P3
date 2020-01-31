package main.java;

public class Numero {
	
	public static int factorial(int numero) {
		int factorial=1;
		for(int i=1;i<=numero;i++) {
			factorial=factorial*i;
		}
		return factorial;
	}
	
	public static void main(String[] args) {
		int numero=19;
		//497
		System.out.println("El factorial es "+factorial(numero));
	}
}
