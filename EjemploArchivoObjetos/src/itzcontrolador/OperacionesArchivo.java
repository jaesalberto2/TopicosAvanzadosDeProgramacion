package itzcontrolador;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import itzmodelo.Alumno;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class OperacionesArchivo {
    public static void guardar(ArrayList<Alumno> lstAlumnos){
        try{
            // Add your code here
            JFileChooser jf = new JFileChooser();
            FileNameExtensionFilter filtro= new FileNameExtensionFilter("Archivo de objetos", "obj");
            jf.setFileFilter(filtro);
            int resultado = jf.showSaveDialog(null);
            if (resultado == JFileChooser.APPROVE_OPTION) {
                String nomarch = jf.getSelectedFile().getAbsolutePath();
                FileOutputStream archivo  = new FileOutputStream(nomarch);
                ObjectOutputStream escribir = new ObjectOutputStream(archivo);
                for (Alumno alux:lstAlumnos){
                    escribir.writeObject(alux);
                }
                escribir.close();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear el archivo", null, 0);
        }

        public static ArrayList<Alumno> abrir(){
            ArrayList<Alumno> lstAlumnos= new ArrayList<Alumno>();
            ObjectInputStream leer = null;
           try {
            JFileChooser jf = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo Objetos", "obj");
            jf.setFileFilter(filtro);
            int resultado = jf.showOpenDialog(null);
            if (resultado== JFileChooser.APPROVE_OPTION) {
                String nomarch = jf.getSelectedFile().getAbsolutePath();
                leer = new ObjectInputStream(new FileInputStream(nomarch));
                while (true) {
                    try {
                        Alumno alux = (Alumno) leer.readObject();
                        lstAlumnos.add(alux);
                    } catch (EOFException eof) {
                        break;
                    }
                }
                leer.close();
                
            }


            
           } catch (EOFException ex1) {
            // TODO: handle exception
               } catch (Exception e) {
                   JOptionPane.showMessageDialog(null, "Error al leer el archivo", null, 0);
               } finally {
                   try {
                       if (leer != null) {
                           leer.close();
                       }
                   } catch (Exception e) {
                       JOptionPane.showMessageDialog(null, "Error al cerrar el archivo", null, 0);
                   }
               }
               return lstAlumnos;
            }
           

        

    }

    

}
