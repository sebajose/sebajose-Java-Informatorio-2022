package Ejercicios_level1;
import java.io.IOException;
import java.util.*;
public class Ejercicio9 {
    public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);

    String texto;
        char letra;
        int numeroDeVeces = 0;
        do {
            System.out.println("Introduce texto: ");
            texto = scan.nextLine();
        } while (texto.isEmpty());
        System.out.print("Introduce una letra: ");
        letra = (char) System.in.read();
        numeroDeVeces = contarCaracteres(texto, letra);
        System.out.println( numeroDeVeces );                   
        scan.close();   
    }


    public static int contarCaracteres(String cadena, char letra) {
        int posicion, contador = 0;
       
        posicion = cadena.indexOf(letra);
        while (posicion != -1) { 
            contador++;           
            posicion = cadena.indexOf(letra, posicion + 1);
        }
        return contador;
   }
    
}
