import java.util.Scanner;
public class Verificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa Un numero:");
        int number = scanner.nextInt();
      
        if (number > 0) {
            System.out.println("El numero es positivo y no es igual a cero.");
        
       
        scanner.close();
        }
   }
  }