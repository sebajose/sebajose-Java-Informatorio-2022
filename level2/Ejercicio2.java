package Ejercicios_level2;

import java.util.ArrayList;


public class Ejercicio2 {
  
        public static void main(String[] args) {
     
          
           ArrayList<Integer> arrlist = new ArrayList<Integer>();
           System.out.println("Elemntos:"+"\n");
        {  arrlist.add(1);
           arrlist.add(1);
           arrlist.add(1);
           arrlist.add(1);
           arrlist.add(1);
           
           for (Integer num : arrlist) {
            System.out.println(num);} 
            System.out.println("\n"+"Tamano: "+arrlist.size()+"\n"); 
        }  System.out.println("Elemntos:"+"\n");
           arrlist.add(0, 2);
           arrlist.add(2);
           for (Integer num : arrlist) {
            System.out.println(num);
            
        }  System.out.println("\n"+"Tamano: "+arrlist.size()); 
           
    }
}
          