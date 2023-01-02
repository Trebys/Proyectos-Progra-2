
package proyectoagenciavehiculos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 3st3b
 */
public class archivoVentaVehiculos {
    
    String ArchivoVehiculosVenta = "Lista Venta de Vehiculos.txt";
    
//Metodo para agregar un vehiculo de venta al archivo
    public void EscribirVehiculoV(ventaVehiculo ventaNuevoVehiculo) {
      
            //definicion
            FileWriter puntero_Archivo = null;
            
            try {
                //abre el archivo
                puntero_Archivo = new FileWriter(ArchivoVehiculosVenta, true);
                
                //pasa los datos del vehiculo a un solo string y genera una linea en el archivo
                puntero_Archivo.write(ventaNuevoVehiculo.getCedulaV()+ ";" + ventaNuevoVehiculo.getPlacaV() + ";" + ventaNuevoVehiculo.getMarcaV() + ";"  + ventaNuevoVehiculo.getModeloV() + ";" +
                        ventaNuevoVehiculo.getEstiloV() + ";"  + ventaNuevoVehiculo.getCilindrajeV() + ";" + ventaNuevoVehiculo.getCombustibleV() + ";" + ventaNuevoVehiculo.getTransmisionV() + ";" 
                        + ventaNuevoVehiculo.getPasajerosV() + ";" + ventaNuevoVehiculo.getColorV() + "\n");
                
            } //fin del try
            catch (IOException ex) {
                Logger.getLogger(archivoVentaVehiculos.class.getName()).log(Level.SEVERE, null, ex);
            } //fin del catch
           
            try {
                puntero_Archivo.close();
            }  //fin del try     
            catch (IOException ex) {
                Logger.getLogger(archivoVentaVehiculos.class.getName()).log(Level.SEVERE, null, ex);
            } //fin del catch
        
    } //fin EscribirVehiculosV
    
   
}//Fin class

