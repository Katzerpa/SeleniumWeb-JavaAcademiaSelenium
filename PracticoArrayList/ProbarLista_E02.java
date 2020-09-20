package PracticoArrayList;

import java.util.ArrayList;

public class ProbarLista_E02 {
    public static void main(String[]args){
        ArrayList<String> listaNombre = new ArrayList<String>();
        listaNombre.add("Carlos");
        listaNombre.add("Santiago");
        listaNombre.add("Maria");
        listaNombre.add("Luis");
        listaNombre.add("Wiver");
        listaNombre.add("Manuel");

        EjerciciosListas.imprimirListaString(listaNombre);

        ArrayList<Boolean> listaAsiento = new ArrayList<Boolean>();
        listaAsiento.add(true);
        listaAsiento.add(true);
        listaAsiento.add(false);
        listaAsiento.add(true);
        listaAsiento.add(true);
        listaAsiento.add(true);

        if (EjerciciosListas.listatrue(listaAsiento)){
            System.out.println("Todos los valores son verdaderos");
        }
        else{
            System.out.println("Todos los valores no son verdaderos");
        }


    }
}
