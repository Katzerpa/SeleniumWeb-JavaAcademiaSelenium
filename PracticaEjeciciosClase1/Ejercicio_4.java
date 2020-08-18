package PracticaEjeciciosClase1;

import java.util.Scanner;

public class Ejercicio_4 {
    //Pedir el ingreso de un dato, e indicar si es menor o mayor a 0
    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un Número");
        num = input.nextInt();
        if(num > 0){
            System.out.println("El número es mayor a cero");
        }
        else{
            System.out.println("El número es menor a cero");
        }

    }

}
