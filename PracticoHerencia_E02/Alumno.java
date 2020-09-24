package PracticoHerencia_E02;

public class Alumno extends Persona {
    // Atributos
    private  int nroEstudiante;
    private  String grupo;
    private boolean tienePrevia ;
    String retorno;
    // Contrutores


    public Alumno() {
        this.grupo = "1A";
        this.tienePrevia = false;
    }

    public Alumno(String unNombre , int unDni , int unaEdad , int nroEstudiante) {
        super(unNombre , unDni , unaEdad);
        this.nroEstudiante = nroEstudiante;
        this.grupo = "1A";
        this.tienePrevia = false;
    }
    // Metodos

    public int getNroEstudiante() {
        return nroEstudiante;
    }

    public void setNroEstudiante(int nroEstudiante) {
        this.nroEstudiante = nroEstudiante;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public boolean isTienePrevia() {
        return tienePrevia;
    }

    public void setTienePrevia(boolean tienePrevia) {
        this.tienePrevia = tienePrevia;
    }


    public String toString() {

        if(super.validaTrueNombre() && super.validaTrueDni()){
            if (this.tienePrevia ){
                retorno = super.toString() + "  El nro del Estudiante es: " + this.getNroEstudiante() +
                        "  pertenece al grupo: " + this.grupo +  " tiene Previa ";
            }
            else{
                retorno = super.toString() + "  El nro del Estudiante es: " + this.getNroEstudiante() +
                        "  pertenece al grupo: " + this.grupo +  " no tiene Previa ";
            }
            return retorno;

        }


        return super.toString();
    }
}
