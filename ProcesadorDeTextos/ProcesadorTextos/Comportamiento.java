import java.awt.Font;

public class Comportamiento {

    ProcesadorTextos ventana = new ProcesadorTextos();
    
    public Comportamiento() {
        ventana.getFuente().addActionListener(e -> cambiarFuente());
        ventana.getEstilo().addActionListener(e -> cambiarEstilo());
        ventana.getTamano().addActionListener(e -> cambiarTamaño());
    }

    private void cambiarFuente() {
        // Lógica para cambiar la fuente
        ventana.getElement4().setFont(new Font("Arial", Font.PLAIN, ventana.getElement4().getFont().getSize()));
    }

    private void cambiarEstilo() {
        // Lógica para cambiar el estilo
    }

    private void cambiarTamaño() {
        // Lógica para cambiar el tamaño
    }
    
    


}
