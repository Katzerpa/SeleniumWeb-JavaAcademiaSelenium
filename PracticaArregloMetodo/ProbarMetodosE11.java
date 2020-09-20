package PracticaArregloMetodo;

import java.util.Scanner;

public class ProbarMetodosE11 {
    //11. Crear un método llamado imprimirArreglo que imprima en pantalla todos los elementos
    //de un array de enteros el cual es recibido por parámetro.
    public static void main(String[] args){
        int[] numeros = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i< numeros.length; i ++){
            System.out.println("Ingrese un numero");
            numeros[i] = input.nextInt();

        }
        Metodos_Arreglos.imprimirArreglo(numeros);
    }
}
