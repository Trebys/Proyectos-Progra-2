
package proyectoagenciavehiculos;

/**
 *
 * @author 3st3b
 */
public class ventaVehiculo {
    private String cedulaV;
    private String placaV;
    private String marcaV;
    private String modeloV;
    private String estiloV;
    private String tipoCombustibleV;
    private String transmisionV;
    private String colorV;
    private String cilindrajeV;
    private String cantidadPasajerosV;

    //Añadir una atributo cedula o usar la de clase personas
    //Constructor Vehiculo
    public ventaVehiculo() {
        cedulaV = "";
        placaV = "";
        marcaV = "";
        modeloV = "";
        estiloV = "";
        tipoCombustibleV = "";
        transmisionV = "";
        colorV = "";
        cilindrajeV = "";
        cantidadPasajerosV = "";

    }

    //Metodo get
    public String getCedulaV() {return cedulaV;}
    
    public String getPlacaV() {return placaV;}

    public String getMarcaV() {return marcaV;}

    public String getModeloV() {return modeloV;}

    public String getEstiloV() {return estiloV;}

    public String getCombustibleV() {return tipoCombustibleV;}

    public String getTransmisionV() {return transmisionV;}

    public String getColorV() {return colorV;}

    public String getCilindrajeV() {return cilindrajeV;}

    public String getPasajerosV() {return cantidadPasajerosV;}

    //Metodo Set
    public void setCedulaV(String valor) {cedulaV = valor;}
    
    public void setPlacaV(String valor) {placaV = valor;}

    public void setMarcaV(String valor) {marcaV = valor;}

    public void setModeloV(String valor) {modeloV = valor;}

    public void setEstiloV(String valor) {estiloV = valor;}

    public void setCombustibleV(String valor) {tipoCombustibleV = valor;}

    public void setTransmisionV(String valor) {transmisionV = valor;}

    public void setColorV(String valor) {colorV = valor;}

    public void setCilindrajeV(String valor) {cilindrajeV = valor;}

    public void setPasajerosV(String valor) {cantidadPasajerosV = valor;}
}
