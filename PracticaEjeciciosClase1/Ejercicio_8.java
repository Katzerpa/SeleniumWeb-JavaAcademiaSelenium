package PracticaEjeciciosClase1;

import java.util.Scanner;

public class Ejercicio_8 {
    //Pedir el ingreso de números hasta que aparezca uno negativo.
    public static void main(String[] args){
        int num = 0;
        while(num >= 0){
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese un numero");
            num = input.nextInt();
        }
        System.out.println("El numero que ingreso es negativo");
    }
}
