/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicleta;
import java.util.Scanner;
import vehiculo.Vehiculo;
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
    public String alta(){
        String datos = "", id, color, marca, rodada, tipo;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Inserta ID: ");
        id = lector.nextLine();
        System.out.println("Inserta Color: ");
        color = lector.nextLine();
        System.out.println("Inserta Marca: ");
        marca = lector.nextLine();
        System.out.println("Inserta Rodada: ");
        rodada = lector.nextLine();
        System.out.println("Inserta Tipo: ");
        tipo = lector.nextLine();
        datos = id+"-"+color+"-"+marca+"-"+rodada+"-"+tipo;
        return datos;
    }
    
    @Override
    public String baja(){
        Scanner lector = new Scanner(System.in);
        String id = "";
        System.out.println("Inserta ID a eliminar: ");
        id = lector.nextLine();
        return id;
    }
    
    @Override
    public String busqueda(){
        Scanner lector = new Scanner(System.in);
        String id = "";
        System.out.println("Inserta ID a buscar: ");
        id = lector.nextLine();
        return id;
    }
}
