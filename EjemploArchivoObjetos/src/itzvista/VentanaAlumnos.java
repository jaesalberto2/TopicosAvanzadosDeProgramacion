package itzvista;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import itzcontrolador.OperacionesArchivo;
import itzmodelo.*;
import java.util.*;
import static javax.swing.JOptionPane.*;
public class VentanaAlumnos extends JFrame implements ActionListener,
ListSelectionListener
{
private JPanel principal;
private JLabel lblnoctrl,lblnombre,lblcarrera,lblsemestre;
private JTextField txtnoctrl,txtnombre,txtcarrera,txtsemestre;
private JButton btnAgregar,btnEliminar,btnModificar;
private JTable tablaAlumnos;
private ArrayList<Alumno> lstAlumnos=new ArrayList<Alumno>();
private ModeloTabla modelo=new ModeloTabla(lstAlumnos);
private JMenuBar barra;
private JMenu mntArchivo;
private JMenuItem miGuardar,miAbrir;
public static void main(String[] args) {
VentanaAlumnos frame = new VentanaAlumnos();
frame.setVisible(true);
}
public VentanaAlumnos() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 967, 513);
principal = (JPanel) this.getContentPane();
principal.setBackground(Color.cyan);
principal.setBorder(new LineBorder(Color.BLACK,4));
setTitle("Actualizacion de Alumnos");
principal=(JPanel) this.getContentPane();
//Creando menus
barra=new JMenuBar();
mntArchivo=new JMenu("Archivo");
barra.add(mntArchivo);
miGuardar=new JMenuItem("Guardar");
miAbrir=new JMenuItem("Abrir");
mntArchivo.add(miGuardar);mntArchivo.add(miAbrir);
//Agregar menu a la ventana
this.setJMenuBar(barra);
principal.setLayout(null);
lblnoctrl=new JLabel("Numero de control:");
lblnoctrl.setBounds(10,10,120,30);
txtnoctrl=new JTextField(10);
txtnoctrl.setBounds(120,10,150,30);
lblnombre=new JLabel("Nombre:");
lblnombre.setBounds(10,50,120,30);
txtnombre=new JTextField();
txtnombre.setBounds(120,50,350,30);
lblcarrera=new JLabel("Carrera:");
lblcarrera.setBounds(10,87,120,30);
txtcarrera=new JTextField();
txtcarrera.setBounds(120,87,200,30);
lblsemestre=new JLabel("Semestre:");
lblsemestre.setBounds(10,129,120,30);
txtsemestre=new JTextField();
txtsemestre.setBounds(120,129,100,30);
//Agregando componentes
principal.add(lblnoctrl);
principal.add(txtnoctrl);
principal.add(lblnombre);
principal.add(txtnombre);
principal.add(lblcarrera);
principal.add(txtcarrera);
principal.add(lblsemestre);
principal.add(txtsemestre);
btnAgregar = new JButton("Agregar");
btnAgregar.setBounds(772, 14, 89, 23);
btnAgregar.addActionListener(this);
principal.add(btnAgregar);
btnEliminar = new JButton("Eliminar");
btnEliminar.setBounds(772, 70, 89, 23);
btnEliminar.addActionListener(this);
principal.add(btnEliminar);
btnModificar = new JButton("Modificar");
btnModificar.setBounds(772, 144, 89, 23);
btnModificar.addActionListener(this);
principal.add(btnModificar);
miGuardar.addActionListener(this);
miAbrir.addActionListener(this);
JScrollPane scrollPane = new JScrollPane();
scrollPane.setBounds(10, 170, 904, 261);
principal.add(scrollPane);
tablaAlumnos = new JTable(modelo);
ListSelectionModel filas = tablaAlumnos.getSelectionModel();
filas.addListSelectionListener(this);
scrollPane.setViewportView(tablaAlumnos);
}
// Removed duplicate method
@Override
public void actionPerformed(ActionEvent e) {
   
if(e.getSource()==btnAgregar){
    try{
    long nc = Long.parseLong(txtnoctrl.getText());
    String nomx = txtcarrera.getText();
    int semx = Integer.parseInt(txtsemestre.getText());
    String nombrex = txtnombre.getText();
    //crear objeto
    Alumno alumnox= new Alumno();
    alumnox.setNoctrl(nc);
    alumnox.setNombre(nombrex);
    alumnox.setCarrera(nomx);
    alumnox.setSemestre(semx);
    //agregar a la lista
    lstAlumnos.add(alumnox);
    modelo.fireTableDataChanged();
    limpiar();

}catch(Exception ex){
    showMessageDialog(null, "error de datos");
}
}
if (e.getSource() == btnEliminar) {
    int selectedRow = tablaAlumnos.getSelectedRow();
    if (selectedRow != -1) {
        lstAlumnos.remove(selectedRow);
        modelo.fireTableDataChanged();

    } else {
        showMessageDialog(null, "Seleccione un alumno para eliminar");
    }
}
if (e.getSource() == miGuardar) {
    OperacionesArchivo.guardar(lstAlumnos);
}
if (e.getSource() == miAbrir) {
    lstAlumnos = OperacionesArchivo.abrir();
    modelo.actualizar(lstAlumnos);
    modelo.fireTableDataChanged();
    
}

if (e.getSource()==btnModificar) {
    try {
        
        int selectedRow = tablaAlumnos.getSelectedRow();
        if (selectedRow != -1) {
            Alumno alumno = lstAlumnos.get(selectedRow);
            alumno.setNoctrl(Long.parseLong(txtnoctrl.getText()));
            alumno.setNombre(txtnombre.getText());
            alumno.setCarrera(txtcarrera.getText());
            alumno.setSemestre(Integer.parseInt(txtsemestre.getText()));
            modelo.fireTableDataChanged();
            limpiar();
                    } else {
                        showMessageDialog(null, "Seleccione un alumno para modificar");
                    }
                } catch (Exception ex) {
                    showMessageDialog(null, "error de datos");
                }
                
            }
            }
            private void limpiar() {
                // TODO Auto-generated method stub
                txtnoctrl.setText("");
                txtnombre.setText("");
                txtcarrera.setText("");
                txtsemestre.setText("");
                tablaAlumnos.clearSelection();
            }
            @Override
            public void valueChanged(ListSelectionEvent el){
                if (!el.getValueIsAdjusting()) {
                    int selectedRow = tablaAlumnos.getSelectedRow();
                    if (selectedRow != -1) {
                        Alumno alumno = lstAlumnos.get(selectedRow);
                        txtnoctrl.setText(String.valueOf(alumno.getNoctrl()));
                        txtnombre.setText(alumno.getNombre());
                        txtcarrera.setText(alumno.getCarrera());
                        txtsemestre.setText(String.valueOf(alumno.getSemestre()));
                    }
                }
            }
}
