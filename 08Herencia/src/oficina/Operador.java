/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina;

/**
 *
 * @author jl.jasso
 */
public class Operador extends Empleado{
    
    public Operador (String nombre, int cveEmpleado, float salario){
        super(nombre, cveEmpleado, salario);     
    }
    
    @Override
    public void trabajar(){
        System.out.println("Conduce");
    }
    
    @Override
    public void transporteTorta(){
        System.out.println("Transporta tortas en el autobus");
    }
    
}
