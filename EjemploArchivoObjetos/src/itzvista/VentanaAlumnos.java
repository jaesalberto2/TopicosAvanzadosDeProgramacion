package itzvista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

import itzmodelo.Alumno;

public class VentanaAlumnos extends JFrame implements ActionListener{


    private JPanel principal;
    private JLabel lblnoctrl, lblnombre, lblcarrera, lblsemestre;
    private JTextField txNoCtrl, txNombre, txApellidos, txCarrera;
    private JButton btnAgregar, btnEliminar,btnModificar;
    private JTable tablaAlumnos;
    private ArrayList<Alumno> lstAlumnos = new ArrayList<Alumno>();
    private JMenuBar barra;
    private JMenu mntArchivo;
    private JMenuItem miGuardar,miAbrir;
    public static void main(String[] args) {
        VentanaAlumnos frame = new VentanaAlumnos();
        frame.setVisible(true);
    }

    public VentanaAlumnos() {
        principal = new JPanel();
        lblnoctrl = new JLabel("No. Control:");
        lblnombre = new JLabel("Nombre:");
        lblcarrera = new JLabel("Carrera:");
        lblsemestre = new JLabel("Semestre:");
        
        txNoCtrl = new JTextField(15);
        txNombre = new JTextField(15);
        txApellidos = new JTextField(15);
        txCarrera = new JTextField(15);
        
        btnAgregar = new JButton("Agregar");
        btnEliminar = new JButton("Eliminar");
        btnModificar = new JButton("Modificar");
        
        principal.add(lblnoctrl);
        principal.add(txNoCtrl);
        principal.add(lblnombre);
        principal.add(txNombre);
        principal.add(lblsemestre);
        principal.add(txApellidos);
        principal.add(lblcarrera);
        principal.add(txCarrera);
        principal.add(btnAgregar);
        principal.add(btnEliminar);
        principal.add(btnModificar);
        
        btnAgregar.addActionListener(this);
        btnEliminar.addActionListener(this);
        
        this.add(principal);
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }


}
