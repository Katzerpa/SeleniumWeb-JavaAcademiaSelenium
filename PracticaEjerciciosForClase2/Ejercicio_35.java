package PracticaEjerciciosForClase2;

public class Ejercicio_35 {
    //Mostar por pantalla cuantos multiplos de 3 existen entre el 10 y el 70.
    public static void main(String[] args){
        int cont=0;
        for (int i=10;i<=70;i++){
            if (i % 3 ==0){
                cont++;
            }
        }
        System.out.println("La cantidad de multiplos de 3 que existe entre 10 y 70 es  " + cont);
    }
}
