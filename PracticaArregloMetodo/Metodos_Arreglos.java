package PracticaArregloMetodo;

import java.util.Scanner;

public class Metodos_Arreglos {

    //4 Definir un arreglo de Double de 16 posiciones. Imprimir todos los valores del mismo.
    public static void imprimirArreglosDoble(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("La posicion " + i + " esta en " + arreglo[i]);
        }
    }
    // 5 Definir un arreglo de Booleanos con 9 posiciones.
    // Imprimir todos los valores del arreglo.

    public static void imprimirArreglosBoolean(boolean[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("La posicion " + i + " esta en " + arreglo[i]);
        }
    }

    // 6 Crear un array de números de 100 posiciones, que contendrá los números del 1 al 100.
    //Obtener la suma de todos ellos y el promedio.

    public static void imprimirSumayPromedio(double[] cantidad) {
        int cont = 0;
        double promedio = 0;
        double suma = 0;
        for (int i = 0; i < cantidad.length; i++) {
            cont++;
            cantidad[i] = i + 1;
            suma = suma + cantidad[i];
        }
        promedio = suma / cont;
        System.out.println("La suma de los numeros es " + suma + " y el promedio de la suma es  " + promedio);
    }
    //7. Llenar un array con números aleatorios. Imprimir todos los números en pantalla.

    public static void imprimirNumerosAlearoidos(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(" Numeros aleatorios son: " + numeros[i]);
        }
    }

    //8. Crear un array de booleanos con 10 posiciones llamado asientosLibres y colocar todos
    //sus elementos en true .
    public static void imprimirAsientosLibres(boolean[] asientos) {
        for (int i = 0; i < asientos.length; i++) {
            asientos[i] = true;
            System.out.println("Asiento nro: " + (i + 1) + " " + asientos[i]);
        }
    }
    //9. Crear un método que reciba un arreglo, y retorne la cantidad de elementos
    // de la misma.

    public static int imprimirCantidadArreglo(int[] num) {
        int cont = 0;
        for (int i = 0; i < num.length; i++) {

            cont++;
        }
        return cont;
    }
    // 10. Crear un método llamado crearArregloBooleano que retorne un arreglo de 10
    // posiciones de tipo booleanos donde todas sus posiciones tengan valor false.

    public static void crearArregloBooleano(boolean[] asientos) {
        for (int i = 0; i < asientos.length; i++) {
            System.out.println("Asiento nro: " + (i + 1) + " " + asientos[i]);
        }

    }

    //11. Crear un método llamado imprimirArreglo que imprima en pantalla todos los elementos
    //de un array de enteros el cual es recibido por parámetro.
    public static void imprimirArreglo(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    // 12. Crear un método llamado imprimirArreglo que imprima en pantalla todos los elementos
    // de un array de booleanos el cual es recibido por parámetro.
    public static void imprimirArreglo(boolean[] puertas) {
        for (int i = 0; i < puertas.length; i++) {
            System.out.println("la Puerta nro : " + (i + 1) + " " + puertas[i]);
        }
    }

    //13. Crear un método que muestre en pantalla todos los elementos de un array de float.
    public static void imprimirArreglo(float[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
    //14. Crear un método que reciba una arreglo, y retorne el promedio de los mismos.

    public static float imprimirPromedio(float[] cantidad) {
        int cont = 0;
        float promedio = 0;
        float suma = 0;
        for (int i = 0; i < cantidad.length; i++) {
            cont++;
            suma = suma + cantidad[i];
        }
        promedio = suma / cont;
        return promedio;
    }

    //15. Crear un método que reciba un arreglo, y retorne la suma.
    public static float imprimirsuma(float[] cantidad) {
        float suma = 0;
        for (int i = 0; i < cantidad.length; i++) {

            suma = suma + cantidad[i];
        }

        return suma;
    }

    //16. Crear un método que reciba un arreglo de enteros, y retorne el menor.
    public static int numeroMenor(int[] num) {
        int menor;
        menor = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < menor) {
                menor = num[i];
            }
        }
        return menor;
    }

    //17. Crear un método que reciba un arreglo de enteros, y retorne el mayor.
    public static int numeroMayor(int[] num) {
        int mayor;
        mayor = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > mayor) {
                mayor = num[i];
            }
        }
        return mayor;
    }

    //18. Crear un método llamado hayVacantes que reciba un arreglo de booleanos y retorne
    // verdadero si alguna de sus posiciones esta en true , de lo contrario, deberá retornar
    //false.
    public static void hayVacante(boolean[] vacante) {
        for (int i = 0; i < vacante.length; i++) {
            if (vacante[i] == true) {
                System.out.println("el puesto nro " + (i + 1) + " Tiene Vancante");
            } else {
                System.out.println("el puesto nro " + (i + 1) + " No Tiene Vancante");
            }
        }

    }

    //19. Crear un método que reciba un arreglo de enteros por parámetro y que solicite el
    //ingreso de un valor. Debe retornar true si y sólo si el valor ingresado por el usuario se
    //encuentra en el arreglo.

    public static int[]  arregloEntero(int tamanio) {
        int[] num = new int[tamanio];
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }
        return num;
    }
    public static boolean comparaArreglo(){
        boolean flag=false;

        Scanner input = new Scanner(System.in);
        System.out.println("ingrese tamanio arreglo");
        int tamanio = input.nextInt();
        System.out.println("ingrese un numero  para comparar");
        int numero = input.nextInt();
        //--------------------------------
        int[] aux = arregloEntero(tamanio);

       for (int j = 0; j<aux.length ; j++){

           if(numero==aux[j]){
               flag= true;
               break;
           }
       }
        return flag;

    }

}










