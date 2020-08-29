package PracticaMetodos;
import java.util.*;
public class Ejercicio5 {

    //5.	Método que reciba un número entero y un número double, y
    // retorne su multiplicación. ¿Qué tipo de retorno tiene este método?
    // El metodo es doble.
    public static void main(String [] args){
        int num1;
        double num2;
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el primero numero");
        num1 = input.nextInt();
        System.out.println("ingrese el segundo numero");
        num2 = input.nextDouble();
        double multiplicacion = multiDeUnEnteroYUnDoble(num1,num2);
        System.out.println("La multiplicacion de los dos numeros es " + multiplicacion);


    }

    //METODO MULTIPLICACION DE UN ENTERO Y UN DOBLE
    public static double multiDeUnEnteroYUnDoble(int num, double num2){
        return num * num2;
    }
}
