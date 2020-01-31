package main.java;

public class Array {
	
	public static void NumeroMinimo (int[] numeros) {
		int numeroMin=999;
		
		for(int i=0; i<numeros.length; i++) {
				
			if(numeros[i] < numeroMin){
				numeroMin=numeros[i];
			}
			
		}
		System.out.println("El numero minimo es: "+numeroMin);
	}
	
	public static void main(String[] args) {
		int [] numeros={1,2,3,4,5};
	}

}
