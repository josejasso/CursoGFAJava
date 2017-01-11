/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author jl.jasso
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean bandera = true;
        int entero = 3;
        float flotante = 19.1f;
        double doble = 3.1416;
        char c = 'J';
        long l = 1234556699;
        byte b = 100;
        
        
        // TODO code application logic here
        String cadena1 = "Hola ";
        String cadena2 = "JL";
        String cadenaR = cadena1 + cadena2;
        System.out.println(cadenaR);
        
        System.out.println(cadenaR.length());
        System.out.println(cadenaR.toLowerCase());
        
    }
    
}
