import java.util.Scanner;
public class triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Leer los lados del triángulo
        System.out.println("Introduce el lado 1:");
        double lado1 = scanner.nextDouble();
        System.out.println("Introduce el lado 2:");
        double lado2 = scanner.nextDouble();
        System.out.println("Introduce el lado 3:");
        double lado3 = scanner.nextDouble();
        // Comprobar si el triángulo es equilátero
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triángulo es equilátero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("El triángulo es isósceles");
        } else {
            System.out.println("El triángulo es escaleno");
        }
        scanner.close();
    }
}
 
