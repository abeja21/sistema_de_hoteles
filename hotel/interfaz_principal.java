package hotel;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interfaz_principal extends JFrame {
    private JMenuBar mb;
    private JButton menu1;
    private JButton menu2;
    private JMenuItem mi1,mi2,mi3;

    public interfaz_principal(){
            setLayout(new FlowLayout());
            mb=new JMenuBar();
            setJMenuBar(mb);
            menu1=new JButton("Añadir hab");

            menu2=new JButton("desactivar hab");
            mb.add(menu1);
            mb.add(menu2);
            JPanel menu_principal= new JPanel();
            menu_principal.setLayout(new GridLayout(4,1,20,20));
            menu_principal.add(new JLabel());
            JButton reserva= new JButton("reservar");
            reserva.addActionListener(new metodos_de_botones.continuar());
            menu_principal.add(reserva);
            JButton cancelar= new JButton("cancelar compra");
            menu_principal.add(cancelar);
            JButton info= new JButton("informacion habitaciones");
            menu_principal.add(info);
            add(menu_principal);
            setSize(300,300);
            setVisible(true);
        }


    public static void main(String[] args) {
        interfaz_principal ip= new interfaz_principal();
    }



}
