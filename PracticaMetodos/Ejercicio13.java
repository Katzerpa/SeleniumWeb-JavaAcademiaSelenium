package PracticaMetodos;
import java.util.*;
public class Ejercicio13 {
    //Dado un número, un máximo y un mínimo (recibido por parámetro),
    // retorne verdadero si el numero esta dentro del máximo y el mínimo.
    // Si el número se encuentra dentro del max y min, el método debe mostrar
    // “El numero es valido” sino, se debe retornar, “El numero esta fuera de rango.”
      public static void main(String [] args){
          int min;
          int max;
          int num;
          Scanner input = new Scanner(System.in);
          System.out.println("Ingrese el minimo");
          min = input.nextInt();
          System.out.println("Ingrese el maximo");
          max = input.nextInt();
          System.out.println("Ingrese un valor");
          num = input.nextInt();
          boolean  valorEntreMinMax = valorEntreMinMax(min,max,num);
          if (valorEntreMinMax){
              System.out.println("El valo es valido");
          }
          else{
              System.out.println("El valor es invalido");
          }

      }

    //METODO EL VALOR DEL LOS NUMERO ENTRE MINIMO Y MAXIMO
    public static boolean valorEntreMinMax(int min,int max, int valor){
        return (valor>min && valor<max);
    }

}
