import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaCheck {
    public static void main(String[] args) {
        MarcoCheck marco1 = new MarcoCheck();
        marco1.setVisible(true);
    }


}

class MarcoCheck extends JFrame{
    public MarcoCheck(){
        //crea un marco
        setTitle("Prueba con JCheckBox");
        setBounds(400, 300, 600, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new LaminaCheck());
    }

}
class LaminaCheck extends JPanel  {
    //crea una Lamina
    public LaminaCheck() {
        setLayout(new BorderLayout());
        Font miLetra = new Font("Sherif",Font.PLAIN,24);
        texto = new JLabel("En un lugar de la mancha cuyo nombre...");
        texto.setFont(miLetra);
        JPanel laminaTexto = new JPanel();
        laminaTexto.add(texto);
        add(laminaTexto,BorderLayout.CENTER);
        check1 = new JCheckBox("Negrita");
        check2 = new JCheckBox("Cursiva");

        check1.addActionListener(new ManejaChecks());
        check2.addActionListener(new ManejaChecks());
        
        JPanel laminaChecks =new JPanel();
        laminaChecks.add(check1);
        laminaChecks.add(check2);

        add(laminaChecks, BorderLayout.SOUTH);




    }

    private class ManejaChecks implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int tipo = 0;
            if (check1.isSelected()) tipo += Font.BOLD; 
            if (check2.isSelected()) tipo += Font.ITALIC; 
            texto.setFont(new Font("Sherif",tipo,24));




        }

    
        
    }
    private JLabel texto;
    private JCheckBox check1, check2;

     

    

    

    
}