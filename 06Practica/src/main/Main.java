package main;
import java.util.Scanner;
import operaciones.Operaciones;
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
        Scanner lector = new Scanner(System.in);
        int tamañoA, dato, operacion;
        
        System.out.println("Introducir tamaño del arreglo: ");
            tamañoA = lector.nextInt();
            
        int [] datos = new int[tamañoA];
        
        for (int i = 0; i < tamañoA; i++){
            System.out.println("Introducir un dato "+i+":");
            datos[i] = lector.nextInt();
        }
        
        Operaciones ope = new Operaciones();
        
        System.out.println("Elije la operación: ");
            operacion = lector.nextInt();
            
        switch (operacion){
 
        case 1:
            System.out.println("Suma: "+ope.suma(datos));
        break;
 
        case 2:
            System.out.println("Media: "+ope.media(datos));
        break;
        
        case 3:
            System.out.println("Mayor: "+ope.mayor(datos));
        break;
        
        default:
            System.out.println("Error");
        break;
 
        }
    } 
}
