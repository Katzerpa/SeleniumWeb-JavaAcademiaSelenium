package PracticaMetodos;
import java.util.*;
public class Ejercicio21 {
    //Realizar un método llamado calcularPromedio, que solicite el ingreso de números
    // hasta que se ingrese 0, y que calcule el promedio de los mismos. Se debe utilizar
    // el método ingresarNumero realizado previamente.
    public static void main(String [] args){
        System.out.println("El promedio es "+ calcularPromedio());
    }



    //METODO PROMEDIO
    public static float calcularPromedio(){
        int cont = 0;
        int suma = 0;
        int num = ingresarNumero("Ingrese un numero");
        while (num !=0){
            cont ++;
            suma = suma + num;
            num = ingresarNumero("Ingrese un numero");

        }
        if (cont > 0){
            float promedio = suma /cont;
            return promedio;
        }
        else{
            return 0;
        }
    }


    //METODO INGRESAR NUMERO
    public static int ingresarNumero(String mensaje){
        Scanner input =new Scanner(System.in);
        System.out.println(mensaje);
        int num = input.nextInt();
        return num;

    }

}
