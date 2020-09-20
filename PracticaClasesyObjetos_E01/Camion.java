package PracticaClasesyObjetos_E01;

public class Camion {

    //Atributos
    private int chapa;
    private String  color;
    private int añoCompra;


    //Contructores

    public Camion(){
     chapa = 100;
     color = "AMARILLO";
     añoCompra = 2010;
    }
    public Camion(int chapa){
        this.chapa = chapa;
        this.color = "AMARILLO";
        this.añoCompra=2019;
    }

    public Camion(int chapa,String color,int añoCompra){
        this.chapa = chapa;
        this.color = color;
        this.añoCompra = añoCompra;

    }


    //Metodos

    public int getChapa() {
        return this.chapa;
    }

    public void  setChapa(int chapa){
        this.chapa = chapa;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public int getAñoCompra() {
        return this.añoCompra;
    }

    public void setColor(int añoCompra) {
        this.añoCompra = añoCompra;
    }
    private boolean leTocaRevision(){
        if ((this.añoCompra) < 2015) {
            return true;
        }
        else{
            return false;
        }
    }


    public boolean tieneMismoColor( Camion unCamion){
        return this.getColor().equals(unCamion.getColor());
    }

    public String toString() {

        String retorno = "El color del camion es " + this.color + "  y la chapa es  " + this.chapa + "  el año de camion es " + this.añoCompra;

        if(leTocaRevision() == true){
            retorno += " y le toca revision";
        }
        else{
            retorno += " y no le toca revision";
        }
        return retorno;

    }


}

