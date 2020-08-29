package PracticaMetodos;
import java.util.*;
public class Ejercicio9 {
    //9.	Crear un método que permita reciba el radio de un círculo,
    // y retorne su area (radio^2)*PI (utilizar una variable estática para el valor de PI
    public static final double PI = 3.14;
    public static void main(String [] agrs){
        double radio;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio ");
        radio = input.nextDouble();
        double areaCiculo = areaCirculo(radio);
        System.out.println("El area del circulo es  " + areaCiculo);

    }



    //METODO AREA DE UN CIRCULO

    public static double areaCirculo(double radio){
        double area = radio * radio * PI;
        return area;
    }
}
