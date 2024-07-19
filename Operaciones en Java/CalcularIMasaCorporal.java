import java.util.Scanner;

public class CalcularIMasaCorporal {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su peso en kilogramos
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        // Pedir al usuario que ingrese su altura en metros
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        // Calcular el índice de masa corporal (IMC)
        double imc = peso / (altura * altura);

        // Mostrar el resultado
        System.out.println("Su Índice de Masa Corporal (IMC) es: " + imc);
        
        // Cerrar el scanner
        scanner.close();
    }
}
