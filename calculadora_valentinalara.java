import java.util.Scanner;

public class calculadora_valentinalara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Calculadora");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarSuma();
                    break;
                case 2:
                    realizarResta();
                    break;
                case 3:
                    realizarMultiplicacion();
                    break;
                case 4:
                    realizarDivision();
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Saliendo de la calculadora.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }

        scanner.close();
    }

    private static void realizarSuma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        double resultado = numero1 + numero2;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    private static void realizarResta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        double resultado = numero1 - numero2;
        System.out.println("El resultado de la resta es: " + resultado);
    }

    private static void realizarMultiplicacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        double resultado = numero1 * numero2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

private static void realizarDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numerador: ");
        double numerador = scanner.nextDouble();
        System.out.print("Ingrese el denominador: ");
        double denominador = scanner.nextDouble();

        if (denominador != 0) {
            double resultado = numerador / denominador;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}