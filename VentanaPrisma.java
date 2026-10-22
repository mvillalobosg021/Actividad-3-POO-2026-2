package Figuras;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrisma extends JFrame implements ActionListener {

    private Container contenedor;
 
    private JLabel largo, ancho, altura, volumen, superficie;

    private JLabel imagen;

    private JTextField campoLargo, campoAncho, campoAltura;
  
    private JButton calcular;
  
    public VentanaPrisma() {
        inicio();
        setTitle("Prisma"); 
        setSize(440,240); 
        setLocationRelativeTo(null); 
        setResizable(false); 
    }
    
    private void inicio() {
        contenedor = getContentPane(); 
        contenedor.setLayout(null); 
        
        largo = new JLabel();
        largo.setText("Largo (cms):");
        largo.setBounds(20, 20, 135, 23);
        campoLargo = new JTextField();
        campoLargo.setBounds(120, 20, 135, 23);
        
        ancho = new JLabel();
        ancho.setText("Ancho (cms):");
        ancho.setBounds(20, 50, 135, 23);
        campoAncho = new JTextField();
        campoAncho.setBounds(120, 50, 135, 23);
       
        altura = new JLabel();
        altura.setText("Altura (cms):");
        altura.setBounds(20, 80, 135, 23);
        campoAltura = new JTextField();
        campoAltura.setBounds(120, 80, 135, 23);
      
        calcular = new JButton();
        calcular.setText("Calcular");
        calcular.setBounds(120, 110, 135, 23); 
        calcular.addActionListener(this);
   
        volumen = new JLabel();
        volumen.setText("Volumen (cm3):");
        volumen.setBounds(20, 140, 200, 23);
  
        superficie = new JLabel();
        superficie.setText("Superficie (cm2):");
        superficie.setBounds(20, 170, 200, 23);

        imagen = new JLabel(new ImageIcon(getClass().getResource("prisma.png")));
        imagen.setBounds(280, 30, 130, 130); 
        contenedor.add(largo);
        contenedor.add(campoLargo);
        contenedor.add(ancho);
        contenedor.add(campoAncho);
        contenedor.add(altura);
        contenedor.add(campoAltura);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
        contenedor.add(imagen);
    }
 
    public void actionPerformed(ActionEvent event) {
        Prisma prisma;
        boolean error = false;
        double largo = 0;
        double ancho = 0;
        double altura = 0;
        try {

            largo = Double.parseDouble(campoLargo.getText());
        
            ancho = Double.parseDouble(campoAncho.getText());
           
            altura = Double.parseDouble(campoAltura.getText());
            
            prisma = new Prisma(largo, ancho, altura);
       
            volumen.setText("Volumen (cm3): " + String.format("%.2f",
                prisma.calcularVolumen()));
           
            superficie.setText("Superficie (cm2): " + String.format("%.2f",
                prisma.calcularSuperficie()));
        } catch (Exception e) {
            error = true; 
        } finally {
            if (error) { 
                JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de número",
                    "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
