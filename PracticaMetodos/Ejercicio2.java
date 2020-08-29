package PracticaMetodos;
import java.util.*;
public class Ejercicio2 {

    //Método que reciba un número entero e imprima en pantalla en caso de ser mayor a 20,
    // “Es mayor a 20”.De lo contrario, imprimir “No es mayor a 20”.

    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        num = input.nextInt();
        boolean mayor20 = mayor20(num);
        if (mayor20){
            System.out.println("El numero es mayor a 20");
        }
        else{
            System.out.println("El numero no es mayor a 20");
        }



    }

    // METODO MAYOR A 20
    public static boolean mayor20(int num){
        return(num>20);
    }
}
