package PracticaMetodoconRetornoBooleano;
import java.util.*;
public class Ejercicio10 {
    // Dado un número, un máximo y un mínimo (recibido por parámetro), retorne verdadero
    // si el número esta dentro del máximo y el mínimo. Si el número se encuentra dentro
    // del max y min, el  programa debe mostrar  “El numero es valido” sino, se debe retornar,
    // “El numero esta fuera de rango.”

    public static void main(String[] args){
        int min;
        int max;
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el valor minimo");
        min = input.nextInt();
        System.out.println("Ingrese el valor Maximo");
        max = input.nextInt();
        System.out.println("Ingrese el numero");
        num = input.nextInt();
        boolean valorEntreMinMax = valorEntreMinMax(min,max,num);
        if(valorEntreMinMax){
            System.out.println("El numero es valido");
        }
        else{
            System.out.println("El numero no es valido");
        }
    }

    // METODO VALOR ENTRE MIN Y MAX

    public static boolean valorEntreMinMax(int min,int max,int valor){
         return (valor > min && valor <max);

    }

}

