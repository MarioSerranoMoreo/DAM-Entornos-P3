package main.java;

public class Numero {
	
	public static String comprobarPrimo(int numero) {
		String primo="";
		for(int i=2;i<=numero-1;i++) {
			if(numero%i==0) {
				primo = "si";
			}else {
				primo = "no";
			}
		}
		return primo;
	}
	
	public static void main(String[] args) {
		int numero=497;
		System.out.println("Este numero "+comprobarPrimo(numero)+" es primo");
	}
}
