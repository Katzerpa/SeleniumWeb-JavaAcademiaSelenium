package PracticaMetodos;
import java.util.*;
public class Ejercicio3 {
    //Método que reciba dos enteros y retorne la multiplicación de la misma.

    public static  void  main(String [] args){
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = input.nextInt();
        int multiplicacion = multiplicacionDosNumeros(num1,num2);

        System.out.println("lA multiplicacion de los dos numeros es " + multiplicacion);

    }

    // METODO MULTIPLICACION DOS NUMEROS

    public static int multiplicacionDosNumeros(int num1, int num2){
        return(num1 * num2);
    }

}
