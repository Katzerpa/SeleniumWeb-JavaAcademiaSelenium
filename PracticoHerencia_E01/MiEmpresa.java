package PracticoHerencia_E01;

import java.util.Scanner;

public class MiEmpresa {
    public static void main(String[] args) {
        //variables
        String nombre;
        int telefono;
        float sueldo;
        boolean manual = false;
        boolean automatico = false;
        String lenguaje;
        String area;

        //ingresar 1 Tester
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese nombre empleado");
        nombre = input.next();
        System.out.println("Ingrese Telefono empleado");
        telefono = input.nextInt();
        System.out.println("Ingrese sueldo empleado");
        sueldo = input.nextInt();
        System.out.println("¿El tester es Automatizados? S/N ");
        String opcion = input.next();
        if (opcion.equalsIgnoreCase("S")) {
            automatico = true;
        }
        else  {
            manual = true;

        }

        Empleado test = new Tester(nombre , telefono , sueldo , manual , automatico);
        //dos developers
        System.out.println("Ingrese nombre empleado");
        nombre = input.next();
        System.out.println("Ingrese Telefono empleado");
        telefono = input.nextInt();
        System.out.println("Ingrese sueldo empleado");
        sueldo = input.nextInt();
        System.out.println("Ingrese el tipo de Lenguaje");
        lenguaje = input.next();
        Empleado dev1 = new Developer(nombre,telefono,sueldo,lenguaje);

        System.out.println("Ingrese nombre empleado");
        nombre = input.next();
        System.out.println("Ingrese Telefono empleado");
        telefono = input.nextInt();
        System.out.println("Ingrese sueldo empleado");
        sueldo = input.nextInt();
        System.out.println("Ingrese el tipo de Lenguaje");
        lenguaje = input.next();
        Empleado dev2 = new Developer(nombre,telefono,sueldo,lenguaje);

        //una manager
        System.out.println("Ingrese nombre empleado");
        nombre = input.next();
        System.out.println("Ingrese Telefono empleado");
        telefono = input.nextInt();
        System.out.println("Ingrese sueldo empleado");
        sueldo = input.nextInt();
        System.out.println("Ingrese el Area de Trabajo");
        area = input.next();
        Empleado manager = new Manager(nombre,telefono,sueldo,area);

        System.out.println(test);
        System.out.println(dev1);
        System.out.println(dev2);
        System.out.println(manager);


    }
}

