package PracticaEjeciciosClase1;


import java.util.Scanner;

public class Ejercicio_9 {
    //Programa Java que pida un número NUM ingresado por el usuario. Luego muestre los
    //números desde 1 hasta NUM utilizando la instrucción for.
    //Ejemplo. NUM = 5 ---> 1 2 3 4 5
    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = input.nextInt();

        for(int i = 1; i <= num ; i ++){

            System.out.print(i  +" ");
        }
    }
}
