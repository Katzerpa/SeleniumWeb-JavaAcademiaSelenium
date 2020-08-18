package PracticaEjeciciosClase1;

import java.util.Scanner;

public class Ejercicio_6 {
    //Pedir el ingreso de 3 números, indicar si hay números repetidos utilizando solo un IF
    public static void main(String[] args){
        int num1;
        int num2;
        int num3;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo nuemro");
        num2 = input.nextInt();
        System.out.println("Ingrese el tercer numero");
        num3 = input.nextInt();

        if(num1 == num2||num2 == num3 ||num1 == num3){
            System.out.println("Hay numeros repetidos");
        }
        else{
            System.out.println("No hay numeros repetidos");
        }
    }
}
