package itz;

import javax.swing.*;
 import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AgendaAmigos extends JFrame implements ActionListener {


    private JPanel principal;
    private JTextField txtTel;
    private JTextField txtNombre;
    private JTextField txtDir;
    private ArrayList<Amigo> listaAmigos= new ArrayList<Amigo>();
    private  int posicion;//variable auxiliar en la lista
    private JButton btnAgregar,btnEliminar,btnModificar,btnPrimero,btnUltimo,btnAnterior,btnSiguiente,btnAceptar,btnCancelar;
    private JPanel panelNavega,panelAcepta;
    private JMenuItem mntmGuardar,mntmAbrir;
    private  JTable tabla;
    JScrollPane scrollPane;
    //Constructor
    public AgendaAmigos(){



        setTitle("Agenda de Amigos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,50,1000,700);
        //componentes del menu
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu mnArchivo= new JMenu("Archivo");
        menuBar.add(mnArchivo);
        mntmGuardar = new JMenuItem("Guardar");
        mnArchivo.add(mntmGuardar);
        mntmAbrir = new JMenuItem("Abrir");
        mnArchivo.add(mntmAbrir);

        principal = new JPanel();
        principal.setLayout(new FlowLayout());
        getContentPane().add(principal, BorderLayout.CENTER);

        JLabel lblNombre = new JLabel("Nombre:");
        principal.add(lblNombre     );

        txtNombre = new JTextField();
        principal.add(txtNombre);
        txtNombre.setColumns(10);

        JLabel lblTel = new JLabel("Teléfono:");
        principal.add(lblTel);

        txtTel = new JTextField();
        principal.add(txtTel);
        txtTel.setColumns(10);

        JLabel lblDir = new JLabel("Dirección:");
        principal.add(lblDir);

        txtDir = new JTextField();
        principal.add(txtDir);
        txtDir.setColumns(10);
        panelNavega = new JPanel();
        getContentPane().add(panelNavega, BorderLayout.SOUTH);
        scrollPane = new JScrollPane();
        panelNavega.add(scrollPane);

        btnPrimero = new JButton("Primero");
        panelNavega.add(btnPrimero);

        btnAnterior = new JButton("Anterior");
        panelNavega.add(btnAnterior);

        btnSiguiente = new JButton("Siguiente");
        panelNavega.add(btnSiguiente);

        btnUltimo = new JButton("Último");
        panelNavega.add(btnUltimo);

        panelAcepta = new JPanel();
        getContentPane().add(panelAcepta, BorderLayout.EAST);

        btnAgregar = new JButton("Agregar");
        
        panelAcepta.add(btnAgregar);

        btnEliminar = new JButton("Eliminar");
        panelAcepta.add(btnEliminar);

        btnModificar = new JButton("Modificar");
        panelAcepta.add(btnModificar);
        panelAcepta.setAlignmentX(BOTTOM_ALIGNMENT);
        btnAceptar = new JButton("Aceptar");
        panelAcepta.add(btnAceptar);

        btnCancelar = new JButton("Cancelar");
        panelAcepta.add(btnCancelar);
        // Add action listeners
        btnAgregar.addActionListener(this);
        btnEliminar.addActionListener(this);
        btnModificar.addActionListener(this);
        btnAceptar.addActionListener(this);
        btnCancelar.addActionListener(this);
        btnPrimero.addActionListener(this);
        btnAnterior.addActionListener(this);
        btnSiguiente.addActionListener(this);
        btnUltimo.addActionListener(this);
        mntmGuardar.addActionListener(this);
        mntmAbrir.addActionListener(this);
        // Disable buttons that should not be active initially
        btnAceptar.setEnabled(false);
        btnCancelar.setEnabled(false);

        String[] columnNames = {"Nombre", "Teléfono", "Dirección"};
        Object[][] data = new Object[listaAmigos.size()][3];
        for (int i = 0; i < listaAmigos.size(); i++) {
            Amigo amigo = listaAmigos.get(i);
            data[i][0] = amigo.getNombre();
            data[i][1] = amigo.getTelefono();
            data[i][2] = amigo.getDireccion();
        }
         tabla = new JTable(data, columnNames);
        panelNavega.add(tabla);
        principal.add(tabla);

    }


    public static void main(String[] args) {
        AgendaAmigos agenda = new AgendaAmigos();
        agenda.setVisible(true);
        
    }

    public void agregarAmigo(){
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == btnAgregar) {
            String nombre = txtNombre.getText();
            String telefono = txtTel.getText();
            String direccion = txtDir.getText();
            Amigo nuevoAmigo = new Amigo(Long.parseLong(telefono), nombre, direccion);
            listaAmigos.add(nuevoAmigo);
            txtNombre.setText("");
            txtTel.setText("");
            txtDir.setText("");
            String[] columnNames = {"Nombre", "Teléfono", "Dirección"};
            Object[][] data = new Object[listaAmigos.size()][3];
            for (int i = 0; i < listaAmigos.size(); i++) {
                Amigo amigo = listaAmigos.get(i);
                data[i][0] = amigo.getNombre();
                data[i][1] = amigo.getTelefono();
                data[i][2] = amigo.getDireccion();
            }
            tabla.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));
        
            System.out.println("agregado a tabla");

            scrollPane = new JScrollPane(tabla);
            panelNavega.add(scrollPane);
            panelNavega.revalidate();
            panelNavega.repaint();
           
            
        }if (e.getSource()==btnEliminar) {

            int selectedRow = tabla.getSelectedRow();
            if (selectedRow != -1) {
                listaAmigos.remove(selectedRow);
                String[] columnNames = {"Nombre", "Teléfono", "Dirección"};
                Object[][] data = new Object[listaAmigos.size()][3];
                for (int i = 0; i < listaAmigos.size(); i++) {
                    Amigo amigo = listaAmigos.get(i);
                    data[i][0] = amigo.getNombre();
                    data[i][1] = amigo.getTelefono();
                    data[i][2] = amigo.getDireccion();
                }
                tabla.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));
                scrollPane.revalidate();
                scrollPane.repaint();
            }
            
        }if (e.getSource()==btnModificar) {

            int selectedRow = tabla.getSelectedRow();
            if (selectedRow != -1) {
                String nombre = txtNombre.getText();
                String telefono = txtTel.getText();
                String direccion = txtDir.getText();
                Amigo amigoModificado = new Amigo(Long.parseLong(telefono), nombre, direccion);
                listaAmigos.set(selectedRow, amigoModificado);
                String[] columnNames = {"Nombre", "Teléfono", "Dirección"};
                Object[][] data = new Object[listaAmigos.size()][3];
                for (int i = 0; i < listaAmigos.size(); i++) {
                    Amigo amigo = listaAmigos.get(i);
                    data[i][0] = amigo.getNombre();
                    data[i][1] = amigo.getTelefono();
                    data[i][2] = amigo.getDireccion();
                }
                tabla.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));
                scrollPane.revalidate();
                scrollPane.repaint();
            }
            
        }
          
        
    }

}
