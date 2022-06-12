package Ejercicios_level1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
    System.out.println("Escribe dos números enteros para obtener el resultado de la suma, resta, multiplicación y división");
    
    Scanner scan = new Scanner(System.in);
    int num1, num2, s, r, m, d;
    num1 = scan.nextInt();
    num2 = scan.nextInt();
    s = num1 + num2;
    r = num1 - num2;
    m = num1 * num2;
    d = num1 / num2;
    System.out.println((+num1+" + "+num2+" = "+s)+"\n"+(+num1+" - "+ num2 +" = "+r)+"\n"+(+num1+" * "+ num2 +" = "+m)+"\n"+(+num1+" / "+ num2 +" = "+d));
    
    scan.close();
    }
}    