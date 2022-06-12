package Ejercicios_level1;

import java.util.*;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Ingrese un Numero: ");
    int nro = scan.nextInt();
    
    for (int j = 1; j <= nro; j ++) {// número de filas
    for (int i = 1; i <= j; i ++) {// El número de la línea actual
    System.out.print(i+" ");
              }
    System.out.println (); // Ajustar al imprimir el número de líneas
           }  
      scan.close();
    }
  }
