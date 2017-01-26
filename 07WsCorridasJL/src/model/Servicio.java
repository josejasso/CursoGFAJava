package model;

/**
 * Created by jl.jasso on 24/01/2017.
 */
public class Servicio {

    private int id;
    private String origen;
    private String destino;
    private String fechaSalida;
    private String horaSalida;
    private String fechaLlegada;
    private String horaLlegada;
    private int escalas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public int getEscalas() {
        return escalas;
    }

    public void setEscalas(int escalas) {
        this.escalas = escalas;
    }

    public Servicio(){

        this.id = 0;
        this.origen = "";
        this.destino = "";
        this.fechaLlegada = "";
        this.horaLlegada = "";
        this.fechaSalida = "";
        this.horaSalida = "";
        this.escalas = 0;

    }
}
