package PracticaArregloMetodo;

public class ProbarMetodosE13 {
    //13. Crear un método que muestre en pantalla todos los elementos de un array de float.
    public static void main(String[] args){
        float[] numero = new float[20];
        for (int i= 0; i< numero.length; i ++){
            numero[i]= i + 1;
        }
        Metodos_Arreglos.imprimirArreglo(numero);
    }

}
