import javax.swing.*;
import java.awt.FlowLayout;

public class Layouts {

    public static void main(String[] args) {
        Marco_Layouts nuevoMarco= new Marco_Layouts();
        nuevoMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nuevoMarco.setVisible(true);
        
    }

    static class Marco_Layouts extends JFrame {
        public Marco_Layouts(){

            setTitle("Prueba Acciones");
            setBounds(600,350,600,300);

            Panel_Layout lamina = new Panel_Layout();
            FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT);
            setLayout(disposicion);

            add(lamina);

            //curso 82
            

            

        }

        }

        static class Panel_Layout extends JPanel{
            public Panel_Layout() {

                add(new JButton("Amarillo"));
                
                add(new JButton("Rojo"));
                add(new JButton("Azul"));

            }
        }
    

}
