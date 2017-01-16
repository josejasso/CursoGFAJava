package error;

/**
 *
 * @author jl.jasso
 */
public interface Escribible {
    public void escribir(String url);
    public Escribible leer(String url, long timestamp);    
}
