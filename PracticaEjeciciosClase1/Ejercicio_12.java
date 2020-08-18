package PracticaEjeciciosClase1;

import java.util.Scanner;

public class Ejercicio_12 {
    //Pedir el ingreso de 4 números y retornar su suma en valor absoluto.
    public static void main(String[] args){
        int num;
        int suma = 0;
        for(int i=1 ; i <=4; i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese un numero");
            num = input.nextInt();
            suma = suma + num;
        }
        suma = suma * -1;
                System.out.println("El total de la suma es:  " + suma);
    }
}
