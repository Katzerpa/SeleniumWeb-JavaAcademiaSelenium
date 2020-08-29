package PracticaMetodos;
import java.util.*;
public class Ejercicio7 {
    //Crear un método que reciba un número entero n, y muestre en pantalla
    // la suma desde 1 hasta ese número n.
    // Ej. Si “n” es 4, se debe mostrar en pantalla 10.
    public static void main(String [] args){
        int num;
        Scanner  input = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        num = input.nextInt();
        int suma = sumaUnNumero(num);
        System.out.println("La suma de los numeros es  " + suma);
    }

    // METODO SUMA DE UN NUMERO
    public static int sumaUnNumero(int num){
        int suma = 0;
        for (int i=1;i<=num;i++){
            suma = suma + i;

        }
        return suma;
    }
}

