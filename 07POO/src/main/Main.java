package main;
import persona.Persona;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p = new Persona("Jose Jasso");
        p.setEdad(19);
        Persona p2 = new Persona("Jose", "Jasso", 19);
    }  
}
