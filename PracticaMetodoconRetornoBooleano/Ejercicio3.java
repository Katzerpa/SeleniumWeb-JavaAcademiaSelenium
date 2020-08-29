package PracticaMetodoconRetornoBooleano;
import java.util.Scanner;

public class Ejercicio3 {
    //3.	Método que retorne verdadero si el número recibido por parámetro es mayor a 18.
    // De lo contrario, se debe retornar falso.

    public static void main(String[] arg){
        int edad;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la edad");
        edad = input.nextInt();
        boolean mayorDeEdad = mayorEdad18(edad);
        if(mayorDeEdad == true){
            System.out.println("La edad es mayor a 18");
        }
        else{
            System.out.println("La edad es menor o igual a 18");
        }

    }


    //METODO MAYOR DE EDAD  18

    public static boolean mayorEdad18(int edad){
        if (edad >18 ) {
            return  true;
        }else{
            return false;}
    }







}
