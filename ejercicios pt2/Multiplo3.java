import java.util.Scanner;
public class Multiplo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Leer el número
        System.out.println("Introduce un número:");
        int numero = scanner.nextInt();
        // Comprobar si el número es múltiplo de 3
        if (numero % 3 == 0) {
            System.out.println("El número es múltiplo de 3");
        } else {
            System.out.println("El número no es múltiplo de 3");
        }
        // Comprobar si el número es múltiplo de 5
        if (numero % 5 == 0) {
            System.out.println("El número es múltiplo de 5");
        } else {
            System.out.println("El número no es múltiplo de 5");
        }
        scanner.close();
    }
}