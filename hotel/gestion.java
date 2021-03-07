package hotel;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
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
                boolean estado= Boolean.parseBoolean(div[3]);
                habitacion.habitaciones.add(new habitacion(id_habitacion, calidad, precio,estado));


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

                Date fech_entr = new Date();
                Date fecha_sal = new Date();
                SimpleDateFormat formato = new SimpleDateFormat("dd-mm-yyyy");
                String fecha_entrada = div[0];
                String fecha_salida = div[1];
                try {

                    fech_entr = formato.parse(fecha_entrada);
                    fecha_sal = formato.parse(fecha_salida);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                int id_habitacion = Integer.parseInt(div[2]);
                String nombre = div[3];
                int codigo = Integer.parseInt(div[4]);
                Reserva.Reservas.add(new Reserva(fech_entr, fecha_sal, id_habitacion, nombre, codigo));


            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void actualizar_habitaciones(){
        try {
            FileWriter fichero = new FileWriter("C:\\Users\\morok\\IdeaProjects\\untitled\\src\\hotel\\Habitaciones.txt");

            PrintWriter pw = new PrintWriter(fichero);
            for (int i = 1; i < habitacion.habitaciones.size(); i++) {
                pw.println(habitacion.habitaciones.get(i));

            }

            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void actualizar_reservas() {
        try {
               FileWriter fichero = new FileWriter("C:\\Users\\morok\\IdeaProjects\\untitled\\src\\hotel\\Reservas.txt");

            PrintWriter pw = new PrintWriter(fichero);
            for (int i = 1; i < Reserva.Reservas.size(); i++) {
                pw.println(Reserva.Reservas.get(i));

            }

            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String generar_codigo(){
        String codigo="";
        Random aleatorio = new Random();
        String digitos="1234567890";
        for (int i = 0; i < 8; i++) {
        codigo+=digitos.charAt(aleatorio.nextInt(digitos.length()));
        }
        return codigo;
    }
}
