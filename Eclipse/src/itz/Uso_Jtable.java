package itz;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Uso_Jtable {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame miMarco = new MarcoTabla();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);

	}
}
	class MarcoTabla extends JFrame{
		
		public MarcoTabla() {
			setTitle("Los planetas");
			setBounds(300,300,400,200);
			JTable tablaPlanetas = new JTable(datosFila,nombresColumnas);
			add(new JScrollPane(tablaPlanetas),BorderLayout.CENTER);
			JButton botonImprimir = new JButton("Imprimir tabla");
			botonImprimir.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					try {
						tablaPlanetas.print();
						
					} catch (Exception e2) {
						e2.printStackTrace();
						// TODO: handle exception
					}
				}
				
			});
			JPanel laminaBoton = new JPanel();
			laminaBoton.add(botonImprimir);
			add(laminaBoton,BorderLayout.SOUTH);
		}

		private String [] nombresColumnas = {"Nombre", "radio","lunas","gaseoso"};
		private Object [][]datosFila ={
			{"Mercurio",2440.0,0,false},
			{"Venus",6052.0,0,false},
			{"Tierra",6378.0,1,false},
			{"Marte",3396.0,2,false},
			{"Júpiter",71492.0,79,true},
			{"Saturno",60268.0,82,true},
			{"Urano",25559.0,27,true},
			{"Neptuno",24764.0,14,true}
		};
		
	}


