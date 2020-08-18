package PracticaEjeciciosClase1;

import java.util.Scanner;

public class Ejercicio_19 {
    //Pedir el ingreso de 3 números e indicar cual es el repetido. Ej. 1 4 4. => El
    //número repetido es el 4
    public static void main(String[] args){
        int num1;
        int num2;
        int num3;
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = input.nextInt();
        System.out.println("Ingrese el tercer numero");
        num3 = input.nextInt();
        if (num1 == num2){
            System.out.println("El numero repetido es " + num2);
        }else if (num2 == num3){
            System.out.println("El numero repetido es " + num3);
        }else if (num3 ==num1){
            System.out.println("El numero repetido es " + num3);
        }else{
            System.out.println("No hay numeros Repetidos");
        }
    }
}
