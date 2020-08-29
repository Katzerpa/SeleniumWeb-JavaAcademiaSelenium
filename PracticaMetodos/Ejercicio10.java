package PracticaMetodos;
import java.util.*;
public class Ejercicio10 {
    //Crear un método que permita reciba el alto y ancho de un paralelogramo tipo, y retorne su area.
     public static void main(String [] args){
         float ancho;
         float alto;
         Scanner input = new Scanner(System.in);
         System.out.println("Ingrese el ancho");
         ancho = input.nextFloat();
         System.out.println("Ingrese alto");
         alto = input.nextFloat();
         float  area = areaDeUnParalelo(alto,ancho);
         System.out.println("El area del paralelo  es "  + area);
     }

    // METODO AREA DE UN PARALELO
    public static float areaDeUnParalelo(float alto , float ancho){
        float area = alto * ancho;
        return area;


    }
}