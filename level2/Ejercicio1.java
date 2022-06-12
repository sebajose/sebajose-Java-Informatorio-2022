package Ejercicios_level2;

import java.util.ArrayList;

public class Ejercicio1 {

    public static void main(String[] args) {
     
        ArrayList <Ciudad> listaCiudad = new ArrayList<Ciudad>();
        
        listaCiudad.add(new Ciudad("Bariloche",1));
        listaCiudad.add(new Ciudad("Cordoba",2));
        listaCiudad.add(new Ciudad("Resistencia",3));
        listaCiudad.set(4, new Ciudad("Resistencia",4));
        for (Ciudad e: listaCiudad) {
            System.out.println(e.dameDatos());
        }
    }

}
class Ciudad{
    public Ciudad(String Ciudad, int rank) {
           this.Ciudad=Ciudad;
           this.rank=rank;
    }
public String dameDatos(){
    return "#"+rank+" - "+Ciudad;
}    
private String Ciudad;
private int rank;
    
}