import java.util.Scanner;

public class BrindarInformacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de un artista, película o serie:");
        String eleccion = scanner.nextLine().toLowerCase();

        String informacion;

        switch (eleccion) {
            case "leonardo dicaprio":
                informacion = "Leonardo DiCaprio es un actor y productor estadounidense conocido por películas como 'Inception', 'The Revenant', y 'Titanic'.";
                break;
            case "titanic":
                informacion = "'Titanic' es una película de 1997 dirigida por James Cameron, protagonizada por Leonardo DiCaprio y Kate Winslet. La historia se basa en el hundimiento del RMS Titanic.";
                break;
            case "stranger things":
                informacion = "'Stranger Things' es una serie de televisión de ciencia ficción creada por los hermanos Duffer. Se ambienta en la década de 1980 y sigue a un grupo de niños en la búsqueda de su amigo desaparecido.";
                break;
            case "the godfather":
                informacion = "'The Godfather' es una película de 1972 dirigida por Francis Ford Coppola. Basada en la novela de Mario Puzo, es un clásico del cine sobre la familia mafiosa Corleone.";
                break;
            case "beyoncé":
                informacion = "Beyoncé es una cantante, compositora y actriz estadounidense. Ha lanzado exitosos álbumes como 'Dangerously in Love' y 'Lemonade', y es conocida por sus impactantes actuaciones en vivo.";
                break;
            default:
                informacion = "No tengo información sobre eso. Intenta con un artista, película o serie popular.";
                break;
        }

        System.out.println(informacion);
    }
}
