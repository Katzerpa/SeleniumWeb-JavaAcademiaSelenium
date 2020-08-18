package PracticaEjeciciosWhileClase2;

import java.util.Scanner;

public class Ejercicio_41 {
    // Pedir el ingreso de números hasta que aparezca uno negativo.
    // Indicar el promedio de todos los números ingresados
    public static void  main(String[] args){
        int num = 1;
        int suma = 0;
        int cont = 0;
        float promedio;
        while (num > 0){
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese un numero");
            num = input.nextInt();
            if (num > 0){
                cont++;
                suma = suma + num;
            }

        }
        promedio = suma / cont;
        System.out.println("El promedio de todos los numeros es " + promedio);

    }
}
