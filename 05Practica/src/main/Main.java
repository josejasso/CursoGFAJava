package main;
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
        String [] Cadena = new String[5];
        Scanner lector = new Scanner(System.in);
        String nombres;
        
        for (int i = 0; i < 5; i++){
            System.out.println("Introducir un Nombre "+i+":");
            nombres = lector.nextLine();
            Cadena[i] = nombres;
        }
        System.out.println();
        
        for (int i = 0; i < 5; i++)
            System.out.println(Cadena[i]);
       
    }
    
}
