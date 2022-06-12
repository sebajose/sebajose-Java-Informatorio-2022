package Ejercicios_level1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Ingrese Nombre de Usuario");
    
    String user = scan.nextLine();
    
    System.out.println("HOLA " + user + "!!!" ); 
    scan.close();
}
}

