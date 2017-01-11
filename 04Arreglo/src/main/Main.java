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
        // TODO code application logic here
        int [] Entero = new int[10];
        int [] EnteroB = {1,0,3,3,3,5};
        String [] Cadena = new String[10];
        boolean [] B = new boolean[10];
        
        System.out.println(Entero[0]);
        System.out.println(Cadena[0]);
        System.out.println(B[0]);
        
        int[][] EnteroBidimensional = new int[2][3];
        int[][] EnteroBidimensionalB = {{1,3,4},{1,1,1}};
        
        System.out.println(EnteroBidimensionalB[0][1]);
    }
    
}
