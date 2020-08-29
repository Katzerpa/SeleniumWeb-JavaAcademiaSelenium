package PracticaMetodoconRetornoBooleano;
import java.util.Scanner;
public class Ejercicio6 {
    //Realizar un método llamado esPrimo que reciba un número, y retorne true si solo si el número
    // es primo (es divisible entre si, y la unidad)
    public static void main(String [] arg){
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = input.nextInt();
        boolean primo = esPrimo(numero);
        if(primo == true){
            System.out.println("El numero es primo");

        }
        else {
            System.out.println("El numero no es primo");
        }

    }



    //  METODO ES PRIMO
    public static boolean esPrimo(int num){
        int cont =0;
        for (int i = 1; i <=num;i++){
            if(num % i == 0){
                cont++;
            }
        }
        if (cont == 2){
            return true;
        }
        else {
            return false;
        }
    }
}
