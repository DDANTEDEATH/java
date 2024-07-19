import java.util.Scanner;

public class DeterminarEstacionDelAno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número de mes (1-12): ");
        int mes = scanner.nextInt();

        String estacion;

        switch (mes) {
            case 12:
            case 1:
            case 2:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Mes inválido. Debe ingresar un número entre 1 y 12.";
                break;
        }

        System.out.println("La estación correspondiente es: " + estacion);
    }
}

