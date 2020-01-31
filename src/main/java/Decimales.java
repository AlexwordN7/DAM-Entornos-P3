package main.java;

import java.text.DecimalFormat;

public class Decimales {
	
public static void sinDecimales (double decimal) {
		
		DecimalFormat formateado = new DecimalFormat("0");
			
		System.out.print("El numero redondeado sin decimales es: ");
		System.out.println(formateado.format(Math.floor((decimal))));
			
	}

	public static void main(String[] args) {
		double decimal=5.7;
	}

}
