package PracticaClasesyObjetos_E01;

import java.util.Scanner;

public class Automotora {
    public static void main(String[] args){
/*
       /// Impresion de todos los contructores//
        Camion camion1 = new Camion();
        System.out.println(camion1);
        Camion camion2 = new Camion(1228);
        System.out.println(camion2);
        Camion camion3 = new Camion(1323,"Morado");
        System.out.println(camion3);

 */
      ///Pedir Datos Usuarios

        Scanner input = new Scanner(System.in);
        Camion camion1 = new Camion();
        System.out.println("Ingrese la Chapa de camion nro 2");
        int chapa = input.nextInt();
        Camion camion2 = new Camion(chapa);
        System.out.println("Ingrese la Chapa del camion nro 3");
        int chapa1 = input.nextInt();
        System.out.println("Ingrese el Color del camion nro 3");
        String color = input.next();
        System.out.println("Ingrese el año de compra del camion nro 3");
        int añoCompra = input.nextInt();
        Camion camion3 = new Camion(chapa1,color,añoCompra);
        System.out.println(camion1);
        System.out.println(camion2);
        System.out.println(camion3);


        if(camion1.tieneMismoColor(camion2)==true && camion1.tieneMismoColor(camion3) == true && camion2.tieneMismoColor(camion1)== true){

            System.out.println(" los  camiones : 1, 2 y 3 tienen el mismo color" );
        }
        else{
            System.out.println(" los  camiones no tienen el mismo color" );
            if (camion1.tieneMismoColor(camion2)){
                System.out.println(" El camion1 y el camion2 tienen el mismo color Entonces 3 no" );
            }
            if (camion1.tieneMismoColor(camion3)){
                System.out.println(" El camion1 y el camion3 tienen el mismo color Entonces 2 no" );
            }
            if (camion2.tieneMismoColor(camion3)){
                System.out.println(" El camion2 y el camion3 tienen el mismo color Entonces 1 no" );
            }

        }








    }
}
