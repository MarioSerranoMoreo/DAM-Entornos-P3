package main.java;

public class Cadena {

	public static void main(String[] args) {
		String palabra="hola";
		longitud(palabra);

	}
	public static void longitud(String palabra) {
		 	int length = palabra.length();       
	        System.out.println("Longitud de una cadena es: " + length+"caracteres"); 
	}
}
