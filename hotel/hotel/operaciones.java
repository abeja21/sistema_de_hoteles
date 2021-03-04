package hotel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class operaciones {
    static Scanner sc= new Scanner(System.in);

    public static void reserva(){
        Date date= new Date();
        SimpleDateFormat formato= new SimpleDateFormat("dd-mm-yyyy");
        System.out.println("que tipo de habitacion deseas?(individual,doble,premium)");
        String tipo=sc.nextLine();

        System.out.println("para cuando la deseas?(dd-mm-yyyy");
        String fecha= sc.nextLine();
        try {
            date=formato.parse(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
