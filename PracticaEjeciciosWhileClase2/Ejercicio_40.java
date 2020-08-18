package PracticaEjeciciosWhileClase2;

public class Ejercicio_40 {
    //Mostar los múltiplos de 9 entre 0 y 100 que sean impares.
    public static void main(String[] args){
        int num =0;
        while (num<100){
            num ++;
            if (num % 9 ==0 && num % 2 !=0){
                System.out.println(num);
            }
        }
    }

}
