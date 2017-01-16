package main;

import java.util.ArrayList;
import boleto.Boleto;
import boleto.FechaInvalidaException;
import java.util.Date;

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
        
        Boleto b = new Boleto();
        Date d = new Date("16/10/2016");
        try {
            
            b.setFecha(d);
            
            /*
            String s = "JL";
            int d;
            ArrayList<String> a = null;
            
            try{
            a.add("d");
            }
            
            catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Posición no valida");
            }
            
            catch(NumberFormatException ex){
            System.out.println("Error de formato");
            }
            
            catch(Exception ex){
            ex.printStackTrace();
            }
            
            System.out.println("Final");
            */
            
        } catch (FechaInvalidaException ex) {
            ex.printStackTrace();
        }
        finally {
            System.out.println("Siempre se va a ejecutar");
        }
    }
    
}
