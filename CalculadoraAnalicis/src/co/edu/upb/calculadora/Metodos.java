package co.edu.upb.calculadora;

import java.util.Scanner;

public class Metodos {

	 public static int sumar() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el primer número: ");
	        int a = scanner.nextInt();

	        System.out.print("Ingrese el segundo número: ");
	        int b = scanner.nextInt();
	        
	        System.out.println(a+b);
	        return a + b;
	    }
	 
	 public static int restar() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el minuendo: ");
	        int a = scanner.nextInt();

	        System.out.print("Ingrese el sustraendo: ");
	        int b = scanner.nextInt();
	        
	        System.out.println(a-b);
	        return a - b;
	    }
	 
	 public static int multiplicar() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el primer número: ");
	        int a = scanner.nextInt();

	        System.out.print("Ingrese el segundo número: ");
	        int b = scanner.nextInt();
	        
	        System.out.println(a * b);
	        return a * b;
	    }
	 
	 public static double dividir() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el primer dividendo: ");
	        double a = scanner.nextDouble();

	        System.out.print("Ingrese el segundo divisor: ");
	        double b = scanner.nextDouble();

	        if (b == 0) {
	            System.out.println("Error: No se puede dividir por cero.");
	            return Double.NaN;
	        }
	        
	        System.out.println(a/b);
	        return a / b;
	    }
	 
	 public static double exponente() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese la base: ");
	        double base = scanner.nextDouble();

	        System.out.print("Ingrese el exponente: ");
	        double exponente = scanner.nextDouble();

	        System.out.print(Math.pow(base, exponente));
	        return Math.pow(base, exponente);
	    }	
	 

	public static double raizGeneral() {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Ingrese el radicando: ");
		        double radicando = scanner.nextDouble();

		        System.out.print("Ingrese el índice de la raíz: ");
		        double indice = scanner.nextDouble();

		        // Manejo del índice igual a cero y radicando negativo cuando el índice es par
		        if (indice == 0) {
		            System.out.println("Error: El índice de la raíz no puede ser cero.");
		            return Double.NaN; // Retorna NaN para indicar que la raíz no es válida
		        } else if (radicando < 0 && indice % 2 == 0) {
		            System.out.println("Error: No se puede calcular la raíz par de un número negativo.");
		            return Double.NaN; // Retorna NaN para indicar que la raíz no es válida
		        }
		        
		        System.out.print(Math.pow(radicando, 1.0 / indice));
		        return Math.pow(radicando, 1.0 / indice);
		    }	 			


	public static double calcularSeno() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un ángulo en grados: ");
        double anguloGrados = scanner.nextDouble();

        // Convertir el ángulo de grados a radianes
        double anguloRadianes = Math.toRadians(anguloGrados);

        // Calcular el seno del ángulo
        System.out.print(Math.sin(anguloRadianes));
        return Math.sin(anguloRadianes);
    }
	 
	
		    public static double calcularCoseno() {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Ingrese un ángulo en grados: ");
		        double anguloGrados = scanner.nextDouble();

		        // Convertir el ángulo de grados a radianes
		        double anguloRadianes = Math.toRadians(anguloGrados);

		        // Calcular el coseno del ángulo
		        System.out.print(Math.cos(anguloRadianes));
		        return Math.cos(anguloRadianes);
		    }

		    public static double calcularTangente() {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Ingrese un ángulo en grados: ");
		        double anguloGrados = scanner.nextDouble();

		        // Convertir el ángulo de grados a radianes
		        double anguloRadianes = Math.toRadians(anguloGrados);

		        // Calcular la tangente del ángulo
		        System.out.print(Math.cos(anguloRadianes));
		        return Math.tan(anguloRadianes);
		    }
	


		    public static double calcularLogaritmo() {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Ingrese un número: ");
		        double numero = scanner.nextDouble();

		        // Calcular el logaritmo en base 10 del número
		        System.out.print(Math.log10(numero));
		        return Math.log10(numero);
		    }

	 }