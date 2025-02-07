import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.*;

public class eventosDeFoco {
    public static void main(String[] args) {
        MarcoFoco marco = new MarcoFoco();

    }



}

//marco
class MarcoFoco extends JFrame {
    public MarcoFoco() {
        setVisible(true);
        setBounds(300, 300, 600, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new LaminaFoco());
    }

    
}
class LaminaFoco extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setLayout(null);

        cuadro1 = new JTextField();
        cuadro2 = new JTextField();
        cuadro1.setBounds(120, 10, 150, 20);
        cuadro2.setBounds(120, 50, 150, 20);
        add(cuadro1);
        add(cuadro2);

        //crear instancia de la clase que maneja los eventos de foco
        LanzaFocos elFoco = new LanzaFocos();
        cuadro1.addFocusListener(elFoco);


        
    }
    private class LanzaFocos extends FocusAdapter {
        public void focusGained(FocusEvent e) {

        }
        public void focusLost(FocusEvent e) {
            String email = cuadro1.getText();
            boolean comprobacion = false;
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    comprobacion = true;
                }
            }
            if (comprobacion) {
                System.out.println("Email correcto");
            } else {
                System.out.println("Email incorrecto");
            }
        }
    }
    JTextField cuadro1;
    JTextField cuadro2;

    
}

