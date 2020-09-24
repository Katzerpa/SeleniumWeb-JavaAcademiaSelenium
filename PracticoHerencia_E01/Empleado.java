package PracticoHerencia_E01;

public class Empleado {
    //Atributos
    protected String nombre;
    protected int telefono;
    protected float sueldo;
    //Constructor
    public Empleado() {
        nombre = "Desconocido";
        telefono = 11111111;
        sueldo = 40000;
    }

    public Empleado(String nombre , int telefono , float sueldo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.sueldo = sueldo;
    }
    //Metodos
    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public void setTelefono(int unTelefono) {
        this.telefono = unTelefono;
    }

    public void setSueldo(float unSueldo) {
        this.sueldo = unSueldo;
    }

    @Override
    public String toString() {
        return " El empleado " + nombre + "   Telefono " + telefono + "  Sueldo " + sueldo;
    }
}
