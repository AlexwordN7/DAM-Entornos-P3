package main.java;

public class Cadena {
	
	public static void longitudNombre(String palabra) {
		
		System.out.println("La longitud del nombre es: " + palabra.length());
		
	}
	
	public static void mayusculaMinuscula(String palabra) {
		
		System.out.println(palabra.toLowerCase());
		System.out.println(palabra.toUpperCase());
	}
	
	public static void main(String[] args) {
		String hola="";
		
		longitudNombre(hola);
		mayusculaMinuscula(hola);

	}
}
