package itz;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class SimpleTable4 extends JFrame {
    public SimpleTable4(){
        super("SimpleTable4");
        MyTableModel myModel = new MyTableModel();
        JTable table = new JTable(myModel);
        table.setPreferredScrollableViewportSize(new Dimension(500,70));
        JScrollPane scrollPane = new JScrollPane(table);

        getContentPane().add(scrollPane,BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        
    }

}
class MyTableModel extends AbstractTableModel {

    final String[] columnNames = {"Nombre","Apellido","Pasatiempo","años de Practica","Soltero(a)"};
    final Object[][] data = {
        {"John", "Doe", "Reading", 5, false},
        {"Jane", "Doe", "Swimming", 3, true},
        {"Alice", "Smith", "Running", 2, false},
        {"Bob", "Brown", "Cycling", 4, true}
    };


    @Override
    public int getRowCount() {
        // TODO Auto-generated method stub
            return data.length;
    }

    @Override
    public int getColumnCount() {
        // TODO Auto-generated method stub

        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
        return data[rowIndex][columnIndex];
    }

    public Class getColumnClass(int c){
        return getValueAt(0, c).getClass();
        
    }

    public boolean isCellEditable(int row, int col){
        return true;
    }

    public void setValueAt (Object value, int row, int col){
        data[row][col]=value;
        fireTableCellUpdated(row, col);
    }
    public static void main(String[] args) {
        SimpleTable4 frame = new SimpleTable4();
        frame.pack();
        frame.setVisible(true);
    }

}
