package PracticaMetodos;

import java.util.Scanner;

public class Ejercicio18 {
    //Realizar un método llamado validarNumero, que reciba 4 parametros:
    //a)  Un mensaje a mostrar: mensaje
    //b)  Un mensaje de error: error
    //c)  Un entero llamado: mínimo
    //d)  Un entero llamado: máximo
    //Se debe pedir el ingreso de números indicando el mensaje por parámetro para solicitar el número.
    // En caso de que se ingrese un número fuera del rango, mostrar el mensaje de error y pedir que
    // reingrese un número que se encuentre dentro del rango.
    //El método debe retornar un entero que se encuentre dentro del rango comprendido entre
    //el máximo y el mínimo.
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         System.out.println("Ingrese un numero minimo permitido");
         int min = input.nextInt();
         System.out.println("Ingrese un numero maximo permitido");
         int max = input.nextInt();
         System.out.println("Ingrese un rango permitido");
         int num = input.nextInt();
         int validarNumero = validarNumero("mensaje = Numero valido !!!","Numero fuera de rango reingrese",min,max,num);
     }


    //METODO VALIDAR NUMERO

    public static int validarNumero(String mensaje, String error, int min, int max, int valor){
        Scanner input = new Scanner(System.in);
        while (valor>max || valor<min){
            System.out.println(error);
            valor = input.nextInt();
        }
        System.out.println(mensaje);
        return valor;
    }





}
