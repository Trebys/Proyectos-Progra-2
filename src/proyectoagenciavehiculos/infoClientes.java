
package proyectoagenciavehiculos;

/**
 *
 * @author 3st3b
 */
public class infoClientes {

    //Definicion de atributos
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String cedula;
    private String nacionalidad;
    private String telefono;
    private String correo;
    private String direccion;
    
    

    //Constructor Clientes
    public infoClientes() {
        nombre = "";
        primerApellido = "";
        segundoApellido = "";
        cedula = "";
        nacionalidad = "";
        telefono = "";
        correo = "";
        direccion = "";
    }

    //Metodo Get
    public String getNombre() {return nombre;}

    public String getPrimerApellido() {return primerApellido;}

    public String getSegundoApellido() {return segundoApellido;}

    public String getCedula() {return cedula;}
    
    public String getNacionalidad() {return nacionalidad;}
    
    public String getTelefono() {return telefono;}
    
    public String getCorreo() {return correo;}

    public String getDireccion() {return direccion;}

    //Metodo Set
     public void setNombre(String valor) {nombre = valor;}
     
     public void setPrimerApellido(String valor) {primerApellido = valor;} 
     
     public void setSegundoApellido(String valor) {segundoApellido = valor;}
     
     public void setCedula(String valor) {cedula = valor;}
    
     public void setNacionalidad(String valor) {nacionalidad = valor;}
     
     public void setTelefono(String valor) {telefono = valor;}

     public void setCorreo(String valor) {correo = valor;}

     public void setDireccion(String valor) {direccion = valor;}

}
