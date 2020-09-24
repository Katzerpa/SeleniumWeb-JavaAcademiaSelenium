package PracticoHerencia_E02;

public class Persona {

    //atributos
    protected String nombre;
    protected int dni;
    protected int edad;


    //Contructores


    public Persona() {
        this.nombre = "Desconocido";
        this.dni =  0;
        this.edad = 0;

    }

    public Persona(String unNombre , int unDni , int unaEdad) {
        this.nombre = unNombre;
        this.dni = unDni;
        this.edad = unaEdad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Nombre no puede ser desconocido
    public boolean validaTrueNombre(){
        if(this.nombre != "" && this.nombre != null && this.nombre != ""){
            return true;
        }else{
            return  false;

        }
    }
    //Dni no puede ser desconocido
    public boolean validaTrueDni(){
        if(this.dni > 0){
            return true;
        }else{
            return false;

        }
    }

    @Override
    public String toString() {
        String s;
        if (validaTrueNombre() && validaTrueDni()){
            s= "El Nommbre es " + this.getNombre() + " DNI numero: " + this.getDni() + "  su Edad es : " + this.getEdad();

        }
        else{
            s = " Error Verifique nombre ó DNI";

        }
        return s;
    }
}
