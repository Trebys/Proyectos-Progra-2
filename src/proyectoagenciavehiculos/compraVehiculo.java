
package proyectoagenciavehiculos;

/**
 *
 * @author 3st3b
 */
public class compraVehiculo {
    private String marcaC;
    private String modeloC;
    private String estiloC;
    private String tipoCombustibleC;
    private String transmisionC;
    private String colorC;
    private String cantidadPasajerosC;
    private String cilindrajeC;
    
    
    
    //Constructor Compra vehiculo
    public compraVehiculo (){
    marcaC = "";
    modeloC = "";
    estiloC = "";
    tipoCombustibleC = "";
    transmisionC = "";
    colorC = "";
    cilindrajeC = "";
    cantidadPasajerosC = "";
    }
    
    //Metodo get
    //String

    public String getMarcaC() {return marcaC;}

    public String getModeloC() {return modeloC;}

    public String getEstiloC() {return estiloC;}

    public String getCombustibleC() {return tipoCombustibleC;}

    public String getTransmisionC() {return transmisionC;}

    public String getColorC() {return colorC;}

    public String getCilindrajeC() {return cilindrajeC;}

    public String getPasajerosC() {return cantidadPasajerosC;}

    //Metodo Set
    //String

    public void setMarcaC(String valor) {marcaC = valor;}

    public void setModeloC(String valor) {modeloC = valor;}

    public void setEstiloC(String valor) {estiloC = valor;}

    public void setCombustibleC(String valor) {tipoCombustibleC = valor;}

    public void setTransmisionC(String valor) {transmisionC = valor;}

    public void setColorC(String valor) {colorC = valor;}

    public void setCilindrajeC(String valor) {cilindrajeC = valor;}

    public void setPasajerosC(String valor) {cantidadPasajerosC = valor;}
}
