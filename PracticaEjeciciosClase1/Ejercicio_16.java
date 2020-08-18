package PracticaEjeciciosClase1;

public class Ejercicio_16 {
    //Mostrar los números múltiplos de 2 y mayores a 9 entre 0 y 30
    public static void  main(String[] args){
        for (int i=0;i<31;i++){
            if(i % 2 ==0 && i > 9 && i< 30){
                System.out.println(i);
            }
        }
    }
}
