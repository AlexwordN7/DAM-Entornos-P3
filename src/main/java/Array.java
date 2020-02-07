package main.java;

public class Array {
	
	
	public static void numeroMaximo(int[]numeros) {
		
		int numeroMax=0;
		
		for(int i = 0; i<numeros.length;i++) {
			
			if(numeroMax < numeros[i]) {
				
				numeroMax = numeros[i];
			}
			
			
		}
		
		System.out.println("El numero maximo es: " + numeroMax);
		
		
	}

	public static void main(String[] args) {
		int [] numeros={1,2,3,4,5};
		
		numeroMaximo(numeros);
	}

}
