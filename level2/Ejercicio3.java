package Ejercicios_level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;



public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> baraja_int = new ArrayList<Integer>();
        for (int i=1; i<53; i++) baraja_int.add(i);
        System.out.println("\n"+"Oreden: "+baraja_int+"\n");
        Collections.reverse(baraja_int);
        System.out.println("Reverso: "+baraja_int+"\n");
        Collections.shuffle(baraja_int, new Random());
        System.out.println("Desorden: "+baraja_int);
    }
}
