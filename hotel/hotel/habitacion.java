package hotel;

import java.util.Date;

public class habitacion {

    private int n_hab;
    private Date fecha_ent;
    private Date fecha_sal;
    private boolean estado;

    public habitacion() {

    }

    public habitacion(int n_hab, boolean estado,String tipo, double precio) {
        this.n_hab = n_hab;
        this.estado = estado;
        fecha_ent = null;
        fecha_sal = null;
    }

    public habitacion(int n_hab, String tipo,double precio, Date fecha_ent, Date fecha_sal) {
        this.n_hab = n_hab;

        this.fecha_ent = fecha_ent;
        this.fecha_sal = fecha_sal;
    }

    public int getN_hab() {
        return n_hab;
    }

    public void setN_hab(int n_hab) {
        this.n_hab = n_hab;
    }

    public Date getFecha_ent() {
        return fecha_ent;
    }

    public void setFecha_ent(Date fecha_ent) {
        this.fecha_ent = fecha_ent;
    }

    public Date getFecha_sal() {
        return fecha_sal;
    }

    public void setFecha_sal(Date fecha_sal) {
        this.fecha_sal = fecha_sal;
    }
}
