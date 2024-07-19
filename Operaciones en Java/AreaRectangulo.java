import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la longitud y el ancho del rectángulo
        System.out.print("Ingrese la longitud del rectángulo: ");
        double longitud = scanner.nextDouble();

        System.out.print("Ingrese el ancho del rectángulo: ");
        double ancho = scanner.nextDouble();

        // Calcular el área del rectángulo
        double area = longitud * ancho;

        // Mostrar el resultado
        System.out.println("El área del rectángulo es: " + area);
        
        // Cerrar el scanner
        scanner.close();
    }
}
