package PracticaMetodoconRetornoBooleano;
import java.util.Scanner;
public class Ejercicio1 {
    //1.	Método que reciba dos números y retorne verdadero si el primer numero es mayor que el segundo.
    // De lo contrario, retornar debe retornar falso.
    public static void main(String[] args){
        int num1;
        int num2;

        Scanner  input = new Scanner(System.in);
        System.out.println("Intruduzca el primer numero");
        num1 =input.nextInt();
        System.out.println("Introduzca el segundo numero");
        num2 = input.nextInt();
        boolean numenoMayor = primerNumeroMayor(num1, num2);

        if(numenoMayor == true){
            System.out.println("El numero Mayor es el primero!!!!");

        }
        else{
            System.out.println("El numero mayor es el segundo!!!");
        }
        
    }




    //Metodo el primer numero es mayor que el segungo
    public static boolean primerNumeroMayor(int num1 , int num2){
        if(num1 >num2){
            return true;

        }
        else {
            return false;
        }

    }

}
