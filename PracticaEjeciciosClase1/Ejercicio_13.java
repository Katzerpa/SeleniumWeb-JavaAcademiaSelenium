package PracticaEjeciciosClase1;

import java.util.Scanner;

public class Ejercicio_13 {
    //Pedir el ingreso de números hasta que se ingrese un 0
    public static void main(String[] args){
        int num = 1;
        while (num != 0){
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese un numero");
            num = input.nextInt();
        }
        System.out.println("El numero que ingreso es 0");
    }
}
