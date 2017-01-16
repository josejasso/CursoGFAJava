package main;
import deportes.Futbolista;
import persona.Persona;
import oficina.Desarrollador;
import oficina.Operador;
import deportes.Boxeador;
import deportes.Deporte;
/**
 *
 * @author jl.jasso
 */
public class Main {

    
    //Interfaz
    public static void pruebaInterfaz(Deporte d){
        d.entrenar();
    }
    
    //Herencia
    public static void pruebaHerencia(Persona p){
        p.hablar();
    }
    
    public static void main(String[] args) {
        
        /*
        Persona p = new Persona("JL");
        p.hablar();
        
        Futbolista f = new Futbolista("JL", "Delantero", 22);
        f.hablar();
        
        System.out.println(f);
        
        //Polimorfismo
        Desarrollador d = new Desarrollador("JL", 992803, 100f);
        Operador o = new Operador("JL", 992803, 100f);
        
        d.trabajar();
        d.transporteTorta();
        
        o.trabajar();
        o.transporteTorta();
        */
        
        //Interfaz
        Futbolista f = new Futbolista("JL", "Delantero", 22);
        Boxeador b = new Boxeador("JL", "Pluma");
        
        f.entrenar();
        b.entrenar();
        
        pruebaInterfaz(f);
        pruebaInterfaz(b);
        
        pruebaHerencia(f);
        pruebaHerencia(b);
    }    
}
