import javax.swing.*;
import java.awt.*;


public class MarcoSpiner {
    public static void main(String[] args) {
        Marco_frame m1 = new Marco_frame();
        m1.setVisible(true);
        
    }

}
class Marco_frame extends JFrame{
    public Marco_frame(){
        //creamos un marco
        setTitle("Radio Button Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Lamina_spinner L1=new Lamina_spinner();
        add(L1);
        setVisible(true);

    }

    
}
class Lamina_spinner extends JPanel{
    public Lamina_spinner(){
        //JTextArea texto = new JTextArea("En un lugar de la mancha de cuyo nombre no quiero acordarme...");

        //String lista[]= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        JSpinner control = new JSpinner(new SpinnerNumberModel(5,0,10,1){
                public Object getNextValue(){
            return super.getPreviousValue();


        }
        public Object getPreviousValue() {
            return super.getNextValue();
        }
    
        });
        Dimension d = new Dimension(200,20);

        control.setPreferredSize(d);

        
        add(control);

    }
    // private class MiModeloJspinner extends SpinnerNumberModel{
    //     public MiModeloJspinner(){
    //         super(5,0,10,1);


    //     }
    //     public Object getNextValue(){
    //         return super.getPreviousValue();


    //     }
    //     public Object getPreviousValue() {
    //         return super.getNextValue();
    //     }
    // }
}

