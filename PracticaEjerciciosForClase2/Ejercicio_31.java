package PracticaEjerciciosForClase2;

public class Ejercicio_31 {
    //Mostar los números múltiplos de 3, que se encuentran entre 10 al 40 utilizando un for.
    // Es decir, 12,15,18…
    public static void main(String[] args){
        for (int b=10; b<=40;b++){
            if (b % 3 ==0){
                System.out.print(b + ", ");
            }
        }
    }
}
