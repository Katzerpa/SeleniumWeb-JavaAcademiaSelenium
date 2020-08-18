package PracticaEjeciciosClase1;

import java.util.Scanner;

//Pedir el ingreso del nombre y el año de nacimiento. Mostrar el nombre y la edad de la persona.
public class Ejercicio_2 {
    public static void  main(String[] args){
        int año = 0;
        int edad = 0;
        String nombre = "";
        Scanner input = new Scanner(System.in);
        System.out.println(" Ingrese su nombre");
        nombre = input.next();
        System.out.println("Ingrese su año de nacimiento");
        año = input.nextInt();
        edad = 2020 - año;
        System.out.println("Su nombre es " + nombre + "  Su edad es  " + edad);
    }
}
