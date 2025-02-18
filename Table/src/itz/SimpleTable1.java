package itz;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SimpleTable1 extends JFrame{

    public SimpleTable1(){
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

    //creando la tabla
    JTable table = new JTable(data, columnNames);

    //añadiendo la tabla a un JScrollPane
    JScrollPane scrollPane = new JScrollPane(table);
    getContentPane().add(scrollPane);

    //configurando el JFrame
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 200);
    setVisible(true);
    

}

public static void main(String[] args) {
    //instancia
    new SimpleTable1();
}

}
