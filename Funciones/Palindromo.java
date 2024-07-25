import java.util.Scanner;

public class Palindromo {

    // Función que determina si una cadena es un palíndromo
    public static boolean esPalindromo(String cadena) {
        // Eliminar espacios en blanco y convertir a minúsculas para una comparación sin distinciones
        String cadenaLimpia = cadena.replaceAll("\\s+", "").toLowerCase();

        // Determinar el tamaño de la cadena limpia
        int n = cadenaLimpia.length();

        // Comparar los caracteres desde los extremos hacia el centro
        for (int i = 0; i < n / 2; i++) {
            if (cadenaLimpia.charAt(i) != cadenaLimpia.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena de texto
        System.out.print("Por favor, ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();

        // Determinar si la cadena es un palíndromo y mostrar el resultado
        if (esPalindromo(cadena)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
