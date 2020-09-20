package PracticoArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class ProbarLista_E01 {
    public static void main(String[]args){
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        ArrayList<Integer> listaNumeros2 = new ArrayList<Integer>();
        int num =0;
        listaNumeros.add(12);
        listaNumeros.add(6);
        listaNumeros.add(20);
        listaNumeros.add(21);
        listaNumeros.add(22);
        EjerciciosListas.imprimirListaEntero(listaNumeros);
        EjerciciosListas.imprimirCantidadElementos(listaNumeros);
        EjerciciosListas.esListaVacia(listaNumeros);
        EjerciciosListas.sumaDeElementos(listaNumeros);
        EjerciciosListas.promedioDeElementos(listaNumeros);
        EjerciciosListas.menorDeElemento(listaNumeros);
        EjerciciosListas.mayorDeElemento(listaNumeros);

        while (num != -99){
            Scanner input = new Scanner(System.in);
            System.out.println("Intriduzca un numero");
            num = input.nextInt();
            listaNumeros2.add(num);
        }
        EjerciciosListas.leerValores(listaNumeros2);


    }

}
