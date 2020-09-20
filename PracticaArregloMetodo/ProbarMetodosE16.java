package PracticaArregloMetodo;

public class ProbarMetodosE16 {
    //16. Crear un método que reciba un arreglo de enteros, y retorne el menor.
    //17. Crear un método que reciba un arreglo de enteros, y retorne el mayor.
    public static void main(String[] args){
        int[] num = new int[6];
        num[0]= 40;
        num[1]= 4;
        num[2]= 10;
        num[3]= 2;
        num[4]= 60;
        num[5]= 4;
        int menor = Metodos_Arreglos.numeroMenor(num);
        int mayor = Metodos_Arreglos.numeroMayor(num);
        System.out.println("El numero menor es " + menor);
        System.out.println("El numero mayor es " + mayor);





    }
}
