package PracticaEjeciciosClase1;

import java.util.Scanner;

public class Ejercicio_10 {
    //Programa Java que lea dos números y muestre los números entre ellos.
    public static void main(String[] args){
        int num1;
        int num2;
        int mayor;
        int menor;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = input.nextInt();
        if(num1 == num2){
            System.out.println("Los numeros son iguales");

        }else{
            if(num1 > num2){
                mayor = num1;
                menor = num2;
            }else{
                mayor = num2;
                menor = num1;
            }
            for(int i = 0 ; i < mayor; i++){
                if (i > menor){
                    System.out.print(i + " ");
                }

            }
        }

    }
}
