package PracticaEjeciciosWhileClase2;

import java.util.Scanner;

public class Ejercicio_42 {
    //Pedir el ingreso de números hasta que se ingrese 0 y se muestre el promedio de los mismos.
    public static void  main(String[] args){
        int num = 1;
        int suma = 0;
        int cont = 0;
        float promedio =0;
        while (num > 0){
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese un numero");
            num = input.nextInt();
            if (num > 0){
                cont++;
                suma = (suma + num) ;
                promedio = suma/ cont;
                System.out.println(" el numero promedio es "+ promedio);
            }

        }



    }
}

