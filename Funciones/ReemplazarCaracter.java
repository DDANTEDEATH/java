import java.util.Scanner;

public class ReemplazarCaracter {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena de texto
        System.out.print("Por favor, ingrese una cadena de texto: ");
        String texto = scanner.nextLine();

        // Solicitar al usuario que ingrese el carácter a reemplazar
        System.out.print("Ingrese el carácter que desea reemplazar: ");
        char caracterAReemplazar = scanner.next().charAt(0);

        // Solicitar al usuario que ingrese el nuevo carácter
        System.out.print("Ingrese el nuevo carácter: ");
        char nuevoCaracter = scanner.next().charAt(0);

        // Reemplazar el carácter en la cadena de texto
        String textoModificado = texto.replace(caracterAReemplazar, nuevoCaracter);

        // Imprimir la cadena de texto modificada
        System.out.println("Texto modificado: " + textoModificado);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
