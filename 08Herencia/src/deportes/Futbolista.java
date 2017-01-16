/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportes;
import persona.Persona;
/**
 *
 * @author jl.jasso
 */
public class Futbolista extends Persona implements Deporte{
    private String posicion;
    private int dorsal;
    
    /**
     * @return the posicion
     */
    public String getPosicion() {
        return posicion;
    }

    /**
     * @param posicion the posicion to set
     */
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    /**
     * @return the dorsal
     */
    public int getDorsal() {
        return dorsal;
    }

    /**
     * @param dorsal the dorsal to set
     */
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
    public Futbolista(String nombre, String posicion, int dorsal){
        super(nombre);  
        this.posicion = posicion;
        this.dorsal = dorsal;
    }
    
    @Override
    public void hablar(){
        System.out.println("Adios");
    }
    
    @Override
    public String toString(){
        return "Nombre: " + getNombre() + " Posicion: " + posicion + " Dorsal: " + dorsal;
    }
    
    @Override
    public void entrenar(){
        System.out.println("Gimnasio 8 a.m.");
    }
    
    @Override
    public void viajar(){
        System.out.println("Viaja en autobus para llegar al estadio");
    }
    
    @Override
    public void jugar(){
        System.out.println("Juega con el balón para practicar");
    }
}
