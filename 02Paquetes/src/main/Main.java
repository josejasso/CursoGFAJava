package main;
import matematicas.Matematicas;
import java.util.Scanner;
/**
 *
 * @author jl.jasso
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematicas mat = new Matematicas();
        Scanner lector = new Scanner(System.in);
        
        float a, b;
        
        System.out.println("Introducir un Número: ");
        a = lector.nextFloat();
        
        System.out.println("Introducir otro Número: ");
        b = lector.nextFloat();
        
        System.out.println("Resultado Suma: "+mat.suma(a, b));
        System.out.println("Resultado Resta: "+mat.resta(a, b));
        System.out.println("Resultado Multiplicación: "+mat.multiplicacion(a, b));
        System.out.println("Resultado División: "+mat.division(a, b));
        
    }
    
}
