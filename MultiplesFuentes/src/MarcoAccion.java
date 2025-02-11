import javax.swing.JFrame;

public class MarcoAccion extends JFrame{
    public MarcoAccion(){

        setTitle("Prueba de Acciones");
        setBounds(600, 350, 1200, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //poner en el centro
        setLocationRelativeTo(null);
        PanelAccion lamina = new PanelAccion();
        add(lamina);}


}
