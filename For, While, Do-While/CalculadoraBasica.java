import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Mostrar el menú de opciones
            System.out.println("Seleccione una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Ingrese el número de la opción deseada: ");
            int opcion = scanner.nextInt();

            // Verificar si el usuario desea salir
            if (opcion == 5) {
                continuar = false;
                System.out.println("Saliendo del programa. ¡Hasta luego!");
                continue;
            }

            // Pedir al usuario que ingrese dos números
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            // Realizar la operación seleccionada
            switch (opcion) {
                case 1: // Sumar
                    System.out.println("Resultado de la suma: " + (num1 + num2));
                    break;
                case 2: // Restar
                    System.out.println("Resultado de la resta: " + (num1 - num2));
                    break;
                case 3: // Multiplicar
                    System.out.println("Resultado de la multiplicación: " + (num1 * num2));
                    break;
                case 4: // Dividir
                    if (num2 != 0) {
                        System.out.println("Resultado de la división: " + (num1 / num2));
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 5.");
                    break;
            }

            // Preguntar al usuario si desea continuar
            System.out.print("¿Desea realizar otra operación? (si/no): ");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
                System.out.println("Saliendo del programa. ¡Hasta luego!");
            }
        }

        scanner.close();
    }
}
