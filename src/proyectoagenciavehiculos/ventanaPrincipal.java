/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoagenciavehiculos;

/**
 *
 * @author 3st3b
 */
public class ventanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ventanaPrincipal
     */
    public ventanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnRegistroCliente = new javax.swing.JButton();
        btnCompra = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        btnListaClientes = new javax.swing.JButton();
        btnListaVehiculosVenta = new javax.swing.JButton();
        lblSubtitulo = new javax.swing.JLabel();
        lblFondoLetras = new javax.swing.JLabel();
        lblFondoAutos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Dialog", 3, 30)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 153, 51));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Compra y Venta De Vehiculos Trebys");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 50));

        btnRegistroCliente.setBackground(new java.awt.Color(51, 51, 51));
        btnRegistroCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnRegistroCliente.setText("Registro Cliente");
        btnRegistroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 150, 60));

        btnCompra.setBackground(new java.awt.Color(51, 51, 51));
        btnCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir-al-carrito.png"))); // NOI18N
        btnCompra.setText("Compra");
        btnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraActionPerformed(evt);
            }
        });
        getContentPane().add(btnCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 140, 60));

        btnVenta.setBackground(new java.awt.Color(51, 51, 51));
        btnVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vender.png"))); // NOI18N
        btnVenta.setText("Venta");
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 140, 60));

        btnListaClientes.setBackground(new java.awt.Color(51, 51, 51));
        btnListaClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnListaClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Lista.png"))); // NOI18N
        btnListaClientes.setText("Lista de Clientes");
        btnListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnListaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 210, 60));

        btnListaVehiculosVenta.setBackground(new java.awt.Color(51, 51, 51));
        btnListaVehiculosVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnListaVehiculosVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Lista.png"))); // NOI18N
        btnListaVehiculosVenta.setText("Lista de vehiculos para la venta");
        btnListaVehiculosVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaVehiculosVentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnListaVehiculosVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 230, 60));

        lblSubtitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblSubtitulo.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtitulo.setText("Click en cualquier botón para ejecutar");
        getContentPane().add(lblSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 380, -1));

        lblFondoLetras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo negro.jpg"))); // NOI18N
        getContentPane().add(lblFondoLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 620, 100));

        lblFondoAutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Autos.jpg"))); // NOI18N
        getContentPane().add(lblFondoAutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroClienteActionPerformed
        // TODO add your handling code here:
        new ventanaRegistroClientes(this, true).setVisible(true);
    }//GEN-LAST:event_btnRegistroClienteActionPerformed

    private void btnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraActionPerformed
        new ventanaCompraVehiculo(this, true).setVisible(true);
    }//GEN-LAST:event_btnCompraActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        new ventanaVentaVehiculo(this, true).setVisible(true);
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaClientesActionPerformed
        // TODO add your handling code here:
        new ventanaListaClientes(this, true).setVisible(true);
    }//GEN-LAST:event_btnListaClientesActionPerformed

    private void btnListaVehiculosVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaVehiculosVentaActionPerformed
        // TODO add your handling code here:
        new ventanaListaVehiculosVenta(this, true).setVisible(true);
    }//GEN-LAST:event_btnListaVehiculosVentaActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompra;
    private javax.swing.JButton btnListaClientes;
    private javax.swing.JButton btnListaVehiculosVenta;
    private javax.swing.JButton btnRegistroCliente;
    private javax.swing.JButton btnVenta;
    private javax.swing.JLabel lblFondoAutos;
    private javax.swing.JLabel lblFondoLetras;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}