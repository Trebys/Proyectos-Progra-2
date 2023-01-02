/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package proyectoagenciavehiculos;

import javax.swing.JOptionPane;

/**
 *
 * @author 3st3b
 */
public class ventanaRegistroClientes extends javax.swing.JDialog {

    //Instanciar los objetos para trabajar con otras clases y archivos
    infoClientes iClientes = new infoClientes();
    archivoClientes iArchivoClientes = new archivoClientes();
    
    /**
     * Creates new form ventanaRegistroClientes
     */
    public ventanaRegistroClientes(java.awt.Frame parent, boolean modal) {
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

        lblTituloRegistro = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblPrimerApellido = new javax.swing.JLabel();
        lblSegundoApellido = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblNacionalidad = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrimerApellido = new javax.swing.JTextField();
        txtSegundoApellido = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnGuardarClientes = new javax.swing.JButton();
        lblFondoRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloRegistro.setFont(new java.awt.Font("Dialog", 3, 30)); // NOI18N
        lblTituloRegistro.setForeground(new java.awt.Color(0, 0, 0));
        lblTituloRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloRegistro.setText("Registro del Cliente");
        getContentPane().add(lblTituloRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 310, 40));

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        lblPrimerApellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPrimerApellido.setForeground(new java.awt.Color(0, 0, 0));
        lblPrimerApellido.setText("Primer Apellido:");
        getContentPane().add(lblPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 20));

        lblSegundoApellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblSegundoApellido.setForeground(new java.awt.Color(0, 0, 0));
        lblSegundoApellido.setText("Segundo Apellido:");
        getContentPane().add(lblSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        lblCedula.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(0, 0, 0));
        lblCedula.setText("Cédula:");
        getContentPane().add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        lblNacionalidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNacionalidad.setForeground(new java.awt.Color(0, 0, 0));
        lblNacionalidad.setText("Nacionalidad:");
        getContentPane().add(lblNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        lblTelefono.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefono.setText("Teléfono:");
        getContentPane().add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        lblCorreo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(0, 0, 0));
        lblCorreo.setText("Correo Electrónico:");
        getContentPane().add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        lblDireccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(0, 0, 0));
        lblDireccion.setText("Dirección:");
        getContentPane().add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 210, -1));

        txtPrimerApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimerApellidoActionPerformed(evt);
            }
        });
        txtPrimerApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrimerApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 210, -1));

        txtSegundoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSegundoApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 210, -1));

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 210, -1));

        txtNacionalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNacionalidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 210, -1));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 210, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 210, -1));

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 210, -1));

        btnGuardarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnGuardarClientes.setText("Guardar Datos");
        btnGuardarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 160, 50));

        lblFondoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo Ventanas Varias.jpg"))); // NOI18N
        getContentPane().add(lblFondoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClientesActionPerformed
        // TODO add your handling code here:
        //Guardar Nombre
        iClientes.setNombre(txtNombre.getText());
        //Guardar Primer Apellido
        iClientes.setPrimerApellido(txtPrimerApellido.getText());
        //Guardar Segundo Apellido
        iClientes.setSegundoApellido(txtSegundoApellido.getText());
        //Guardar Cédula
        iClientes.setCedula(txtCedula.getText());
        //Guardar Nacionalidad
        iClientes.setNacionalidad(txtNacionalidad.getText());
        //Guardar Teléfono
        iClientes.setTelefono(txtTelefono.getText());
        //Guardar Correo Electrónico
        iClientes.setCorreo(txtCorreo.getText());
        //Guardar Dirección
        iClientes.setDireccion(txtDireccion.getText());
        
        //Escribir en el archivo txt
        iArchivoClientes.EscribirArchivoClientes(iClientes);
        
        //Mostrar el mensaje de guardado
        JOptionPane.showMessageDialog(null, "¡Los datos del cliente se han registraron con exito!", null, JOptionPane.INFORMATION_MESSAGE);
        
        //Poner los textFields en blanco
        txtNombre.setText("");
        txtPrimerApellido.setText("");
        txtSegundoApellido.setText("");
        txtCedula.setText("");
        txtNacionalidad.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtDireccion.setText("");
     
    }//GEN-LAST:event_btnGuardarClientesActionPerformed
    //Validaciones
    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor escriba solo letras en este campo", "AVISO",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtPrimerApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimerApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimerApellidoActionPerformed

    private void txtPrimerApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrimerApellidoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor escriba solo letras en este campo", "AVISO",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtPrimerApellidoKeyTyped

    private void txtSegundoApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundoApellidoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor escriba solo letras en este campo", "AVISO",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtSegundoApellidoKeyTyped

    private void txtNacionalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNacionalidadKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor escriba solo letras en este campo", "AVISO",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtNacionalidadKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor escriba solo letras en este campo", "AVISO",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor escriba solo numeros en este campo", "AVISO",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor escriba solo numeros en este campo", "AVISO",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

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
            java.util.logging.Logger.getLogger(ventanaRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ventanaRegistroClientes dialog = new ventanaRegistroClientes(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnGuardarClientes;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFondoRegistro;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrimerApellido;
    private javax.swing.JLabel lblSegundoApellido;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTituloRegistro;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}