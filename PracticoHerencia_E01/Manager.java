package PracticoHerencia_E01;

public class Manager extends Empleado {
    //Atributos
    private String area;
    //Constructor

    public Manager(String nombre , int telefono , float sueldo , String area) {
        super(nombre , telefono , sueldo);
        this.area = area;
    }
    // Metodos

    public String getArea() {
        return area;
    }

    public void setArea(String unArea) {
        this.area = unArea;
    }

    public String toString() {
        return super.toString()  + " y es manager del area de " + area ;
    }
}
