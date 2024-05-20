    package co.edu.upb.calculadora;

    import java.util.Scanner;

    public class Principal {

        public static void main(String[] args) {
            Scanner receive = new Scanner(System.in);

            while (true) {
                System.out.println("Escoja una Operacion (Insertando su Numero): \n"
                        + "1. Suma\n"
                        + "2. Resta\n"
                        + "3. Multiplicacion\n"
                        + "4. Division\n"
                        + "5. Exponente\n"
                        + "6. Raiz\n"
                        + "7. Trigonometricas\n"
                        + "8. Logaritmo\n"
                        + "9. Salir\n"
                        + "Ingrese su seleccion: ");
                System.out.println();

                int seleccion = receive.nextInt();

                switch (seleccion) {
                    case 1: {
                        Metodos.sumar();
                        break;
                    }
                    case 2: {
                        Metodos.restar();
                        break;
                    }
                    case 3: {
                        Metodos.multiplicar();
                        break;
                    }
                    case 4: {
                        Metodos.dividir();
                        break;
                    }
                    case 5: {
                        Metodos.exponente();
                        break;
                    }
                    case 6: {
                        Metodos.raizGeneral();
                        break;
                    }
                    case 7: {
                        System.out.println("Escoja una Operacion (Insertando su Numero): \n"
                                + "1. Sen\n"
                                + "2. Cos\n"
                                + "3. Tan");

                        int seleccionTri = receive.nextInt();

                        switch (seleccionTri) {
                            case 1: {
                                Metodos.calcularSeno();
                                break;
                            }
                            case 2: {
                                Metodos.calcularCoseno();
                                break;
                            }
                            case 3: {
                                Metodos.calcularTangente();
                                break;
                            }
                            default:
                                throw new IllegalArgumentException(seleccionTri + " es una seleccion invalida");
                        }
                        break;
                    }
                    case 8: {
                        Metodos.calcularLogaritmo();
                        break;
                    }
                    case 9: {
                        System.out.println("Saliendo del programa...");
                        receive.close();
                        return; 
                    }
                    default:
                        throw new IllegalArgumentException(seleccion + " es una seleccion invalida");
                }

                System.out.println();
            }
        }
    }

