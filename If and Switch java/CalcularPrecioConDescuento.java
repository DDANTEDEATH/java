import java.util.Scanner;

public class CalcularPrecioConDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio original del producto: ");
        double precioOriginal = scanner.nextDouble();

        double precioFinal = calcularPrecioFinal(precioOriginal);

        System.out.printf("El precio final después de aplicar el descuento es: %.2f%n", precioFinal);
    }

    public static double calcularPrecioFinal(double precioOriginal) {
        double descuento;

        if (precioOriginal <= 100) {
            descuento = 0;
        } else if (precioOriginal > 100 && precioOriginal <= 200) {
            descuento = 0.10;
        } else if (precioOriginal > 200 && precioOriginal <= 500) {
            descuento = 0.20;
        } else {
            descuento = 0.25;
        }

        return precioOriginal - (precioOriginal * descuento);
    }
}
