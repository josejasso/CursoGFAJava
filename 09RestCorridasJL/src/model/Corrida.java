package model;

import java.sql.Date;
import java.sql.Time;

/**
 * Created by jl.jasso on 25/01/2017.
 */
public class Corrida {

    private int id;
    private String origen;
    private String destino;
    private Date fechaInicio;
    private Date fechaFin;
    private Time horaSalida;
    private Time horaLlegada;
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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Time getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Time getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Time horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public Corrida() {
    }

    public Corrida(int id, String origen, String destino, Date fechaInicio, Date fechaFin, Time horaSalida, Time horaLlegada, int escalas) {

        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.escalas = escalas;
    }

    public int getEscalas() {
        return escalas;
    }

    public void setEscalas(int escalas) {
        this.escalas = escalas;
    }
}
