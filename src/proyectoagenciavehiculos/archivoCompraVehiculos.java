
package proyectoagenciavehiculos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 3st3b
 */
public class archivoCompraVehiculos {
    
    String ArchivoVehiculosCompra = "Lista Compra De Vehiculos.txt";
    
    //Metodo para agregar un vehiculo de compra al archivo
    public void EscribirVehiculoC(compraVehiculo compraNuevoVehiculo) {
      
            //definicion
            FileWriter puntero_Archivo = null;
            
            try {
                //abre el archivo
                puntero_Archivo = new FileWriter(ArchivoVehiculosCompra, true);
                
                //pasa los datos del vehiculo a un solo string y genera una linea en el archivo
                puntero_Archivo.write(compraNuevoVehiculo.getMarcaC() + ";" + compraNuevoVehiculo.getModeloC() + ";"  + compraNuevoVehiculo.getEstiloC() + ";" +
                        compraNuevoVehiculo.getCombustibleC() + ";"  + compraNuevoVehiculo.getTransmisionC() + ";" + compraNuevoVehiculo.getColorC() + ";" + compraNuevoVehiculo.getCilindrajeC() + ";" 
                        + compraNuevoVehiculo.getPasajerosC() + "\n");
                
            } //fin del try
            catch (IOException ex) {
                Logger.getLogger(archivoCompraVehiculos.class.getName()).log(Level.SEVERE, null, ex);
            } //fin del catch
           
            try {
                puntero_Archivo.close();
            }  //fin del try     
            catch (IOException ex) {
                Logger.getLogger(archivoCompraVehiculos.class.getName()).log(Level.SEVERE, null, ex);
            } //fin del catch
        
    } //fin Escribir vehiculo compra
    
  
}//Fin Class
    

