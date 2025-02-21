package itzmodelo;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ModeloTabla extends AbstractTableModel {
    //Atributos
    private ArrayList<Alumno> lstAlumnos;
    private String[] encabezados = {"N.Ctrl","Nombre","Carrera","Semestre"};
    //Constructor
    public ModeloTabla(ArrayList<Alumno> lstAlumnos) {
        this.lstAlumnos = lstAlumnos;
    }
    
    @Override
    public int getColumnCount() {
        return encabezados.length;
    }
    @Override
    public int getRowCount() {
        return lstAlumnos.size();
    }
    @Override
    public Object getValueAt(int renglon, int columna){
        Alumno alumnox = lstAlumnos.get(renglon);
        switch (columna) {
            case 0:
             return alumnox.getNoctrl();
                        case 1:
                            return alumnox.getNombre();
                        case 2:
                            return alumnox.getCarrera();
                        case 3:
                            return alumnox.getSemestre();
                        default: throw new IllegalArgumentException("Columna Invalida");
                
        }}
        @Override
        public String getColumnName(int columna){
            return encabezados[columna];
        }
        
        public void actualizar(ArrayList<Alumno> lstAlumnos){
            this.lstAlumnos = lstAlumnos;
        }
        
    }

