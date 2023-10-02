import java.util.Scanner;
public class divisible{
    public static void main (String[] args){
        Scanner numero = new Scanner (System.in);
        int cantidad;
        System.out.println("ingresa un numero");
        cantidad = numero.nextInt();

        if(cantidad % 2 == 0 ){ 
            System.out.print("el numero que ingresaste es divisible entre 2 ");
        }

        if(cantidad % 3 == 0 ){ 
            System.out.print("el numero que ingresaste es divisible entre 3 ");
        }
        numero.close();
 }

}