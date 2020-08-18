package PracticaEjeciciosClase1;

import java.util.Scanner;

public class Ejercicio_5 {
    // Pedir el ingreso de 3 números, indicar si hay números repetidos.
    public static void main(String[] arg){
        int num1;
        int num2;
        int num3;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = input.nextInt();
        System.out.println("Ingrese el tercer numero");
        num3 = input.nextInt();
        if(num1 == num2){
            System.out.println(" Hay numeros repetidos");
        }
        else if(num1 == num3 ){
            System.out.println(" Hay numeros repetidos");
        }
        else if (num2 == num3){
            System.out.println(" Hay numeros repetidos");
        }
        else{
            System.out.println(" No hay numeros repetidos");
        }
    }
}
