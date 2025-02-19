import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejemplo_radio {

    public static void main(String[] args) {
        MarcoRadio m1 = new MarcoRadio();
        m1.setVisible(true);
        
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
        texto = new JLabel("En un lugar de la mancha de cuyo nombre...");
        add(texto,BorderLayout.CENTER);
        ButtonGroup miGrupo = new ButtonGroup();

         b1 = new JRadioButton("Pequeño",false);
         b2 = new JRadioButton("Mediano",true);
         b3 = new JRadioButton("Grande",false);

         b4 = new JRadioButton("Muy Grande",false);
        JPanel lamina_Radio = new JPanel();

        evento_radio mievento = new evento_radio();
        b1.addActionListener(mievento);
        b2.addActionListener(mievento);
        b3.addActionListener(mievento);
        b4.addActionListener(mievento);

        miGrupo.add(b1);
        miGrupo.add(b2);
        miGrupo.add(b3);
        miGrupo.add(b4);


        lamina_Radio.add(b1);
        lamina_Radio.add(b2);
        lamina_Radio.add(b3);
        lamina_Radio.add(b4);
        add(lamina_Radio,BorderLayout.SOUTH);



    }

    private class evento_radio implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==b1){

                texto.setFont(new Font("Serif",Font.PLAIN,10));
            }else if (e.getSource()==b2) {
                texto.setFont(new Font("Serif",Font.PLAIN,12));

                
            }else if (e.getSource()==b3) {
                texto.setFont(new Font("Serif",Font.PLAIN,14));

                
            }
            else if (e.getSource()==b4) {
                texto.setFont(new Font("Serif",Font.PLAIN,24));

                
            }

        }

    }
    private JLabel texto;
    private JRadioButton b1,b2,b3,b4;
}
