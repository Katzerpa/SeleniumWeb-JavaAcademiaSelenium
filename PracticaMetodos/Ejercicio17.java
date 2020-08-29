package PracticaMetodos;

import java.util.Scanner;

public class Ejercicio17 {
    //Crear un método llamado factorial que reciba un número y retorne el factorial de ese número.
    // Ej. si el número recibido es 5, se deberá retornar el siguiente valor: 5*4*3*2*1.
    //Sugerencia: utilizar un acumulador
    public static void main(String [] args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese un numero");
        num = input.nextInt();
        int factor= factorNumero(num);
        System.out.println("El factor del numero es " + factor);
    }


    //METODO FACTORIAL
    public static int factorNumero(int num){
        int factor = 1;
        for (int i =1; i <=num;i++){
            factor = factor  * i;
        }
        return factor;
    }
}
