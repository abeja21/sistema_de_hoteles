package hotel;

public class hoteles {
    private String nombre;
    private int habitaciones,valoracion;




    public hoteles(String nombre, int habitaciones, int valoracion){
        this.nombre=nombre;
        this.habitaciones=habitaciones;
        this.valoracion=valoracion;

    }
    public String getNombre() {
        return nombre;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public int getValoracion() {
        return valoracion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }
}
