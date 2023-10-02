import java.util.Scanner;
public class primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Leer el número
        System.out.println("Introduce un número:");
        int numero = scanner.nextInt();
        
        // Comprobar si el número es primo
        boolean esPrimo = true;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
        // Comprobar si el número es menor que 100
        boolean esMenorQue100 = numero < 100;
        // Imprimir el resultado
        if (esPrimo && esMenorQue100) {
            System.out.println("El número es primo y menor que 100");
        } else {
            System.out.println("El número no es primo o no es menor que 100");
        }
        scanner.close();
  
    }
}