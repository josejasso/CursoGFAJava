/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import error.Error;
import error.Escribible;

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
        
        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        
        /*
        System.out.println("Ingresa el código de error");
        int cError = s.nextInt();
        System.out.println("Ingresa la descripción del error");
        String descripcion = s2.nextLine();
        
        
        Error e = new Error(cError, descripcion);
        e.escribir("errores.txt");
        */
        
        Escribible e = new Error();
        e.leer("errores.txt", 1484411431640L);
        System.out.println(e); 
    }
    
}
