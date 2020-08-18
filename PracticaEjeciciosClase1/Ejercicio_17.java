package PracticaEjeciciosClase1;

public class Ejercicio_17 {
    //Mostrar los números múltiplos de 2 o mayores a 9 entre 0 y 30
    public static void main(String[] args){
        for (int i=1;i<30;i++){
            if (i % 2 == 0 || i > 9 ){
               System.out.println(i);
            }
        }
    }
}
