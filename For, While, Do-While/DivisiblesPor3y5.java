public class DivisiblesPor3y5 {
    public static void main(String[] args) {
        System.out.println("Números entre 1 y 100 que son divisibles tanto por 3 como por 5:");

        // Iterar del 1 al 100
        for (int i = 1; i <= 100; i++) {
            // Verificar si el número es divisible tanto por 3 como por 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
