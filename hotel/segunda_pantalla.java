package hotel;

import javax.swing.*;
import java.awt.*;

public class segunda_pantalla extends JFrame {
    JComboBox seleccion;

    segunda_pantalla(){
                setLayout(new FlowLayout());

                JPanel menu= new JPanel();
                menu.setLayout(new GridLayout(3,3,10,10));
                menu.add(new JLabel(""));
                seleccion= new JComboBox();
                seleccion.addItem("hotel1");
                seleccion.addItem("hotel1");
                seleccion.addItem("hotel1");
                seleccion.addItem("hotel1");
                menu.add(seleccion);
                menu.add(new JLabel(""));
                menu.add(new JLabel(""));
                menu.add(new JLabel(""));
                menu.add(new JLabel(""));
                menu.add(new JLabel(""));
                menu.add(new JButton("continuar"));
                menu.add(new JLabel(""));
        add(menu);
        setSize(300,300);
        setVisible(true);

    }

    public static void main() {
        segunda_pantalla sp= new segunda_pantalla();
    }
}
