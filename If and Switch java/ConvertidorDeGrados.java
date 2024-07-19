
    import java.util.Scanner;

public class ConvertidorDeGrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.println("Seleccione una opción de conversión:");
        System.out.println("1. Convertir a Fahrenheit");
        System.out.println("2. Convertir a Kelvin");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                double fahrenheit = convertirAFahrenheit(celsius);
                System.out.printf("La temperatura en Fahrenheit es: %.2f%n", fahrenheit);
                break;
            case 2:
                double kelvin = convertirAKelvin(celsius);
                System.out.printf("La temperatura en Kelvin es: %.2f%n", kelvin);
                break;
            default:
                System.out.println("Opción inválida. Debe seleccionar 1 o 2.");
                break;
        }
    }

    public static double convertirAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double convertirAKelvin(double celsius) {
        return celsius + 273.15;
    }
}
