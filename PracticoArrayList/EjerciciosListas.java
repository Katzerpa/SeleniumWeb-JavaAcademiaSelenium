package PracticoArrayList;

import java.util.ArrayList;

public class EjerciciosListas {

    // 1 Crear un método imprimirListaEnteros que reciba una lista de enteros, y los imprima en
    //pantalla.
    public static void imprimirListaEntero(ArrayList<Integer> unaLista) {
        for (int i = 0; i < unaLista.size(); i++) {
            System.out.println("Numero: " + unaLista.get(i));
        }
    }

    // 2) Crear un método imprimirListaStrings que reciba una lista de Strings, y los imprima en
    // pantalla.
    public static void imprimirListaString(ArrayList<String> unaLista) {
        for (int i = 0; i < unaLista.size(); i++) {
            System.out.println("Nombre: " + unaLista.get(i));
        }
    }

    // 3 Método que reciba una lista de enteros, y retorne la cantidad de elementos de la misma.
    public static void imprimirCantidadElementos(ArrayList<Integer> unaLista) {
        int cont = 0;
        for (int i = 0; i < unaLista.size(); i++) {
            cont++;
        }
        System.out.println("La Cantidad de elementos en la lista es : " + cont);
    }

    //4 Método que reciba una lista de enteros, y retorne la verdadero si y sólo si la lista está
    //vacía.
    public static void esListaVacia(ArrayList<Integer> unaLista) {
        if (unaLista.isEmpty()) {
            System.out.println("La lista esta vacia!!");
        } else {
            System.out.println("Hay elementos!!");
        }
    }
    //5 Método que reciba una lista de enteros, y retorne la suma.

    public static void sumaDeElementos(ArrayList<Integer> unaLista) {
        int suma = 0;
        for (int i = 0; i < unaLista.size(); i++) {
            suma = suma + unaLista.get(i);
        }
        System.out.println("La Suma de los elementos  es : " + suma);
    }
    // 6 Método que reciba una lista de enteros, y retorne el promedio de los mismos.

    public static void promedioDeElementos(ArrayList<Integer> unaLista) {
        int suma = 0;
        int cont = 0;
        int promedio;
        for (int i = 0; i < unaLista.size(); i++) {
            cont++;
            suma = suma + unaLista.get(i);
        }
        promedio = suma / cont;
        System.out.println("El promedio de la Suma de los elementos  es : " + promedio);
    }
    //7 Método que reciba una lista de enteros, y retorne el menor.
    public static void menorDeElemento(ArrayList<Integer>unalista){
        int menor = unalista.get(0);
        for (int i = 0; i < unalista.size(); i++) {

            if (menor > unalista.get(i)){
                menor = unalista.get(i);
            }
        }
        System.out.println("El menor de los elementos  es : " + menor);

    }
    // 7 Método que reciba una lista de enteros, y retorne el mayor.
    public static void mayorDeElemento(ArrayList<Integer>unalista){
        int mayor = unalista.get(0);
        for (int i = 0; i < unalista.size(); i++) {

            if (mayor < unalista.get(i)){
                mayor = unalista.get(i);
            }
        }
        System.out.println("El mayor de los elementos  es : " + mayor);

    }
    // 9 Método que reciba una lista de booleanos, y verdadero si y sólo si, todos los elementos
    //de la lista son true. De lo contrario se debe retornar false. Sugerencia: utilizar
    //cortocircuito.

   public static boolean listatrue(ArrayList<Boolean>unlista){
        for (int i =0;i< unlista.size();i ++){
            if(!unlista.get(i)){
                return false;
            }
        }
        return true;
    }

    //10 Método leerValores (): pide por teclado los números y los almacena en el ArrayList. La
    //lectura acaba cuando se introduce el valor -99. El método devuelve mediante return el
    //ArrayList con los valores introducidos.

    public static void leerValores(ArrayList<Integer> unaLista){

        for(int i =0; i< unaLista.size();i++){
            System.out.println("Numero: " + unaLista.get(i));

        }

    }
}
