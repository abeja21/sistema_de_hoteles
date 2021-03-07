package hotel;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class funciones {
    static Scanner sc= new Scanner(System.in);
    public static void menu() {
        gestion.lector();
        boolean auxiliar = true;
        while (auxiliar == true) {
            System.out.println("-----HOTEL LUFFY------");
            System.out.println("1--reservar");
            System.out.println("2--cancelar reserva");
            System.out.println("3--ver reservar");
            System.out.println("4--salir");
            int menu=sc.nextInt();
            switch (menu){
                case 1:
                    reserva();

                    break;
                case 2:


                    break;
                case 3:
                    System.out.println(Reserva.Reservas.toString());
                    break;
                case 4:
                    auxiliar=false;
                    System.out.println("a tu puta casa");
                    break;
            }
        }

    }
    public static void reserva(){
        Date date= new Date();
        Date salida= new Date();
        SimpleDateFormat formato= new SimpleDateFormat("dd-mm-yyyy");
        sc.nextLine();
        System.out.println("que tipo de habitacion deseas?(individual,doble,premium)");
        String tipo=sc.nextLine();

        System.out.println("para cuando la deseas?(dd-mm-yyyy");
        String fecha_entrt= sc.nextLine();

        System.out.println("hasta cuando deseas estar?(dd-mm-yyyy)");
        String fecha_sal=sc.nextLine();
        try {
            date=formato.parse(fecha_entrt);
            salida=formato.parse(fecha_sal);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <habitacion.habitaciones.size() ; i++) {
            if(tipo.equalsIgnoreCase(habitacion.habitaciones.get(i).getCalidad())) {
                for (int j = 0; j < Reserva.Reservas.size(); j++) {
                if (i==Reserva.Reservas.get(j).getId_habitacion()){

                }

                }
            }
        }
    }
    }

