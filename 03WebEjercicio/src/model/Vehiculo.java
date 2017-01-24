package model;

/**
 * Created by jl.jasso on 19/01/2017.
 */
public abstract class Vehiculo {

    private String id;
    private String color;
    private String marca;



    public Vehiculo(String id, String color, String marca){
        this.id = id;
        this.color = color;
        this.id = marca;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public abstract String alta();
    public abstract String baja();
    public abstract String busqueda();

}
