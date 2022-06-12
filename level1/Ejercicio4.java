package Ejercicios_level1;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
     
        System.out.println("Ingrese el numero para calcular el factorial");
    
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt(); 

        System.out.println("El factorial de " + numero + " es: " + factorial(numero));
        scan.close();
        }
    
        public static int factorial(int valor) {
       
        if (valor == 0) {
            return 1;
        }
        return valor * factorial(valor - 1);
    }    
    
}