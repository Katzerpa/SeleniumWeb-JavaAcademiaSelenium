package PracticaMetodos;

import java.util.Scanner;

public class Ejercicio11 {
    //11.	Crear un método que reciba un entero, y muestre en pantalla la cantidad de dólares
    // y de euros que representa ese número.
    public static final float DOLAR = 42;
    public static final float EURO = 50;

    public static void main(String[] args){
        float cantidad;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca la cantidad");
        cantidad = input.nextFloat();
        reconversionMoneda(cantidad);
    }

    //METODO RECONVERSION DE MONEDA

    public static void reconversionMoneda(float cantidad){
        System.out.println("La cantidad de dolares es " + (cantidad/DOLAR));
        System.out.println("La cantidad de euro es "  + (cantidad/EURO));

    }
}
