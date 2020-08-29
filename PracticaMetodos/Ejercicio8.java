package PracticaMetodos;
import java.util.*;
public class Ejercicio8 {
    //Crear un método que retorne verdadero
    // si y sólo si el número es par, de lo contrario, debe retornar falso.
    public static void main(String[] agrs){
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = input.nextInt();
        boolean par = esPar(numero);
        if (par){
            System.out.println("El numero  es PAR");
        }
        else{
            System.out.println("El numero es IMPAR");
        }

    }



    // METODO ES NUMERO PAR

    public static boolean esPar(int num){
        return (num % 2 ==0);
    }
}
