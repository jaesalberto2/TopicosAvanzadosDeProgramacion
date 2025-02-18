package itz;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SimpleTable3 extends JFrame {
    public SimpleTable3(){
        super("Ejemplo JTable 3");

        Object[] data =new Object[5];
        DefaultTableModel dtm = new DefaultTableModel();
        final JTable table = new JTable(dtm);
        //insertamos las columnas
        for(int column = 0 ; column < 5 ; column++){
            dtm.addColumn("Columna"+column);
        }
        //insertamos el contenido a las columnas
        for(int row=0; row<10;row++){
            for(int column=0;column<5; column ++){
                data[column] = "Celda"+row+","+column;

            }
            dtm.addRow(data);
        }
        //se define el tamaño 
        table.setPreferredScrollableViewportSize(new Dimension(500,70));
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane,BorderLayout.CENTER);
        //manejamos la salida
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public static void main(String[] args) {
        SimpleTable3 frame = new SimpleTable3();
        frame.pack();
        frame.setVisible(true);

    }

}
