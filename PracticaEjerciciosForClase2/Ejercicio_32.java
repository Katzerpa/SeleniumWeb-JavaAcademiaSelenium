package PracticaEjerciciosForClase2;

public class Ejercicio_32 {
    //Mostar los números múltiplos de 3, que se encuentran entre 10 al 40 utilizando un for.
    // Es decir, 12,15,18…
    //Que pasaria si el for comienza en en 0 en vez de 10?
    // Respuesta muestra el cero y cero es multiplo de tres. por lo tanto hay que iniciarlo en 1
    public static void main(String[] args){
        for (int b=1; b<=40;b++){
            if (b % 3 ==0){
                System.out.print(b + ", ");
            }
        }
    }

}
