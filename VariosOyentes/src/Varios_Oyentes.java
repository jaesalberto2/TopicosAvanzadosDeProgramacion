import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Varios_Oyentes {

    public static void main(String[] args) {

        Marco_Principal miMarco = new Marco_Principal();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
        
    }

    static class Marco_Principal extends JFrame{
        public Marco_Principal(){
            setTitle("Prueba Varios");
            //centrar marco
            setBounds(100, 100, 500, 300);
            setLocationRelativeTo(null);
            Lamina_Principal lamina = new Lamina_Principal();
            add(lamina);
            


        }

    }

     static class Lamina_Principal extends JPanel {
        public Lamina_Principal(){
            JButton boton_nuevo = new JButton("Nuevo");
            add(boton_nuevo);

            boton_cerrar = new JButton("Cerrar Todo");
            add(boton_cerrar);
            OyenteNuevo miOyente = new OyenteNuevo();
            boton_nuevo.addActionListener(miOyente);

        }
        JButton boton_cerrar;

        private class OyenteNuevo implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                Marco_Emergente marco = new Marco_Emergente(boton_cerrar);
                marco.setVisible(true);
            }


        }

    
        
    }
    static class Marco_Emergente extends JFrame{
        private static int contador=0;

        public Marco_Emergente(JButton boton_de_principal){
            contador ++;
            setTitle("Ventana"+contador);
            setBounds(40*contador,40*contador,300,150);
            cierraTodos oyentecerrar = new cierraTodos();
            boton_de_principal.addActionListener(oyentecerrar);

        }

        private class cierraTodos implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                dispose();
            }

        
            
        }
    }

    

}
