package PracticoHerencia_E02;

public class Profesor extends Persona {
    //Atributos
    private String materia;
    private float salario;
    //Contructores

    public Profesor(String unNombre , int unDni , int unaEdad , String materia , float salario) {
        super(unNombre , unDni , unaEdad);
        this.materia = materia;
        this.salario = salario;
    }
    // Metodos

    public String getMateria() {
        return materia;
    }

    public void setMateria(String unaMateria) {
        this.materia = unaMateria;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float unSalario) {
        this.salario = unSalario;
    }

    @Override
    public String toString() {

        if(super.validaTrueNombre() && super.validaTrueDni()) {
            return super.toString() + "   La materia que da es : " + this.getMateria() + " tiene un salario de:  " + this.getSalario();
        }else {
            return super.toString();
        }
    }
}
