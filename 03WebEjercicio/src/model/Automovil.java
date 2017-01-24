package model;
import java.util.Scanner;

/**
 *
 * @author jl.jasso
 */
public class Automovil extends Vehiculo{

    private String modelo;
    private String kilometraje;

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the kilometraje
     */
    public String getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Automovil(String id, String color, String marca, String modelo, String Kilometraje){

        super(id, color, marca);
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    @Override
    public  String alta(){

        String queryAlta  = "INSERT INTO automovil(id, color, marca, modelo, kilometraje)" +
                        "values ('%d', '%s', '%s', '%s', '%s')";
        return  queryAlta;
    }

    @Override
    public  String baja(){

        String queryBaja = "DELETE FROM automovil WHERE id = ";
        return  queryBaja;
    }

    @Override
    public  String busqueda(){
        String queryBusqueda = "SELECT color, marca, modelo, kilometraje FROM automovil WHERE id = ";
        return  queryBusqueda;
    }

}