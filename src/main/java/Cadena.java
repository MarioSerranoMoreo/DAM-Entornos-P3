package main.java;

public class Cadena {

	public static void main(String[] args) {
		String palabra="hola";
		System.out.println(palabra.toLowerCase());
		System.out.println(palabra.toUpperCase());
		longitud(palabra);

	}
	public static void longitud(String palabra) {
		 	int length = palabra.length();       
	        System.out.println("Longitud de una cadena es:" + length); 
		
	}
}
