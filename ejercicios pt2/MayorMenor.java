
import java.util.Scanner;
public class MayorMenor{
    public static void main (String[] args){
        Scanner numero = new Scanner (System.in);
        int cantidad;
        System.out.println("ingresa un numero");
        cantidad = numero.nextInt();
 
        if(cantidad > 10){ 
            System.out.print("el numero que ingresaste es mayor a 10 ");
        }
        if(cantidad < 20){ 
            System.out.print("el numero que ingresaste es menor a 20 ");
        }
        numero.close();

}

}
