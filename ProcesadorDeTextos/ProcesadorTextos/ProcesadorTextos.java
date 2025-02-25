import javax.swing.*;
import java.awt.Color;
import helper_classes.*;

public class ProcesadorTextos {
  public ProcesadorTextos() {

     JFrame frame = new JFrame("Procesador de textos");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(470, 254);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#1e1e1e"));

     JButton fuente = new JButton("Fuente");
     fuente.setBounds(23, 10, 106, 28);
     fuente.setBackground(Color.decode("#2e2e2e"));
     fuente.setForeground(Color.decode("#D9D9D9"));
     fuente.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     fuente.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     fuente.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(fuente, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(fuente);

     JButton estilo = new JButton("Estilo");
     estilo.setBounds(185, 10, 106, 28);
     estilo.setBackground(Color.decode("#2e2e2e"));
     estilo.setForeground(Color.decode("#D9D9D9"));
     estilo.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     estilo.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     estilo.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(estilo, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(estilo);

     JButton tamano = new JButton("Tamaño");
     tamano.setBounds(345, 10, 106, 28);
     tamano.setBackground(Color.decode("#2e2e2e"));
     tamano.setForeground(Color.decode("#D9D9D9"));
     tamano.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     tamano.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     tamano.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(tamano, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(tamano);

     JTextArea element4 = new JTextArea("");
     element4.setBounds(23, 49, 427, 158);
     element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element4.setBackground(Color.decode("#B2B2B2"));
     element4.setForeground(Color.decode("#656565"));
     element4.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
     OnFocusEventHelper.setOnFocusText(element4, "Your long Input!", Color.decode("#353535"),   Color.decode("#656565"));
     panel.add(element4);

     frame.add(panel);
     frame.setVisible(true);

    

  }

  private JFrame frame;
  private JPanel panel;
  private JButton fuente;
  private JButton estilo;
  private JButton tamano;
  private JTextArea element4;

  public JFrame getFrame() {
    return frame;
  }

  public void setFrame(JFrame frame) {
    this.frame = frame;
  }

  public JPanel getPanel() {
    return panel;
  }

  public void setPanel(JPanel panel) {
    this.panel = panel;
  }

  public JButton getFuente() {
    return fuente;
  }

  public void setFuente(JButton fuente) {
    this.fuente = fuente;
  }

  public JButton getEstilo() {
    return estilo;
  }

  public void setEstilo(JButton estilo) {
    this.estilo = estilo;
  }

  public JButton getTamano() {
    return tamano;
  }

  public void setTamano(JButton tamano) {
    this.tamano = tamano;
  }

  public JTextArea getElement4() {
    return element4;
  }

  public void setElement4(JTextArea element4) {
    this.element4 = element4;
  }

  public Object getBotonAbrir() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getBotonAbrir'");
  }

public Object getBotonGuardar() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getBotonGuardar'");
}

public Object getBotonSalir() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getBotonSalir'");
}
  

}