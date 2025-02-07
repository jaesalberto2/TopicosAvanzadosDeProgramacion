import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class EventosTeclado {
    public static void main(String[] args) {
        MarcoConTeclas marco = new MarcoConTeclas();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
class MarcoConTeclas extends JFrame{
    public MarcoConTeclas(){
        setVisible(true);
        setTitle("Eventos de teclado");
        setBounds(700,300,600,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        EventosDeTeclado teclado = new EventosDeTeclado();
        addKeyListener(teclado);
        EventosRaton raton = new EventosRaton();
        addMouseListener(raton);

        EventosRaton2 raton2 = new EventosRaton2();
        addMouseMotionListener(raton2);


    }
}
class EventosDeTeclado implements KeyListener{
    public void keyTyped(KeyEvent e){
        char letra = e.getKeyChar();        
        System.out.println(letra);
    }
    public void keyPressed(KeyEvent e){
        int codigo = e.getKeyCode();
        System.out.println(codigo);
    }
    public void keyReleased(KeyEvent e){
        //System.out.println("Tecla liberada");
        char letra = e.getKeyChar();
        System.out.println(letra);
    }
 
}
//  Eventos de ratón

class EventosRaton implements MouseListener{
    //tambien puedes extender a MouseAdapter

    public void mouseClicked(MouseEvent e){
        System.out.println("Has hecho click");
    }
    public void mousePressed(MouseEvent e){
        System.out.println("Acabas de presionar");
    }
    public void mouseReleased(MouseEvent e){
        System.out.println("Acabas de soltar");
    }
    public void mouseEntered(MouseEvent e){
        System.out.println("Acabas de entrar");
    }
    public void mouseExited(MouseEvent e){
        System.out.println("Acabas de salir");
    }
    public void mouseDragged(MouseEvent e){
        System.out.println("Acabas de arrastrar");
    }
    public void mouseMoved(MouseEvent e){
        System.out.println("Acabas de mover");
    }

    
}

class EventosRaton2 extends MouseAdapter{
   
    public void mouseDragged(MouseEvent e){
        System.out.println("Acabas de arrastrar");
    }
    public void mouseMoved(MouseEvent e){
        System.out.println("Acabas de mover");
    }

    public void mouseClicked(MouseEvent e){
        System.out.println("Has hecho click");
    }
}

 
