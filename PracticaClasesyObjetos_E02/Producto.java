public class Producto {

    //atributos
    private String nombre;
    private int codigo;
    private String nroLote;
    private boolean esImportado;
    private int nroProducto;

    // es una variable de la clase Producto!! (static)
    private static int CONTADOR_PRODUCTO = 0;

    //constructores
    public Producto(){
        this.nombre = "desconocido";
        this.codigo = 0;
        this.esImportado = false;
        this.nroLote = "desconocido";
        CONTADOR_PRODUCTO = CONTADOR_PRODUCTO + 1;
        this.nroProducto = CONTADOR_PRODUCTO;
    }

    public Producto(String nombre){
        this.nombre = nombre;
        this.codigo = 0;
        this.esImportado = false;
        this.nroLote = "Desconocido";
        CONTADOR_PRODUCTO = CONTADOR_PRODUCTO + 1;
        this.nroProducto = CONTADOR_PRODUCTO;
    }

    public Producto(int unCodigo){
        this.nombre = "Desconocido";
        this.codigo = unCodigo;
        this.esImportado = false;
        this.nroLote = "desconocido";

        CONTADOR_PRODUCTO = CONTADOR_PRODUCTO + 1;
        this.nroProducto = CONTADOR_PRODUCTO;
    }

    public Producto(String unNombre, int unCodigo, boolean importado, String lote, int nroProd){
        this.nombre = unNombre;
        this.codigo = unCodigo;
        this.esImportado = importado;
        this.nroLote = lote;

        CONTADOR_PRODUCTO = CONTADOR_PRODUCTO + 1;
        this.nroProducto = CONTADOR_PRODUCTO;
    }

    //setters y getters...
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setCodigo (int unCodigo){
        this.codigo = unCodigo;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setEsImportado(boolean esImport){
        this.esImportado = esImport;
    }

    public boolean getEsImportado(){
        return this.esImportado;
    }

    public String toString(){
        String textoAImprimir = "El producto " + this.nombre +" y codigo " + this.codigo;
        if (this.esImportado == true) {
            textoAImprimir += " es importado.";
        } else {
            textoAImprimir += " es nacional.";
        }
        textoAImprimir +=  " Su lote es " + this.nroLote +" y el nro producto es "
                + this.nroProducto;

        return  textoAImprimir;

    }

}
