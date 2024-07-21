import java.util.Scanner;

public class ConteoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de números a ingresar
        System.out.print("Ingrese la cantidad de números que desea ingresar: ");
        int cantidad = scanner.nextInt();

        int mayoresQueCero = 0;
        int menoresQueCero = 0;
        int igualesACero = 0;

        // Pedir al usuario que ingrese los números y contarlos según su categoría
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                mayoresQueCero++;
            } else if (numero < 0) {
                menoresQueCero++;
            } else {
                igualesACero++;
            }
        }

        // Imprimir los resultados
        System.out.println("Cantidad de números mayores que 0: " + mayoresQueCero);
        System.out.println("Cantidad de números menores que 0: " + menoresQueCero);
        System.out.println("Cantidad de números iguales a 0: " + igualesACero);
        
        scanner.close();
    }
}
