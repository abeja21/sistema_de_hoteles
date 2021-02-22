package hotel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class metodos_de_botones {
    public static class continuar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        segunda_pantalla.main();
        }
    }
}
