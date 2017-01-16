/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina;
import persona.Persona;
/**
 *
 * @author jl.jasso
 */

//Polimorfismo
public abstract class Empleado extends Persona{
    
    private int cveEmpleado;
    private float salario;
    
    public Empleado(String nombre, int cveEmpleado, float salario){ 
        super(nombre);
        this.cveEmpleado = cveEmpleado;
        this.salario = salario;
        //Polimorfismo
        trabajar();
    }
    
    //Polimorfismo
    public abstract void trabajar();
    
    public abstract void transporteTorta();
}
