import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Sintaxis_radio {
    public static void main(String[] args) {
        Marco m1 = new Marco();
        m1.setVisible(true);
        
        
    }

}
class Marco extends JFrame{
    public Marco(){
        //creamos un marco
        setTitle("Radio Button Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Lamina L1=new Lamina();
        add(L1);
        setVisible(true);

    }

    
}
class Lamina extends JPanel{
    public Lamina(){
        ButtonGroup miGrupo = new ButtonGroup();
        ButtonGroup miGrupo2 = new ButtonGroup();

        JRadioButton b1 = new JRadioButton("Azul",false);
        JRadioButton b2 = new JRadioButton("Rojo",true);
        JRadioButton b3 = new JRadioButton("verde",false);

        JRadioButton b4 = new JRadioButton("Masculino",false);
        JRadioButton b5 = new JRadioButton("Femenino",true);


        miGrupo.add(b1);
        miGrupo.add(b2);
        miGrupo.add(b3);

        miGrupo2.add(b4);
        miGrupo2.add(b5);

        add(b1);
        add(b2);
        add(b3);

        add(b4);
        add(b5);



    }
     
}
