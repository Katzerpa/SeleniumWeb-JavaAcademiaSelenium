package PracticaArregloMetodo;

public class ProbarMetodoE04 {
    public static void main(String[] Args){
      // 4 Definir un arreglo de Double de 16 posiciones. Imprimir todos los valores del mismo.
        double[] lista = new double[16];
        for (int i = 0; i< lista.length; i ++){
            lista[i] = i + 1 ;
         }
         Metodos_Arreglos.imprimirArreglosDoble(lista);


    }

}
