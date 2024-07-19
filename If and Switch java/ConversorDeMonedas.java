import java.util.Scanner;

public class ConversorDeMonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tasa de conversión aproximadas (pueden cambiar)
        final double TASA_USD = 0.055;  // 1 MXN = 0.055 USD
        final double TASA_EUR = 0.051;  // 1 MXN = 0.051 EUR
        final double TASA_THB = 1.91;    // 1 MXN = 1.91 THB
        final double TASA_JPY = 7.78;    // 1 MXN = 7.78 JPY
        final double TASA_KRW = 73.38;   // 1 MXN = 73.38 KRW
        final double TASA_AUD = 0.086;   // 1 MXN = 0.086 AUD
        final double TASA_PEN = 0.21;    // 1 MXN = 0.21 PEN
        final double TASA_CAD = 0.074;   // 1 MXN = 0.074 CAD
        final double TASA_VES = 1.48;    // 1 MXN = 1.48 VES
        final double TASA_ARS = 11.32;   // 1 MXN = 11.32 ARS

        System.out.print("Ingrese la cantidad en pesos mexicanos (MXN): ");
        double cantidadMXN = scanner.nextDouble();

        System.out.println("Seleccione la moneda a convertir:");
        System.out.println("1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dólar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dólar Canadiense (CAD)");
        System.out.println("9. Bolívar (VES)");
        System.out.println("10. Peso Argentino (ARS)");
        int opcion = scanner.nextInt();

        double cantidadConvertida;

        switch (opcion) {
            case 1:
                cantidadConvertida = cantidadMXN * TASA_USD;
                System.out.printf("La cantidad en Dólares (USD) es: %.2f%n", cantidadConvertida);
                break;
            case 2:
                cantidadConvertida = cantidadMXN * TASA_EUR;
                System.out.printf("La cantidad en Euros (EUR) es: %.2f%n", cantidadConvertida);
                break;
            case 3:
                cantidadConvertida = cantidadMXN * TASA_THB;
                System.out.printf("La cantidad en Baths (THB) es: %.2f%n", cantidadConvertida);
                break;
            case 4:
                cantidadConvertida = cantidadMXN * TASA_JPY;
                System.out.printf("La cantidad en Yenes (JPY) es: %.2f%n", cantidadConvertida);
                break;
            case 5:
                cantidadConvertida = cantidadMXN * TASA_KRW;
                System.out.printf("La cantidad en Wons (KRW) es: %.2f%n", cantidadConvertida);
                break;
            case 6:
                cantidadConvertida = cantidadMXN * TASA_AUD;
                System.out.printf("La cantidad en Dólares Australianos (AUD) es: %.2f%n", cantidadConvertida);
                break;
            case 7:
                cantidadConvertida = cantidadMXN * TASA_PEN;
                System.out.printf("La cantidad en Soles (PEN) es: %.2f%n", cantidadConvertida);
                break;
            case 8:
                cantidadConvertida = cantidadMXN * TASA_CAD;
                System.out.printf("La cantidad en Dólares Canadienses (CAD) es: %.2f%n", cantidadConvertida);
                break;
            case 9:
                cantidadConvertida = cantidadMXN * TASA_VES;
                System.out.printf("La cantidad en Bolívares (VES) es: %.2f%n", cantidadConvertida);
                break;
            case 10:
                cantidadConvertida = cantidadMXN * TASA_ARS;
                System.out.printf("La cantidad en Pesos Argentinos (ARS) es: %.2f%n", cantidadConvertida);
                break;
            default:
                System.out.println("Opción inválida. Debe seleccionar un número entre 1 y 10.");
                break;
        }
    }
}
