package PracticaEjeciciosClase1;

import java.util.Scanner;

public class Ejercicio_21 {
    //Programa Java que lea dos números y muestre los números impares entre ellos.
    public static void main(String[] args){
        int num1;
        int num2;
        int menor =0;
        int mayor =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = input.nextInt();
        if (num1 > num2){
            mayor = num1;
            menor = num2;
        }
        else if (num2 > num1){
            mayor = num2;
            menor = num1;
        }else{
            System.out.println("Los numeros estan repetidos");
        }
        for (int i = menor  + 1; i < mayor; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
