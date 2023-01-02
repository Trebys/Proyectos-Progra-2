
package proyectoagenciavehiculos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 3st3b
 */
public class archivoClientes {
    
    String nombreArchivoClientes = "Lista De Clientes.txt";
    
    
    //Metodo para agregar una persona al archivo
    public void EscribirArchivoClientes(infoClientes nuevoCliente) {
      
            //definicion
            FileWriter puntero_Archivo = null;
            
            try {
                //abre el archivo
                puntero_Archivo = new FileWriter(nombreArchivoClientes, true);
                
                //pasa los datos de persona a un solo string y genera una linea en el archivo
                puntero_Archivo.write(nuevoCliente.getNombre() + ";" + nuevoCliente.getPrimerApellido() + ";"  + nuevoCliente.getSegundoApellido() + ";" +
                        nuevoCliente.getCedula() + ";" + nuevoCliente.getNacionalidad() + ";" + nuevoCliente.getTelefono() + ";" + nuevoCliente.getCorreo() + ";" + nuevoCliente.getDireccion() + ";" 
                         + "\n");
                
            } //fin del try
            catch (IOException ex) {
                Logger.getLogger(archivoClientes.class.getName()).log(Level.SEVERE, null, ex);
            } //fin del catch
           
            try {
                puntero_Archivo.close();
            }  //fin del try     
            catch (IOException ex) {
                Logger.getLogger(archivoClientes.class.getName()).log(Level.SEVERE, null, ex);
            } //fin del catch
        
    } //fin EscribirArchivoClientes
    
}//Fin class
