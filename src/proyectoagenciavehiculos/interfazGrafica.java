
package proyectoagenciavehiculos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author 3st3b
 */
public class interfazGrafica extends JFrame implements ActionListener {
    //Atributos globales
    //Paneles
    private JPanel panel = new JPanel();
    //Botones
    private JButton JbClientes = new JButton("Registro Clientes");
    private JButton JbVenta = new JButton("Vender Autos");
    private JButton JbCompra = new JButton("Comprar Autos");
    //Etiquetas
    private JLabel Titulo = new JLabel("Agencia Compra y Venta Trebys");
    JLabel etiquetaImagen = new JLabel();
    ImageIcon imagen = new ImageIcon("Autos.jpg");
    //Otros
    private JOptionPane JopAviso = new JOptionPane();

    //Constructor
    public interfazGrafica() {
        setTitle("Agencia Compra y Venta de Autos");//Poner un titulo a la ventana
        this.setSize(600, 600); //Establece el tamaño de la ventana
        setLayout(null);//Permite dividirlo por capas
        setLocationRelativeTo(null);// Inicia la ventana en el centro
        iniciarMetodos();//Llamado del metodo para que funcione
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarMetodos() {
        //Llamado de los metodos para su ejecucion
        metodoPaneles();
        metodoEtiquetas();
        metodoBotones();
    }

    //Metodo para crear y modificar los paneles
    private void metodoPaneles() {
        panel = new JPanel();
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    //Metodo para crear y modificar las etiquetas
    private void metodoEtiquetas() {
        //Etiqueta titulo
        Titulo.setBounds(55, 10, 500, 80);
        Titulo.setHorizontalAlignment(SwingConstants.CENTER);
        Titulo.setFont(new Font("cooper black", Font.PLAIN, 20));
        this.add(Titulo);
        
        //Etiqueta Imagen
        etiquetaImagen.setBounds(20, 90, 550, 290);
        etiquetaImagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), Image.SCALE_SMOOTH)));
        this.add(etiquetaImagen);
    }

    //Metodo para crear y modificar los botones
    private void metodoBotones() {

        JbClientes.setBounds(60, 450, 140, 25);//Posicion y tamano del boton
        JbCompra.setBounds(220, 450, 130, 25);
        JbVenta.setBounds(370, 450, 130, 25);
        add(JbClientes);//Agrega el boton a la ventana
        add(JbCompra);
        add(JbVenta);
        JbClientes.addActionListener(this);//agrega la reaccion al evento
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == JbClientes) {
            //Muestra el mensaje
            JopAviso.showMessageDialog(null, "Presiono el boton");

        }
    }
}
