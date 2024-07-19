import java.util.Scanner;

public class CalcularSalarioNeto {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el salario bruto mensual
        System.out.print("Ingrese el salario bruto mensual: ");
        double salarioBruto = scanner.nextDouble();

        // Pedir al usuario que ingrese el porcentaje de impuestos
        System.out.print("Ingrese el porcentaje de impuestos: ");
        double porcentajeImpuestos = scanner.nextDouble();

        // Pedir al usuario que ingrese las deducciones adicionales
        System.out.print("Ingrese las deducciones adicionales: ");
        double deduccionesAdicionales = scanner.nextDouble();

        // Calcular el impuesto
        double impuesto = (salarioBruto * porcentajeImpuestos) / 100;

        // Calcular el salario neto
        double salarioNeto = salarioBruto - impuesto - deduccionesAdicionales;

        // Mostrar el resultado
        System.out.println("El salario neto es: " + salarioNeto);
        
        // Cerrar el scanner
        scanner.close();
    }
}
