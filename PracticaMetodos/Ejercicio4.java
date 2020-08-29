package PracticaMetodos;
import java.util.*;
public class Ejercicio4 {
    //Método que reciba dos números y retorne su suma
    public static void  main(String [] args){
        int numero1;
        int numero2;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        numero1 = input.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2 = input.nextInt();
        int suma = sumaDosNum(numero1,numero2);
        System.out.println("la suma de los numeros es " + suma);
    }

    // METODO SUMA DE DOS NUMEROS
    public static int sumaDosNum(int num1, int num2){
        return (num1 + num2);
    }
}
