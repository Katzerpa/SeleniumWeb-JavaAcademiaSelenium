package PracticoHerencia_E01;


public class Tester extends Empleado {
    // Atributos
    private boolean esManual;
    private boolean esAutomatizador;
    // Constructor


    public Tester(String nombre , int telefono , float sueldo , Boolean esManual , Boolean esAutomatizador) {
        super(nombre , telefono , sueldo);
        this.esManual = esManual;
        this.esAutomatizador = esAutomatizador;
        //Si el Tester es automatizador, se asume que es tester Manual.
        if (this.esAutomatizador == true) {
            this.esManual = true;
        }
    }
     //Metodos
    public Boolean getEsManual() {
        return esManual;
    }

    public void setEsManual(Boolean esManual) {
        this.esManual = esManual;
    }

    public Boolean getEsAutomatizador() {
        return esAutomatizador;
    }

    public void setEsAutomatizador(Boolean esAutomatizador) {
        this.esAutomatizador = esAutomatizador;
        //Si el Tester es automatizador, se asume que es tester Manual.
        if (this.esAutomatizador == true) {
            this.esManual = true;
        }
    }

    public String toString() {
        String retorno ="" ;
        if(this.esAutomatizador == true) {
            retorno = "  Es tester manual y es tester Automatizador";
        }
        else{
          retorno = " Es tester Manual y no es tester Automatizador";
        }

        return super.toString() + retorno;
    }
}
