package hotel;

public enum tipo {individual(900.50,"individual"),doble(1500.80,"doble"),premium(100.10,"premium");
private double precio;
private String nombre;

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    tipo(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }
}

