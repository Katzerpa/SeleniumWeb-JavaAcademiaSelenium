package PracticaMetodos;
import java.util.*;
public class Ejercicio20 {
    //Realizar 4 métodos que reciba dos parámetros cada uno y retornen un número float.
    // Los métodos tendrán los siguientes nombres: calcularSuma, calcularResta, calcularDivision,
    // calcularMutiplicacion.

    public static void main(String[] args){
        float num1;
        float num2;
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        num1 = input.nextFloat();
        System.out.println("Ingrese el segundo numero");
        num2 = input.nextFloat();
        float suma = calcularSuma(num1,num2);
        System.out.println("La suma es " + suma);
        float  resta = calcularResta(num1,num2);
        System.out.println("La resta es " + resta);
        float multiplicacion = calcularMultiplicacion(num1,num2);
        System.out.println("La multiplicacion es " + multiplicacion);
        float division = calcularDivision(num1,num2);
        System.out.println("La division es " + division);


    }





    //METODO CALCULAR SUMA

    public static float calcularSuma(float num1, float num2){
        return (num1 + num2);
    }

    //METODO CALCULAR RESTA

    public static float calcularResta(float num1, float num2){
        return (num1 - num2);
    }

    // METODO CALCULAR MULTIPLICACION
    public static float calcularMultiplicacion(float num1, float num2) {
        return (num1 * num2);
    }

    //METODO DIVISION

    public static float calcularDivision(float num1, float num2) {
        if(num2 !=0){
            return (num1/num2);
        }
        else{
            return 0;
        }

    }
}
