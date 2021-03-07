package hotel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class funciones {
    static Scanner sc=new Scanner(System.in);
    public static void reserva(){
        ArrayList<habitacion> tipos= new ArrayList<>();
        Date entrada= new Date();
        Date salida= new Date();
        SimpleDateFormat formato= new SimpleDateFormat("dd-MM-yyyy");
        sc.nextLine();
        System.out.println("que tipo de habitacion deseas?(individual,doble,premium)");
        String tipo=sc.nextLine();

        System.out.println("para cuando la deseas?(dd-mm-yyyy");
        String fecha_entrt= sc.nextLine();

        System.out.println("hasta cuando deseas estar?(dd-mm-yyyy)");
        String fecha_sal=sc.nextLine();
        try {
            entrada=formato.parse(fecha_entrt);
            salida=formato.parse(fecha_sal);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("dame tu nombre");
        String nombre=sc.nextLine();

        for (int i = 0; i <habitacion.habitaciones.size() ; i++) {
            if (tipo.equalsIgnoreCase(habitacion.habitaciones.get(i).getCalidad())){
                tipos.add(habitacion.habitaciones.get(i));
            }
        }
        Random rand= new Random();
        int aleatorio= tipos.get(rand.nextInt(tipos.size())).getID_habitacion();
        Reserva.Reservas.add(new Reserva(entrada, salida,aleatorio , nombre, Integer.parseInt(gestion.generar_codigo())));
        gestion.actualizar_reservas();

    }


    public static void cancelar_reserva(){
        sc.nextLine();
        System.out.println("dime tu nombre");
        String nombre=sc.nextLine();
        System.out.println("dame el codigo de la reserva");
        int codigo=sc.nextInt();

        for (int i = 0; i <Reserva.Reservas.size() ; i++) {
            if (nombre.equalsIgnoreCase(Reserva.Reservas.get(i).getNm_usu())&& codigo== Reserva.Reservas.get(i).getCodigo()){
                Reserva.Reservas.remove(i);
                gestion.actualizar_reservas();


            }
        }

    }

    public static void ver_reservar(){
        for (int i = 0; i <Reserva.Reservas.size() ; i++) {
            System.out.println(Reserva.Reservas.get(i)+"\t");
        }
    }

    public static void añadir_habitacion(){
        sc.nextLine();
        System.out.println("dime el tipo de habitacion(individual/doble/premium");
        String tipo = sc.nextLine();
        if (tipo.equalsIgnoreCase("individual")){
            habitacion.habitaciones.add(new habitacion(habitacion.habitaciones.size()+1,tipo,20,true));
        }else if (tipo.equalsIgnoreCase("doble")){
            habitacion.habitaciones.add(new habitacion(habitacion.habitaciones.size()+1,tipo,50,true));
        }else if (tipo.equalsIgnoreCase("premium")){
            habitacion.habitaciones.add(new habitacion(habitacion.habitaciones.size()+1,tipo,100,true));
        }
        gestion.actualizar_habitaciones();
    }

    public static void des_hab_habitacion(){
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1--habilitar habitaciones");
        System.out.println("2--deshabilitar habitaciones");
        System.out.println("3--volver");
        int aux= sc.nextInt();
        switch (aux){
            case 1:
                for (int i = 0; i < habitacion.habitaciones.size() ; i++) {
                    if (habitacion.habitaciones.get(i).getEstado()==false){
                        System.out.println(habitacion.habitaciones.get(i));
                    }
                }
                System.out.println("cual deseas habilitar?");
                int habilitar=sc.nextInt();
                habitacion.habitaciones.get(habilitar).setEstado(true);
                gestion.actualizar_habitaciones();
                break;
            case 2:
                for (int i = 0; i < habitacion.habitaciones.size() ; i++) {
                    if (habitacion.habitaciones.get(i).getEstado()==true){
                        System.out.println(habitacion.habitaciones.get(i));
                    }
                }
                System.out.println("cual deseas deshabilitar?");
                int deshabilitar=sc.nextInt();
                habitacion.habitaciones.get(deshabilitar).setEstado(false);
                gestion.actualizar_habitaciones();
                break;
            case 3:
                break;
        }

    }
}
