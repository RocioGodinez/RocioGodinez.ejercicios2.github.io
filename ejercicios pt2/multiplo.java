import java.util.Scanner;
public class multiplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
        if (numero % 5 == 0) {
            System.out.println("El número es múltiplo de 5.");
        } else {
            System.out.println("El número no es múltiplo de 5.");
        }
        scanner.close();
    }
}