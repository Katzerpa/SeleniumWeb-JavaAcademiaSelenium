package PracticaEjerciciosForClase2;

import java.util.jar.JarEntry;

public class Ejercicio_36 {
    //Calcula el factorial del número 5.
    public static void main(String[] args){
        int factorial = 1;
        for (int i=1;i<=5;i++){
            factorial = factorial*i;
        }
        System.out.println("El factorial de 5 es "+ factorial);
    }
}
