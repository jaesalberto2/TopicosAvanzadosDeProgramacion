package itz;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventanita extends JFrame implements ActionListener {

    private JLabel labelTitulo;
    private JPanel miPanelPrincipal;
    private JPanel panelColor;
    private JButton botonColor;
    private Color color;

  public Ventanita() {
    iniciaComponentes();
        //asigna titulo a la barra de la ventana
        setTitle("Ventana de Prueba");
        //tamaño de la ventana
        setSize(400, 400);
        //pone ventana en el centro de la pantalla
        setLocationRelativeTo(null);
        //permite cerrar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //hace visible la ventana
        setVisible(true);
      }
    
      private void iniciaComponentes() {
        // TODO Auto-generated method stub
        miPanelPrincipal = new JPanel();
        this.getContentPane().add(miPanelPrincipal);
        miPanelPrincipal.setLayout(null); //por posición
        //propiedades del
        labelTitulo = new JLabel();
        labelTitulo.setText("Componentes JColorChooser");
        labelTitulo.setFont(new Font("-tahoma", Font.BOLD, 20));
        labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        labelTitulo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        labelTitulo.setBounds(40, 20, 300, 30);
        //propiedades del panel
        componentesPanel();
                botonColor = new JButton();
                botonColor.setText("Color");
                botonColor.setBounds(150, 100, 100, 30);
                botonColor.addActionListener(this);
                //agrega componentes al panel
                miPanelPrincipal.add(labelTitulo);
                miPanelPrincipal.add(botonColor);
                miPanelPrincipal.add(panelColor);
        
            }
            
            private void componentesPanel() {
                // TODO Auto-generated method stub
                panelColor = new JPanel();
                panelColor.setBounds(100, 150, 200, 100);
                panelColor.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panelColor.setBackground(Color.WHITE);

            }
        
            public static void main(String[] args) {
    new Ventanita();
  }

@Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    if (e.getSource() == botonColor) {
        color = JColorChooser.showDialog(null, "Seleccione un Color", Color.BLACK);
        panelColor.setBackground(color);
    }
}


}
