package Ejercicios_level1;

import java.util.*;
public class Ejercicio8 {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese: \n Nombre y Apellido: \n Edad: \n Direccion: \n Ciudad:");
        
        String n = scan.nextLine();
        String a = scan.nextLine();
        String d = scan.nextLine();
        String c = scan.nextLine();
        
        System.out.println("{"+c+"}"+" - "+
        "{"+d+"}"+" - "+
        "{"+a+"}"+" - "+
        "{"+n+"}");
       
         scan.close();
    }
}    