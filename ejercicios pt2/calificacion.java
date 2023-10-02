import java.util.Scanner;
public class calificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu calificacion: ");
        int numero = scanner.nextInt();
        if (numero >= 60 && numero <= 100 ) {
            System.out.println("Tu calificacion es aprobatoria.");
        } else {
            System.out.println("Tu calificacion no es aprobatoria.");
        }
        scanner.close();
    }
}