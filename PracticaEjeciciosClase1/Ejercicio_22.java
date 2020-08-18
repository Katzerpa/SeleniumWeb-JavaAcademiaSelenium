package PracticaEjeciciosClase1;

import java.util.Scanner;

public class Ejercicio_22 {
    //Pedir el ingreso de números hasta que se ingrese un número múltiplo de 7
    public static void main(String[] args){
        //Pedir el ingreso de números hasta que se ingrese un número múltiplo de 7
        int num = 0;
        int num2= 0;
        while (num2==0){
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese un numero");
            num = input.nextInt();
            if (num % 7 == 0){
                System.out.println("Es Multiplo de 7");
                num2 = 1;
            }
            else{
                System.out.println(" No es Multiplo de 7");
                num2 = 0;
            }
        }


    }
}
