package Ejercicios_level1;

import java.util.Scanner;

public class Ejercicio7 {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Escriba algo");
    String cad = scan.nextLine();
    int z = cad.length();
    char c = 0;
        
    for (int i = 0; i < z; i++) {
         c = (char) cad.charAt(i);
        
    if (c >= 'a' && c <= 'z' || c == ' ') 
        c = (char) (c - 'a' + 'A');

        System.out.print(c); 
        scan.close();
       }
    }              
}