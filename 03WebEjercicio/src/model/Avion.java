package model;
import java.util.Scanner;


/**
 *
 * @author jl.jasso
 */
public class Avion extends Vehiculo {

    private String tamañoTanque;
    private String lineaAerea;

    /**
     * @return the tamañoTanque
     */
    public String getTamañoTanque() {
        return tamañoTanque;
    }

    /**
     * @param tamañoTanque the tamañoTanque to set
     */
    public void setTamañoTanque(String tamañoTanque) {
        this.tamañoTanque = tamañoTanque;
    }

    /**
     * @return the linea
     */
    public String getLineaArea() {
        return lineaAerea;
    }

    public void setLineaAerea(String lineaAerea) {
        this.lineaAerea = lineaAerea;
    }

    public Avion(String id, String color, String marca, String tamañoTanque, String lineaAerea){

        super(id, color, marca);
        this.tamañoTanque = tamañoTanque;
        this.lineaAerea = lineaAerea;
    }

    @Override
    public  String alta(){

        String queryAlta  = "INSERT INTO avion(id, color, marca, capacidadTanque, lineaAerea)" +
                "values ('%d', '%s', '%s', '%s', '%s')";
        return  queryAlta;
    }

    @Override
    public  String baja(){
        String queryBaja = "DELETE FROM avion WHERE id = ";
        return  queryBaja;
    }

    @Override
    public  String busqueda(){
        String queryBusqueda = "SELECT color, marca, capacidadTanque, lineaAerea FROM avion WHERE id = ";
        return  queryBusqueda;
    }

}