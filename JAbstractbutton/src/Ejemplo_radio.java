import java.awt.BorderLayout;

import javax.swing.*;

public class Ejemplo_radio {

    public static void main(String[] args) {
        MarcoRadio m1 = new MarcoRadio();
        
    }

}
class MarcoRadio extends JFrame{
    public MarcoRadio(){
        //creamos un marco
        setTitle("Radio Button Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        LaminaRadio L1=new LaminaRadio();
        add(L1);
        setVisible(true);

    }

    
}
class LaminaRadio extends JPanel{
    public LaminaRadio(){
        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la mancha...");
        add(texto,BorderLayout.CENTER);
        ButtonGroup miGrupo = new ButtonGroup();

        JRadioButton b1 = new JRadioButton("Pequeño",false);
        JRadioButton b2 = new JRadioButton("Mediano",true);
        JRadioButton b3 = new JRadioButton("Grande",false);

        JRadioButton b4 = new JRadioButton("Muy Grande",false);


        miGrupo.add(b1);
        miGrupo.add(b2);
        miGrupo.add(b3);
        miGrupo.add(b4);


        JPanel lamina_Radio = new JPanel();
        lamina_Radio.add(b1);
        lamina_Radio.add(b2);
        lamina_Radio.add(b3);
        lamina_Radio.add(b4);
        add(lamina_Radio,BorderLayout.SOUTH);



    }
    private JLabel texto;
    private JRadioButton b1,b2,b3;
}
