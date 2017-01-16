package main;
import operacionArreglo.Operacion;

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
        int [] datosE = {12, 45, 77, 5, 10, 1000};
        int [] rPar;
        int [] rImpar;
        
        Operacion par = (int [] datos) -> {
            int contPar = 0;
            int [] pares = new int[datos.length];
            
            for (int i = 0; i < datos.length ; i++){
                
                if(datos[i]%2==0){
                    pares[contPar] = datos[i];
                    contPar ++; 
                }
            }
            
            return pares;
        };
        
        Operacion impar = (int [] datos) -> {
            int contImpar = 0;
            int [] impares = new int[datos.length];
            
            for (int i = 0; i < datos.length ; i++){
                
                if(datos[i]%2==0){}
                else{
                    impares[contImpar] = datos[i];
                    contImpar ++; 
                }
            }
            
            return impares;
        };
        
        rPar = operar(datosE, par);
        rImpar = operar(datosE, impar);
        
        System.out.println("Arreglo de Pares");
        for (int i = 0; i < rPar.length; i++){
            
            if (rPar[i] != 0)
                System.out.println(rPar[i]);
        }
        
        System.out.println("Arreglo de Impares");
        for (int i = 0; i < rImpar.length; i++){
            
            if (rImpar[i] != 0)
                System.out.println(rImpar[i]);
        }
            
    }
    
    static int [] operar (int [] datos, Operacion resultado){
        return resultado.resultado(datos);
    }
}
