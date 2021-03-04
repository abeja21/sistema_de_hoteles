package hotel;

import java.util.Scanner;

public class main {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {

    }


    public static void menu(){
        System.out.println("hoteles casio");
        System.out.println("1-Reservar habitaciones");
        System.out.println("2-cancelar reservas");
        System.out.println("3-añadir habitaciones");
        int auxiliar=sc.nextInt();
        switch (auxiliar){
            case 1:
                operaciones.reserva();
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
}
