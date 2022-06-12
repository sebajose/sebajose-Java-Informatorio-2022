package Ejercicios_level2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
    
    List<String> Estudiante = new ArrayList<>();
    cargarLista(Estudiante);
    /*for (String  x : Estudiante) {
    System.out.println(x);
    }*/
  System.out.println("\n"+"Curso1:");
  List<String> Curso1 = new ArrayList<>();
  Curso1 = Estudiante.subList(0, 4);
  for (String x : Curso1) {
      System.out.println(x);
  } 
  System.out.println("\n"+"Curso2:"); 
  List<String> Curso2 = new ArrayList<>();
  Curso2 = Estudiante.subList(4, 8);
  for (String x : Curso2) {
      System.out.println(x);
  }
  System.out.println("\n"+"Curso3:");  
  List<String> Curso3 = new ArrayList<>();
  Curso3 = Estudiante.subList(8, 12);
  for (String x : Curso3) {
      System.out.println(x);
  }  
}

public static void cargarLista(List<String> Estudiante) {
    Estudiante.add("A");
    Estudiante.add("B");
    Estudiante.add("C");
    Estudiante.add("D");
    Estudiante.add("E");
    Estudiante.add("F");
    Estudiante.add("G");
    Estudiante.add("H");
    Estudiante.add("I");
    Estudiante.add("J");
    Estudiante.add("K");
    Estudiante.add("L");
}
}
    

