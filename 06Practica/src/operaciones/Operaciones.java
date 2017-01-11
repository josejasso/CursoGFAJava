package operaciones;
/**
 *
 * @author jl.jasso
 */
public class Operaciones {
    
    public int suma(int[] a){
        int s = 0;
        
        for (int i = 0; i < a.length; i++){
            s = s + a[i];
        }    
        return s;     
    }
    
    public float media(int[] a){
        float m = 0;
        
        for (int i = 0; i < a.length; i++){
            m = m + a[i];
        }
        
        m = m / a.length;
        
        return m;     
    }
    
    public int mayor(int[] a){
        int mayor = a[0];
        
        for (int i = 1; i < a.length; i++){
            if (a[i] > mayor){
                mayor = a[i];
            }
        }    
        return mayor;     
    }
}
