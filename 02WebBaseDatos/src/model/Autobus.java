package model;

/**
 * Created by jl.jasso on 18/01/2017.
 */
public class Autobus {

    private int num_autobus;
    private String siglas;
    private int modelo;
    private String base;
    private int capacidad;

    public int getNum_autobus() {
        return num_autobus;
    }

    public void setNum_autobus(int num_autobus) {
        this.num_autobus = num_autobus;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "num_autobus=" + num_autobus +
                ", siglas='" + siglas + '\'' +
                ", modelo=" + modelo +
                ", base='" + base + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }

}
