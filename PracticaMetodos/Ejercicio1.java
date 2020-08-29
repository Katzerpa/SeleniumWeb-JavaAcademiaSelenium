package PracticaMetodos;
import java.util.*;
public class Ejercicio1 {
    //Escribir un método que reciba un número y retorne su doble
    public static  void  main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = input.nextInt();
        int numDoble = numDoble(num);
        System.out.println("El doble es " + numDoble);
    }


    // METODO DOBLE

    public static int numDoble(int num){
        return(num * 2);
    }



}
