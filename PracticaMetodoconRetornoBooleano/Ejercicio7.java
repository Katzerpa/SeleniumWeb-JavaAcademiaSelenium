package PracticaMetodoconRetornoBooleano;
import java.util.Scanner;
public class Ejercicio7 {
    //6.	Realizar un método que reciba dos números enteros y retorne verdadero
    // si la suma es mayor a 100. De lo contrario, debe retornar falso.
    public static void main(String []args){
        int numero1;
        int numero2;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        numero1 = input.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2 = input.nextInt();
        boolean sumaMayor100 = sumaMayor100(numero1,numero2);
        if(sumaMayor100 == true){
            System.out.println("La suma es mayo a 100");

        }
        else{
            System.out.println("La suma es menor a 100");
        }

    }




    //METODO SUMA MAYOR A 100

    public static boolean sumaMayor100(int num1,int num2){
        int suma;
        suma = num1 +  num2;
        if (suma > 100){
            return true;
        }
        else {
            return false;
        }
    }
    }

