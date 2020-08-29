package PracticaMetodos;
import java.util.*;
public class Ejercicio19 {
    //Crear un método llamado valorAbsoluto, que reciba un número y retorne el valor absoluto del mismo.
    // Ej. si se recibe un -4, el método debe retornar 4.
    public static void main(String [] args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese un numero");
        num = input.nextInt();
        int valorAbsoluto = valorAbsoluto(num);
        System.out.println("El valos absoluto es "+ valorAbsoluto);
    }



    //METODO VALOR ABSOLUTO
    public static int valorAbsoluto(int num){
        if (num < 0){
            return (num * -1);
        }
        else {
            return num;
        }
    }
}
