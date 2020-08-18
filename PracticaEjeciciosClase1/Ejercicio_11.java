package PracticaEjeciciosClase1;

import java.util.Scanner;

public class Ejercicio_11 {
    //Programa que lea 6 números e indique en pantalla si son positivos o negativos y pares
    //o impares
    //Ej. 5 : es positivo e impar
    //Ej. -4: es negativo y par
    public static void main(String[] args){
        int num;
        for (int i=1; i<=6; i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese un numero");
            num = input.nextInt();
            if(num>0){
                if(num % 2 ==0){
                    System.out.println("El numero es " + num + "  Es positivo par");
                }else{
                    System.out.println("El numero es " + num + "  Es positivo impar");
                }
            }else{
                if(num % 2 ==0){
                    System.out.println("El numero es " + num + "  Es negativo par");
                }else{
                    System.out.println("El numero es " + num + "  Es negativo impar");
                }
            }
        }
    }
}
