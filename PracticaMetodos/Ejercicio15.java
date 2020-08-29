package PracticaMetodos;
import java.util.*;
public class Ejercicio15 {
    //Crear un método que retorne la suma de los números pares entre 1 y n, siendo n un parámetro.
    public static void main(String [] agrs){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num= input.nextInt();
        int sumaPares = sumaPares(num);
        System.out.println("La suma de los pares es " + sumaPares);

    }

    //METODO SUMA DE LOS PARES
    public static int sumaPares(int num) {
        int suma = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 ==0){
                suma = suma + i;
            }

        }

      return suma;
    }
}