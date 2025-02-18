package itz;
import javax.swing.table.*;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SimpleTable2 extends JFrame{

    public SimpleTable2() {

    super("Ejemplo 1 JTable");

    
    //array bidimencional de objetos con los datos de la tabla
    Object [][] data =
    {
        {"John", "Doe", "ramirez", 25, false},
        {"Jane", "Smith", "jhgkjh",30, true},
        {"Mike", "Brown", "jhghjhj",35, false},
        {"Alice", "Johnson","hgjghj", 28, true},
        {"Bob", "Davis","fdfdfgg", 40, false}
    };

     //array de string con los titulos de las columnas
     String[] columnNames = {"First Name", "Last Name", "Middle Name", "Age", "Is Active"};

    

     //creamos el modelo de la tabla con los datos anteriores

    DefaultTableModel dtm = new DefaultTableModel(data, columnNames);
    JTable table = new JTable(dtm);
    JScrollPane scrollPane = new JScrollPane(table);
    //agrega columna y despues un row con postres
    dtm.addColumn("postres", new Object[]{"Cake", "Pie", "Ice Cream", "Pudding", "Brownie"});
    dtm.addRow(new Object[]{"Carlos", "Gomez", "Martinez", 22, true, "New Data"});

    //configuramos el JFrame
    this.add(scrollPane);
    this.pack();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);

    }

    public static void main(String[] args) {

        SimpleTable2 tabla2 =new SimpleTable2();
        tabla2.setVisible(true);



        
    }

}
