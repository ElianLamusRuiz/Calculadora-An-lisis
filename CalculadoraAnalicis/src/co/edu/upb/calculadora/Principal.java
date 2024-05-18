package co.edu.upb.calculadora;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		System.out.println("Escoja una Operacion (Insertando su Numero): \n"
				+ "1. Suma\n"
				+ "2. Resta\n"
				+ "3. Multiplicacion\n"
				+ "4. Divizion\n"
				+ "5. Exponente\n"
				+ "6. Raiz\n"
				+ "7. Trigonometricas\n"
				+ "8. Logaritmo\n"
				+ "Enter seleccion:   "
				); 
		System.out.println(); // crear espacio despuesd de seleccion
		
		int seleccion;
		
		Scanner receive = new Scanner(System.in);
		seleccion = receive.nextInt();
		
		switch (seleccion) {
		case 1: {
			
			Metodos.sumar();
		}	
		case 2: {
			
			Metodos.restar();
			
		}
		case 3: {
			
			Metodos.multiplicar();
			
		}
		case 4: {
			
			Metodos.dividir();
			
		}
		case 5: {
			
			Metodos.exponente();
			
		}
		case 6: {
			
			Metodos.raizGeneral();
			
		}
		case 7: {
			System.out.println("Escoja una Operacion (Insertando su Numero): \n"
					+ "1. sen"
					+ "2. cos"
					+ "3. tan");
			
			int seleccionTri;
			
			Scanner trigonometricas = new Scanner(System.in);
			seleccionTri = trigonometricas.nextInt();
			
			switch (seleccionTri) {
			case 1: {
				
				Metodos.calcularSeno();
			}	
			case 2: {
				
				Metodos.calcularCoseno();
				
			}
			case 3: {
				
				Metodos.calcularTangente();
				
			}
			default:
				throw new IllegalArgumentException(seleccionTri + "is an invalid seleccion");
			}
			
		}
		case 8: {
			
			Metodos.calcularLogaritmo();
			
		}
		
		default:
			throw new IllegalArgumentException(seleccion + "is an invalid seleccion");
		}
		
		
		
	}
	
}
