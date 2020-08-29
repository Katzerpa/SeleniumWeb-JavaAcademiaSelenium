package PracticaMetodos;
import java.util.*;

public class Ejercicio14 {
    //Método llamado convertirAMillas, que reciba un entero llamado kilómetros
    // y retorne el equivalente a las millas.
    // Se debe imprimir el valor en millas en pantalla. (1 milla = 1.6 kms)
    public static final double MILLA = 1.6;
    public static void main(String [] args){
       double num;
       Scanner input = new Scanner(System.in);
       System.out.println("ingrese la cantidad de kilometros");
       num = input.nextInt();
        double calcularMillas = calcularMillas(num);
       System.out.println("La cantidad de millas es " + calcularMillas);
    }


    // METODO CALCULAR MILLA
    public static double calcularMillas(double num){
        return (num / MILLA);
    }
}
