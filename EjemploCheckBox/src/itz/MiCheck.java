package itz;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.FlowLayout;

import javax.swing.event.ChangeListener;

public class MiCheck extends JFrame implements ChangeListener {
    // componentes
    JPanel contenedor;
    JCheckBox check1, check2, check3;
    JTextArea txtMensaje;
    // constructor
    public MiCheck() {
        initComponents();
        // configurar JFrame
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


        
    }
    //Inicializar componentes
    public void initComponents() {
        contenedor = new JPanel();
        contenedor.setLayout(new FlowLayout());
        check1 = new JCheckBox("Ingles");
        check1.addChangeListener(this);
        check2 = new JCheckBox("Frances");
        check2.addChangeListener(this);
        check3 = new JCheckBox("Aleman");
        check3.addChangeListener(this);
        txtMensaje = new JTextArea();
        // agregar componentes al contenedor
        contenedor.add(check1);
        contenedor.add(check2);
        contenedor.add(check3);
        contenedor.add(txtMensaje);
        // agregar contenedor al JFrame
        this.add(contenedor);
        
    }
    @Override
    public void stateChanged(ChangeEvent evento) {
        // TODO Auto-generated method stub
        String idiomas = "Idiomas que domina: ";
        if (check1.isSelected()) {
            idiomas += check1.getText() + " ";
        }
        if (check2.isSelected()) {
            idiomas += check2.getText() + " ";
        }
        if (check3.isSelected()) {
            idiomas += check3.getText() + " ";
        }
        
        txtMensaje.setText(idiomas);
    }
   
    


}
