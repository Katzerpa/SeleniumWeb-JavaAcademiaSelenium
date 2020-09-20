package PracticaArregloMetodo;

public class ProbarMetodosE12 {
    //12. Crear un método llamado imprimirArreglo que imprima en pantalla todos los elementos
    //de un array de booleanos el cual es recibido por parámetro.
    public static void main(String [] args){
       boolean[] puertas = new boolean[10];
        for(int i = 0 ;i < puertas.length; i++){
            if (i <=5){
                puertas[i]=true;
            }
            else{
                puertas[i]=false;
            }
            Metodos_Arreglos.imprimirArreglo(puertas);
        }
    }
}
