/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package proyectoagenciavehiculos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 3st3b
 */
public class ventanaListaClientes extends javax.swing.JDialog {

    /**
     * Creates new form ventanaListaClientes
     */
    public ventanaListaClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaClientes = new javax.swing.JTable();
        btnMostrarClientes = new javax.swing.JButton();
        lblTituloRegistro = new javax.swing.JLabel();
        lblListaClientesFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblListaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblListaClientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tblListaClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 520, 150));

        btnMostrarClientes.setText("Mostrar Clientes Registrados");
        btnMostrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 190, 60));

        lblTituloRegistro.setFont(new java.awt.Font("Dialog", 3, 30)); // NOI18N
        lblTituloRegistro.setForeground(new java.awt.Color(0, 0, 0));
        lblTituloRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloRegistro.setText("Tabla con datos de los clientes.");
        getContentPane().add(lblTituloRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 500, 40));

        lblListaClientesFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo Lista Clientes.jpg"))); // NOI18N
        getContentPane().add(lblListaClientesFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarClientesActionPerformed
        // TODO add your handling code here:
        //Seleccionar ruta del archivo para mostrarlo
        String rutaArchivoClientes = "F:\\Progra 1\\Proyecto 2\\proyectoAgenciaVehiculos\\Lista De Clientes.txt";
        File archivo = new File (rutaArchivoClientes);
        
        //Try Catch
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            
            DefaultTableModel modelo = (DefaultTableModel) tblListaClientes.getModel();
           
            modelo.addColumn("Nombre");
            modelo.addColumn("Primer Apellido");
            modelo.addColumn("Segundo Apellido");
            modelo.addColumn("Cédula");
            modelo.addColumn("Nacionalidad");
            modelo.addColumn("Teléfono");
            modelo.addColumn("Correo Electrónico");
            modelo.addColumn("Direccion");
            

            Object[] lineasTabla = br.lines().toArray();
            
            //
            for(int i = 0; i <lineasTabla.length;i++){
            String linea = lineasTabla[i].toString().trim();
            String [] datoFila = linea.split(";");
            //
            modelo.addRow(datoFila);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ventanaListaClientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ventanaListaClientes.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnMostrarClientesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ventanaListaClientes dialog = new ventanaListaClientes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarClientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListaClientesFondo;
    private javax.swing.JLabel lblTituloRegistro;
    private javax.swing.JTable tblListaClientes;
    // End of variables declaration//GEN-END:variables
}
