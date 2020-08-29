package PracticaMetodos;
import java.util.*;
public class Ejercicio6 {
    //Realizar un método que reciba dos números y retorne el mayor ambos
    public static void main(String [] args){
        int numero1;
        int numero2;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        numero1 = input.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2 = input.nextInt();
        int mayor = numeroMayor(numero1,numero2);

        System.out.println("El numero mayor es " + mayor);

    }

    //METODO EL NUMERO MAYOR

    public static int numeroMayor(int num1, int num2){
        return Math.max(num1 , num2);

    }
}
