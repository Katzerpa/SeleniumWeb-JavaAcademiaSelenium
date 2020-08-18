package PracticaEjeciciosClase1;


import java.util.Scanner;

public class Ejercicio_14 {
    //Pedir el ingreso de números hasta que se ingrese un 0. Mostrar la suma de ellos.
    public static  void main(String[] args){
        int num = 1;
        int suma = 0;
        while (num != 0){
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese un numero");
            num = input.nextInt();
            suma = suma + num;
        }
        System.out.println(" El numero que ingreso es cero  y el total de la suma es " + suma);
    }
}
