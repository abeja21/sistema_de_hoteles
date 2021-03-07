package hotel;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class menu {
    static Scanner sc= new Scanner(System.in);
    public static void menu() {

        boolean auxiliar = true;
        while (auxiliar == true) {
            habitacion.habitaciones.clear();
            Reserva.Reservas.clear();
            gestion.lector();
            System.out.println("-----HOTEL LUFFY------");
            System.out.println("1--reservar");
            System.out.println("2--cancelar reserva");
            System.out.println("3--ver reservar");
            System.out.println("4--añadir una habitacion");
            System.out.println("5--desabilitar/habilitar habiaciones");
            System.out.println("6--salir");
            int menu=sc.nextInt();
            switch (menu){
                case 1:
                    funciones.reserva();

                    break;
                case 2:
                        funciones.cancelar_reserva();
                    break;
                case 3:
                        funciones.ver_reservar();
                    break;
                case 4:
                    funciones.añadir_habitacion();
                    break;
                case 5:
                    funciones.des_hab_habitacion();
                    break;
                case 6:
                    auxiliar=false;
                    System.out.println("Adeuuu!");
                    break;
            }
        }

    }

    }

