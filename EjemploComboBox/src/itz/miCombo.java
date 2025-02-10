package itz;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class miCombo extends JFrame  implements ItemListener{
  
    private JComboBox combo1;
    private JLabel label1;
    public miCombo(){

        //añado el combobox con sus items y su ItemListener asi como el label

        combo1 = new JComboBox<String>();
        combo1.setBounds(10,10,80,20);
        add(combo1);

        label1 = new JLabel("Ninguno");
        combo1.addItem("Rojo");
        combo1.addItem("Verde");
        combo1.addItem("Azul");
        combo1.addItem("Personal");

        combo1.addItemListener(this);

        label1 = new JLabel("Color seleccionado: Ninguno");
        label1.setBounds(10,80,800,500);
        label1.setFont(new Font("Arial", Font.BOLD, 20));
        add(label1);
         initPantalla();
         
                 
             }
             private void initPantalla() {
                 // TODO Auto-generated method stub
                 setLayout(null);
                    setSize(1000,500);
                    setResizable(false);
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    setVisible(true);
             }

    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        String texto = "Color seleccionado: ";
        if(e.getSource() == combo1){
            String seleccionado = (String) combo1.getSelectedItem();
            texto += seleccionado;

            label1.setFont(new Font("Courier", Font.ITALIC, 50));
            switch (seleccionado) {
                case "ninguno": label1.setForeground(Color.BLACK);
                    
                    break;
                case "Rojo": label1.setForeground(Color.RED);
                    
                    break;
                case "Verde": label1.setForeground(Color.GREEN);
                    
                    break;
                case "Azul": label1.setForeground(Color.BLUE);
                    
                    break;
                case "Personal": label1.setForeground(new Color(100, 50, 120));
                    
                    break;
            
                default:
                    break;
            }
            label1.setText(texto);

    }


       
}
    public static void main(String[] args) {
        new miCombo();
    }
}




