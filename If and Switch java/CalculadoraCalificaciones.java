import java.util.Scanner;

public class CalculadoraCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notaParciales = obtenerNota(scanner, "Parciales (40%)");
        double notaProyecto = obtenerNota(scanner, "Proyecto (30%)");
        double notaExamenFinal = obtenerNota(scanner, "Examen Final (30%)");

        double notaFinal = (notaParciales * 0.40) + (notaProyecto * 0.30) + (notaExamenFinal * 0.30);

        System.out.printf("La nota final del estudiante es: %.2f%n", notaFinal);
    }

    public static double obtenerNota(Scanner scanner, String tipoNota) {
        double nota;
        do {
            System.out.printf("Ingrese la nota para %s (0 - 100): ", tipoNota);
            nota = scanner.nextDouble();
            if (nota < 0 || nota > 100) {
                System.out.println("Nota inválida. Debe estar en el rango de 0 a 100.");
            }
        } while (nota < 0 || nota > 100);
        return nota;
    }
}
