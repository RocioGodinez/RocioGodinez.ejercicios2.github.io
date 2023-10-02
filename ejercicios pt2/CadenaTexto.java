import java.util.Scanner;
public class CadenaTexto{
    public static void main (String[] args){
        Scanner texto = new Scanner (System.in);
        String parrafo;
        System.out.println("ingresa un parrafo");
        parrafo = texto.nextLine();
        boolean contieneLetras = parrafo.contains("a") && parrafo.contains("b");
        System.out.println("el parrafo que ingresaste contiene las letras 'a' y 'b': " + contieneLetras);
        texto.close();
    }

}
