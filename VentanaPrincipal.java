package Figuras;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 
public class VentanaPrincipal extends JFrame implements ActionListener {

    private Container contenedor;
        private JButton cilindro, esfera, pirámide;

    private JButton cubo, prisma;

    public VentanaPrincipal(){
        inicio();
        setTitle("Figuras"); 
        setSize(350,180); 
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicio() {
        contenedor = getContentPane(); 
        contenedor.setLayout(null); 
        cilindro = new JButton();
        cilindro.setText("Cilindro");
        cilindro.setBounds(20, 40, 90, 23); 
        cilindro.addActionListener(this);
         esfera = new JButton();
        esfera.setText("Esfera");
        esfera.setBounds(125, 40, 90, 23); 
        esfera.addActionListener(this);
        pirámide = new JButton();
        pirámide.setText("Pirámide");
        pirámide.setBounds(230, 40, 95, 23); 
        pirámide.addActionListener(this);
        cubo = new JButton();
        cubo.setText("Cubo");
        cubo.setBounds(70, 80, 90, 23); 
        cubo.addActionListener(this);
        prisma = new JButton();
        prisma.setText("Prisma");
        prisma.setBounds(180, 80, 90, 23); 
        prisma.addActionListener(this);
 
        contenedor.add(cilindro);
        contenedor.add(esfera);
        contenedor.add(pirámide);
        contenedor.add(cubo);
        contenedor.add(prisma);
    }

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == esfera) { 
            VentanaEsfera esfera = new VentanaEsfera(); 
            esfera.setVisible(true); 
        }
        if (evento.getSource() == cilindro) {
            VentanaCilindro cilindro = new VentanaCilindro(); 
            cilindro.setVisible(true);
        }
        if (evento.getSource() == pirámide) { 
            VentanaPirámide pirámide = new VentanaPirámide(); 
            pirámide.setVisible(true); 
        }
        if (evento.getSource() == cubo) { 
            VentanaCubo cubo = new VentanaCubo(); 
            cubo.setVisible(true); 
        }
        if (evento.getSource() == prisma) { 
            VentanaPrisma prisma = new VentanaPrisma(); 
            prisma.setVisible(true); 
        }
    }
}
