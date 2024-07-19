import java.util.Scanner;

public class EvaluacionCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la calificación numérica (0-100): ");
        int calificacion = scanner.nextInt();

        if (calificacion < 0 || calificacion > 100) {
            System.out.println("Calificación inválida. Debe estar en el rango de 0 a 100.");
        } else {
            char letra = asignarLetra(calificacion);
            System.out.println("La calificación en letra es: " + letra);
        }
    }

    public static char asignarLetra(int calificacion) {
        if (calificacion >= 90) {
            return 'A';
        } else if (calificacion >= 80) {
            return 'B';
        } else if (calificacion >= 70) {
            return 'C';
        } else if (calificacion >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
