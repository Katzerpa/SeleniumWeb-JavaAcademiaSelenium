package PracticoHerencia_E02;

import java.util.Scanner;

public class Colegio {
    public static void main(String [] args){
        String nombrePersona = null;
        int dniPersona;
        int edadPersona;
        Scanner  input = new Scanner(System.in);
        System.out.println("Seleccione 1 para alumno y 2 para Profesor");
        int opcionMenu = input.nextInt();
        if (opcionMenu == 1 ){
            // Ingresar Alunmno
            System.out.println("Conoces el nombre de la Persona S/N");
            String opcion = input.next();
            if(opcion.equalsIgnoreCase("S")){
                System.out.println("Ingrese el nombre de la persona");
                nombrePersona = input.next();
            }
            System.out.println("Ingrese DNI de la Pesona");
            dniPersona = input.nextInt();
            System.out.println(" Ingrese el numero del estudiante");
            int nroEstudiante = input.nextInt();
            System.out.println("ingrese la edad de la persona");
            edadPersona = input.nextInt();

            Persona estudiante = new Alumno(nombrePersona,dniPersona,edadPersona,nroEstudiante);
            System.out.println(estudiante);
        }
        if (opcionMenu == 2){
            System.out.println("Conoces el nombre de la Persona S/N");
            String opcion = input.next();
            if(opcion.equalsIgnoreCase("S")){
                System.out.println("Ingrese el nombre de la persona");
                nombrePersona = input.next();
            }
            System.out.println("Ingrese DNI de la Pesona");
            dniPersona = input.nextInt();
            System.out.println(" Ingrese la materia asignada");
            String materia = input.next();
            System.out.println("ingrese la edad de la persona");
            edadPersona = input.nextInt();
            System.out.println("ingrese el sueldo de la persona");
            float sueldo = input.nextFloat();

            Persona profesor = new Profesor(nombrePersona,dniPersona,edadPersona,materia,sueldo);
            System.out.println(profesor);

        }
    }
}
