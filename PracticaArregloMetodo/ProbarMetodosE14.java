package PracticaArregloMetodo;

public class ProbarMetodosE14 {
    public static void main(String[] args){
        //14. Crear un método que reciba una arreglo, y retorne el promedio de los mismos.
        float[] valor = new float[5];
        valor[0]=10;
        valor[1]=10;
        valor[2]=10;
        valor[3]=10;
        valor[4]=10;
        float promedio = Metodos_Arreglos.imprimirPromedio(valor);
        System.out.println("El promedio del arreglo es " + promedio );
    }
}
