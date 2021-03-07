package hotel;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class gestion {

    public static void lector() {
        try {
            File myObj = new File("C:\\Users\\morok\\IdeaProjects\\untitled\\src\\hotel\\Habitaciones.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String div[] = data.split(" ");
                int id_habitacion = Integer.parseInt(div[0]);
                String calidad = div[1];
                int precio = Integer.parseInt(div[2]);
                habitacion.habitaciones.add(new habitacion(id_habitacion, calidad, precio));


            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            File myObj = new File("C:\\Users\\morok\\IdeaProjects\\untitled\\src\\hotel\\Reservas.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String div[] = data.split(" ");
                int id_reserva = Integer.parseInt(div[0]);
                Date fech_entr= new Date();
                Date fecha_sal= new Date();
                SimpleDateFormat formato= new SimpleDateFormat("dd-mm-yyyy");
                    String fecha_entrada=div[1];
                    String fecha_salida=div[2];
                try {

                    fech_entr=formato.parse(fecha_entrada);
                    fecha_sal=formato.parse(fecha_salida);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                int id_habitacion= Integer.parseInt(div[3]);
                String nombre= div[4];
                int codigo= Integer.parseInt(div[5]);
                Reserva.Reservas.add(new Reserva(id_reserva,fech_entr,fecha_sal,id_habitacion,nombre,codigo));



            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
