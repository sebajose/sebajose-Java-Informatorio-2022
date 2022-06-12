package Ejercicios_level1;

import java.util.Scanner;
public class Ejercicio5 {

   

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros");
        int a, b, producto = 0;
        a = scan.nextInt(); 
        b = scan.nextInt();     
        for (int i = 1; i <= b; i++){
             producto = producto +a;
        }
        scan.close();
        System.out.println(+a+" x "+b+" = "+producto);
    }
}