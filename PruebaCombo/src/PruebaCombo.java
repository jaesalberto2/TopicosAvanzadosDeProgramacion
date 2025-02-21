import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaCombo {


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
        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la mancha cuyo nombre...");
        texto.setFont(new Font("Serif",Font.PLAIN,18));
        add(texto,BorderLayout.CENTER);
        JPanel laminaNorte = new JPanel();
        miCombo = new JComboBox<String>();
        miCombo.setEditable(true);
        
        miCombo.addItem("Serif");
        miCombo.addItem("SansSerif");
        miCombo.addItem("Monospaced");
        miCombo.addItem("Dialog");
        laminaNorte.add(miCombo);

        Evento_combo miEvento = new Evento_combo();
        miCombo.addActionListener(miEvento);
        add(laminaNorte,BorderLayout.NORTH);


    }
    private class Evento_combo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            texto.setFont(new Font((String)miCombo.getSelectedItem(),Font.PLAIN,18));

        }

    }
    private JLabel texto;
    private JComboBox<String> miCombo;
}
