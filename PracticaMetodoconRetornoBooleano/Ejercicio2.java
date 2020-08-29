package PracticaMetodoconRetornoBooleano;
import java.util.Scanner;
public class Ejercicio2 {
    //Dado un número, retorne verdadero si el número es menor a 0.

    public static void  main(String[] args){
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = input.nextInt();
        boolean numeroMayorAcero = mayorAcero(numero);
        if(numeroMayorAcero ==true ){
            System.out.println("El numero es mayor a cero");
        }
        else{
            System.out.println("El numero es menor o igual a cero");
        }
    }


    //METODO NUMERO MAYOR A CERO
    public static boolean mayorAcero(int num){
        if (num>0){
            return true;
        }
        else{
            return false;
        }

    }
}
