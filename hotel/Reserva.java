package hotel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Reserva {
    private int id_reserva;
    private Date fech_entr;
    private Date fech_sal;
    private int Id_habitacion;
    private String nm_usu;
    private int codigo;
    public static ArrayList<Reserva> Reservas= new ArrayList<>();


    public Reserva(int id_reserva, Date fech_entr, Date fech_sal, int id_habitacion,String nombre,int codigo) {
        this.id_reserva = id_reserva;
        this.fech_entr = fech_entr;
        this.fech_sal = fech_sal;
        Id_habitacion = id_habitacion;
        this.codigo=codigo;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public Date getFech_entr() {
        return fech_entr;
    }

    public void setFech_entr(Date fech_entr) {
        this.fech_entr = fech_entr;
    }

    public Date getFech_sal() {
        return fech_sal;
    }

    public void setFech_sal(Date fech_sal) {
        this.fech_sal = fech_sal;
    }

    public int getId_habitacion() {
        return Id_habitacion;
    }

    public void setId_habitacion(int id_habitacion) {
        Id_habitacion = id_habitacion;
    }

    public String getNm_usu() {
        return nm_usu;
    }

    public void setNm_usu(String nm_usu) {
        this.nm_usu = nm_usu;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return id_reserva+" "+fech_entr+" "+fech_sal+" "+Id_habitacion+" "+nm_usu+" "+codigo;}
}

