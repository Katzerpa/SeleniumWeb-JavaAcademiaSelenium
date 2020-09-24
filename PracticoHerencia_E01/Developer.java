package PracticoHerencia_E01;

public class Developer extends Empleado {
    //Atributos
    private String lenguaje;
    //constructor

    public Developer(String nombre , int telefono , float sueldo , String lenguaje) {
        super(nombre , telefono , sueldo);
        this.lenguaje = lenguaje;
    }
    //Metodos

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String unLenguaje) {
        this.lenguaje = unLenguaje;
    }

    public String toString() {

        return super.toString()  +  " y es programador  en el lenguaje  " + lenguaje;
    }
}
