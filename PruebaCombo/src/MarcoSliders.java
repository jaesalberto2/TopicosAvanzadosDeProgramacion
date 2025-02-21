import javax.swing.*;

import java.awt.Font;

public class MarcoSliders {
    public static void main(String[] args) {
        Marco_Sliders m1 = new Marco_Sliders();
        m1.setVisible(true);
        
    }

}
class Marco_Sliders extends JFrame{
    public Marco_Sliders(){
        //creamos un marco
        setTitle("Radio Button Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Lamina_Sliders L1=new Lamina_Sliders();
        add(L1);
        setVisible(true);

    }

    
}
class Lamina_Sliders extends JPanel{
    public Lamina_Sliders(){
        JSlider control = new JSlider(0,100,25);
        control.setMajorTickSpacing(25);
        control.setMinorTickSpacing(5);
        
        control.setPaintTicks(true);
        control.setFont(new Font("Serif", Font.ITALIC,12));
        control.setPaintLabels(true);
        control.setSnapToTicks(true);
        add(control);


    }
}
