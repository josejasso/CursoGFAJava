/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Scanner;

/**
 *
 * @author jl.jasso
 */
public class Bicicleta extends Vehiculo{

    private String rodada;
    private String tipo;

    /**
     * @return the rodada
     */
    public String getRodada() {
        return rodada;
    }

    /**
     * @param rodada the rodada to set
     */
    public void setRodada(String rodada) {
        this.rodada = rodada;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Bicicleta(String id, String color, String marca, String rodada, String tipo){

        super(id, color, marca);
        this.rodada = rodada;
        this.tipo = tipo;
    }

    @Override
    public  String alta(){

        String queryAlta  = "INSERT INTO bicicleta(id, color, marca, rodada, tipo)" +
                "values ('%d', '%s', '%s', '%s', '%s')";
        return  queryAlta;
    }

    @Override
    public  String baja(){
        String queryBaja = "DELETE FROM bicicleta WHERE id = ";
        return  queryBaja;
    }

    @Override
    public  String busqueda(){
        String queryBusqueda = "SELECT color, marca, rodada, tipo FROM bicicleta WHERE id = ";
        return  queryBusqueda;
    }

}
