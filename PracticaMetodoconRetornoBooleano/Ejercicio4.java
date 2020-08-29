package PracticaMetodoconRetornoBooleano;
import java.util.Scanner;
public class Ejercicio4 {
    //Realizar un método que retorne verdadero si el número recibido por parámetro es impar
    public static void main(String [] args){
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        numero = input.nextInt();
        boolean numeroImpar = esImpar(numero);
        if (numeroImpar== true){
            System.out.println("El numero es Impar");
        }
        else{
            System.out.println("El numero es Par");
        }
    }



    //METODO NUMERO IMPAR

    public static boolean esImpar(int num){
        if (num % 2 != 0){
            return true;
        }
        else{
            return false;
        }
    }
}
