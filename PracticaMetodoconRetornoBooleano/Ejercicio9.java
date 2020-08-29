package PracticaMetodoconRetornoBooleano;
import java.util.Scanner;

public class Ejercicio9 {
    //Dado una año de nacimiento, retorne verdadero si la persona tiene 18 años o mas,
    // y falso si han pasado menos años. Sugerencia: Usar una variable estática.
    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el año de nacimiento");
        num = input.nextInt();
        boolean mayorA18 = mayorA18(num);
        if (mayorA18){
            System.out.println("La edad es mayo a 18");
        }
        else{
            System.out.println("La edad es menor a 18");
        }
    }


    // METODO MAYOR DE 18 AÑOS
    public static boolean mayorA18(int num){
        int edad;
        int ACTUAL = 2020;
        edad = ACTUAL - num;
        return edad > 18;

    }



}
