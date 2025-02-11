import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import java.awt.Color;

public class PanelAccion  extends JPanel{
    public PanelAccion(){
        AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/graficos/bola_amarilla.png"), Color.YELLOW);
        AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/graficos/bola_azul.png"), Color.BLUE);
        AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/graficos/bola_roja.png"), Color.RED);
        
        
        JButton botonAmarillo = new JButton(accionAmarillo);
        JButton botonAzul = new JButton(accionAzul);
        JButton botonRojo = new JButton(accionRojo);
        add(botonAmarillo);
        add(botonAzul);
        add(botonRojo);

        //teclas amarillo

        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "Fondo_amarillo");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "Fondo_azul");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "Fondo_rojo");

        ActionMap mapaAccion = getActionMap();
        mapaAccion.put("Fondo_amarillo", accionAmarillo);
        mapaAccion.put("Fondo_rojo", accionRojo);
        mapaAccion.put("Fondo_azul", accionAzul);

     


    }

   private class AccionColor extends AbstractAction{
    public AccionColor(String nombre, Icon icono, Color color_boton){

        putValue(Action.NAME, nombre);
        putValue(Action.SMALL_ICON, icono);
        putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + nombre);
        putValue("color_de_fondo", color_boton);
    }



    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        Color c = (Color) getValue("color_de_fondo");
        setBackground(c);
        System.out.println("Nombre: " + getValue(Action.NAME) + " Descripción: " + getValue(Action.SHORT_DESCRIPTION));
    }

   
}

    

}
