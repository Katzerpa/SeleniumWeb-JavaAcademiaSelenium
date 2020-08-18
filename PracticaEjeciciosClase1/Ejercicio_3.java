package PracticaEjeciciosClase1;

import java.util.Scanner;

public class Ejercicio_3 {
    //    3) Pedir el ingreso de 3 números y mostrar la suma de ellos.

        public static void main(String[] args){
            int num1 ;
            int num2 ;
            int num3;
            int total;
            Scanner input = new Scanner(System.in);
            System.out.println("“ Ingrese el primer número”");
            num1 = input.nextInt();
            System.out.println("Ingrese el segundo número");
            num2 = input.nextInt();
            System.out.println("Ingrese el tercer número");
            num3= input.nextInt();
            total= num1 + num2 + num3;
            System.out.println("La suma de los tres numeros es  " + total);
        }


}
