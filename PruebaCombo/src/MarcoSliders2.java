import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class MarcoSliders2 {

    public static void main(String[] args) {
        Marco_2 m1 = new Marco_2();
        m1.setVisible(true);
        
    }

}
class Marco_2 extends JFrame{
    public Marco_2(){
        //creamos un marco
        setTitle("Radio Button Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Lamina_2 L1=new Lamina_2();
        add(L1);
        setVisible(true);

    }

    
}
class Lamina_2 extends JPanel{
    public Lamina_2(){
        setLayout(new BorderLayout());
        rotulo = new JLabel("En un lugar de la mancha de cuyo nombre...");
        add(rotulo,BorderLayout.CENTER);
        control = new JSlider(8,50,12);
        control.setMajorTickSpacing(14);
        control.setMinorTickSpacing(2);
        control.setPaintTicks(true);
        control.setPaintLabels(true);
        control.setFont(new Font("Serif",Font.ITALIC,10));
        control.addChangeListener(new EventoSlider());
        JPanel laminaSlider = new JPanel();
        laminaSlider.add(control,BorderLayout.NORTH);
        add(laminaSlider,BorderLayout.NORTH);


    }

    private class EventoSlider implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {
            // Update the font size based on the slider value
            int value = control.getValue();
            rotulo.setFont(new Font("Serif", Font.ITALIC, value));
        }

    }
    private JLabel rotulo;
    private JSlider control;
}
