package hotel;

public  class hoteles {
    private String nombre;
    private int habitaciones;
    private String localidad;


    public hoteles(String Nombre, int Habitaciones, String Localidad) {
        this.nombre = Nombre;
        this.habitaciones = Habitaciones;
        this.localidad = Localidad;
    }
        public String getNombre () {
            return nombre;
        }

        public void setNombre (String Nombre){
            this.nombre = Nombre;
        }

        public int getHabitaciones () {
            return habitaciones;
        }

        public void setHabitaciones ( int habitaciones){
            this.habitaciones = habitaciones;
        }

        public String getLocalidad () {
            return localidad;
        }

        public void setLocalidad (String localidad){
            this.localidad = localidad;
        }


}
