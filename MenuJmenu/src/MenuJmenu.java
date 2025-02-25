import javax.swing.*;

public class MenuJmenu {
    public static void main(String[] args) {
        Marco m1 = new Marco();
        
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
        JMenuBar barra = new JMenuBar();
        barra.setVisible(true);

        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edicion");
        JMenu herramientas = new JMenu("Herramientas");

        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardarcomo = new JMenuItem("Guardar como");

        JMenuItem cortar = new JMenuItem("Cortar");
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem pegar = new JMenuItem("Pegar");

        JMenuItem generales = new JMenuItem("Generales");

        JMenu opciones = new JMenu("Opciones");

        JMenuItem opcion1 = new JMenuItem("Opcion1");
        JMenuItem opcion2 = new JMenuItem("Opcion2");

        opciones.add(opcion1);
        opciones.add(opcion2);

        archivo.add(guardar);
        archivo.add(guardarcomo);

        edicion.add(cortar);
        edicion.add(copiar);
        edicion.add(pegar);
        edicion.addSeparator();
        edicion.add(opciones);

        herramientas.add(generales);


    
        barra.add(archivo);
        barra.add(edicion);
        barra.add(herramientas);

        

        
        
        add(barra);

    }
}
