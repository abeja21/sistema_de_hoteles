package hotel;

import java.util.ArrayList;

public class habitacion {
    private int ID_habitacion;
    private String calidad;
    private int precio;
    public static ArrayList<habitacion> habitaciones= new ArrayList<>();


    public habitacion(int ID_habitacion, String calidad, int precio) {
        this.ID_habitacion = ID_habitacion;
        this.calidad = calidad;
        this.precio = precio;
    }

    public int getID_habitacion() {
        return ID_habitacion;
    }

    public void setID_habitacion(int ID_habitacion) {
        this.ID_habitacion = ID_habitacion;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  ID_habitacion+" "+calidad+" "+precio;
    }
}
