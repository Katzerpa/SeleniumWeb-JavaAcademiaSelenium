package PracticaMetodoconRetornoBooleano;
import java.util.Scanner;
public class Ejercicio8 {
    // Realizar un método llamado esMayor que reciba un número, y retorne verdadero si el
    // número es mayor a 0, de lo contrario, se debe retornar falso. Luego, solicitar al usuario
    // que ingrese un número. Sii es positivo, se debe imprimir: “El número es positivo”, de
    // lo contrario, “El número es negativo” (Se debe utilizar el método realizado anteriormente)
    public static void main(String [] args){
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese un numero");
        numero = input.nextInt();
        if(numero != 0){

            boolean mayorCero = mayorCero(numero);
            if(mayorCero){
                System.out.println("El numero es positivo");
            }
            else {
                System.out.println("El numero es negativo");
            }

        }else{
            System.out.println("El numero debe ser diferente de cero");
        }
    }

    //METODO MAYOR A CERO
    public static boolean mayorCero(int num){

        return num > 0;
    }
}
