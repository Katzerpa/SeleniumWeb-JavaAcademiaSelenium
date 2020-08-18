package PracticaEjerciciosForClase2;

public class Ejercicio_27 {
    //Imprimir los números del 20 al 10, de forma decreciente.

    public static void main(String[] args){
        int y=20;
        for (int i=10;i<=20; i++){
            System.out.println(y--);
            if(y==0) break;
        }
    }
}
