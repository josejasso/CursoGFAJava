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
public class Boxeador extends Persona implements Deporte{
    
    String peso;
    
    public Boxeador (String nombre, String peso){
        super(nombre);
        this.peso = peso;
    }
    
    @Override
    public void entrenar(){
        System.out.println("Gimnasio 6 a.m.");
    }
    
    @Override
    public void viajar(){
        System.out.println("Viaja en autobus para entrenar");
    }
    
    @Override
    public void jugar(){
        System.out.println("Juega con la cuerda para tener condición");
    }
}
