package PracticaEjeciciosClase1;

import java.util.Scanner;

public class Ejercicio_15 {
    //Pedir el ingreso de números hasta que se ingrese un 0. Mostrar el promedio de ellos
    public static void main(String[] args){
        int num = 1;
        int suma = 0;
        int cont = 0;
        float promedio = 0;

        while (num!=0){

            Scanner input = new Scanner(System.in);
            System.out.println("ingrese un numero");
            num = input.nextInt();
            suma = suma + num;
            if(num !=0){
                cont++;
            }
        }
        promedio = suma / cont;

        System.out.println(" La suma de los numero es " + suma + "  y el promedio es " + promedio);
    }
}
