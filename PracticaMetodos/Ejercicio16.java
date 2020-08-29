package PracticaMetodos;
import java.util.*;
public class Ejercicio16 {
    //Crear un método llamado tipoTriangulo, que dado 3 valores enteros recibidos por parámetro,
    // imprima en pantalla si es escaleno, si es equilátero o isósceles.

    public static void main(String [] args){
      int lado1;
      int lado2;
      int lado3;
      Scanner input = new Scanner(System.in);
      System.out.println("Ingrese lado uno");
      lado1= input.nextInt();
      System.out.println("iIngrese el lado dos");
      lado2 = input.nextInt();
      System.out.println("ingrese el lado tres");
      lado3 = input.nextInt();
      tipoTriango(lado1,lado2,lado3);


    }


    //METODO TIPOS DE TRIANGULOS
    public static void tipoTriango(int lado1,int lado2,int lado3){

        if(lado1 == lado2 && lado2 == lado3){
            System.out.println("El triangulo es equilatero ");

        }else if(lado1 !=lado2 && lado3 != lado2 && lado1 !=lado2){
            System.out.println("El triangulo es Escaleno ");

        }else{
            System.out.println("El triangulo es Isosceles ");
        }
    }

}
