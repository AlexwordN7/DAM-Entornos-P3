package main.java;

import java.text.DecimalFormat;

public class Decimales {

	public static void Redondear (double decimal) {
			
		System.out.print("El numero redondeado al alza es: ");
		System.out.println(Math.round(decimal));
			
	}
	
	public static void eliminarDecimal (double decimal) {
		
		DecimalFormat formateado = new DecimalFormat("0");
			
		System.out.print("El numero redondeado sin decimales es: ");
		System.out.println(formateado.format(Math.round(decimal)));
			
	}
	public static void main(String[] args) {
		double decimal=5.7;
		Redondear(decimal);
		eliminarDecimal(decimal);
	}

}
