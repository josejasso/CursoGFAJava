package main;
import matematicas1.Matematicas;

/**
 *
 * @author jl.jasso
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Matematicas suma = (float a, float b) -> a + b;
        Matematicas resta = (float a, float b) -> a - b;
        Matematicas multiplicacion = (float a, float b) -> a * b;
        Matematicas division = (float a, float b) -> a / b;
        
        System.out.println("Suma de 10 + 20 = " + operar(10f, 20f, suma));
        System.out.println("Resta de 10 - 20 = " + operar(10f, 20f, resta));
        System.out.println("Multiplicación de 10 * 20 = " + operar(10f, 20f, multiplicacion));
        System.out.println("División de 10 / 20 = " + operar(10f, 20f, division));
        
    }
    
    static float operar (float a, float b, Matematicas operacion){
        return operacion.operacion(a, b);
    }
    
}
