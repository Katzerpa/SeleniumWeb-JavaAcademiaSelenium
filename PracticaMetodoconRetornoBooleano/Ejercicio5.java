package PracticaMetodoconRetornoBooleano;
import java.util.Scanner;
public class Ejercicio5 {
    //Realizar un método que retorne verdadero si el número recibido por parámetro
    // es impar y mayor a 20
    public static void main(String [] args){
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        numero = input.nextInt();
        boolean imparMayor20 = imparMayorA20(numero);

        if (imparMayor20 == true){

            System.out.println("El numero es Impar mayor a 20");

        }
        else {

            System.out.println("El numero es Par o Impar manor a 20 ");
        }
    }

    //METODO NUMERO IMPAR MAYOR A 20
    public static boolean imparMayorA20(int num){
        if (num % 2 != 0 && num > 20){
            return  true;
        }
        else{
            return false;
        }
    }
}
