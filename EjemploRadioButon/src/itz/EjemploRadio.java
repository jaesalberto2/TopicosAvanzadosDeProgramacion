package itz;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.*;
import javax.swing.event.ChangeListener;



public class EjemploRadio extends JFrame implements ChangeListener{

    private JRadioButton radio1, radio2, radio3;
    private ButtonGroup grupoBotones;
    //constructor
    public EjemploRadio(){
        //creamos el grupo de botones
        grupoBotones = new ButtonGroup();
        //añadimos los botones al grupo
        radio1 = new JRadioButton("640*480");
        radio1.setBounds(10, 20, 100, 30);
        radio1.addChangeListener(this);
        this.add(radio1);
        grupoBotones.add(radio1);

        radio2 = new JRadioButton("800*600");
        radio2.setBounds(10, 70, 100, 30);
        radio2.addChangeListener(this);
        this.add(radio2);
        grupoBotones.add(radio2);

        radio3 = new JRadioButton("1024*768");
        radio3.setBounds(10, 120, 100, 30);
        radio3.addChangeListener(this);
        this.add(radio3);   
        grupoBotones.add(radio3);

        //Configurar y mostrar la ventana
        initPantalla();
                
                        }
            
        
            private void initPantalla() {
                // TODO Auto-generated method stub
                setLayout(null); //layout nulo
                setTitle("Uso de RadioButtons"); //titulo de la ventana
                setSize(350, 230); //tamaño de la ventana
                this.setLocationRelativeTo(null); //centrar la ventana
                setResizable(false); //no se puede redimensionar
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cerrar la ventana
                setVisible(true); //mostrar la ventana

            }

            public static void main(String[] args) {
                new EjemploRadio();
            }
        
           

            @Override
            public void stateChanged(ChangeEvent e) {

                if(radio1.isSelected()){
                    setSize(640, 480);

                }
                if(radio2.isSelected()){
                    setSize(800, 600);
                }
                if(radio3.isSelected()){
                    setSize(1024, 768);
                }

                this.setLocationRelativeTo(null);
            
            
            }
        }