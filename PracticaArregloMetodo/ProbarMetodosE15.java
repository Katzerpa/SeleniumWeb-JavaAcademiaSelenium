package PracticaArregloMetodo;

public class ProbarMetodosE15 {

        public static void main(String[] args) {
            //15. Crear un método que reciba un arreglo, y retorne la suma.
            float[] valor = new float[5];
            valor[0] = 10;
            valor[1] = 10;
            valor[2] = 10;
            valor[3] = 10;
            valor[4] = 10;
            float suma = Metodos_Arreglos.imprimirsuma(valor);
            System.out.println("El promedio del arreglo es " + suma);
        }
    }
