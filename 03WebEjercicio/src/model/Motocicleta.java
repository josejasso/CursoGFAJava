package model;
import java.util.Scanner;
/**
 *
 * @author jl.jasso
 */
public class Motocicleta extends Vehiculo{

    private String modelo;
    private String transmision;

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
     * @return the transmision
     */
    public String getTransmision() {
        return transmision;
    }

    /**
     * @param transmision the transmision to set
     */
    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public Motocicleta(String id, String color, String marca, String modelo, String transmision){

        super(id, color, marca);
        this.modelo = modelo;
        this.transmision = transmision;
    }

    @Override
    public  String alta(){
        String queryAlta  = "INSERT INTO motocicleta(id, color, marca, modelo, transmision)" +
                "values ('%d', '%s', '%s', '%s', '%s')";
        return  queryAlta;
    }
    @Override
    public  String baja(){
        String queryBaja = "DELETE FROM motocicleta WHERE id = ";
        return  queryBaja;
    }
    @Override
    public  String busqueda(){
        String queryBusqueda = "SELECT color, marca, modelo, transmision FROM motocicleta WHERE id = ";
        return  queryBusqueda;
    }

}