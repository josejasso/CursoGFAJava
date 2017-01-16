package error;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jl.jasso
 */
public class Error implements Escribible{
    private long timeStamp;
    private int codigoError;
    private String descripcion;

    /**
     * @return the timeStamp
     */
    public long getTimeStamp() {
        return timeStamp;
    }

    /**
     * @param timeStamp the timeStamp to set
     */
    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * @return the codigoError
     */
    public int getCodigoError() {
        return codigoError;
    }

    /**
     * @param codigoError the codigoError to set
     */
    public void setCodigoError(int codigoError) {
        this.codigoError = codigoError;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Error(int codigoError, String descripcion){
        this.timeStamp = new Date().getTime();
        this.codigoError = codigoError;
        this.descripcion = descripcion;
    }
    
    /*
    @Override
    public void escribir(String url) {
        FileWriter fw;
        
        try {
            fw = new FileWriter(url, true);
            String linea = timeStamp + " | " + codigoError + " | " + descripcion +"\n ";
            fw.append(linea);
            fw.close();
        }
        catch (IOException ex) {
            System.out.println("El archivo no existe");
        }
    }
    */
    
    @Override
    public void escribir(String url) {
        
        try {
            FileOutputStream fO = new FileOutputStream(url, true);
            OutputStreamWriter oS = new OutputStreamWriter(fO, "UTF-8");
            BufferedWriter bW = new BufferedWriter(oS);
            String linea = " * " + timeStamp + " - " + codigoError + " - " + descripcion + " \n";
            bW.write(linea);
            bW.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("El archivo no existe");
        }
        catch (UnsupportedEncodingException ex) {
            System.out.println("Tipo de codificación no soportada");
        }
        catch (IOException ex) {
            System.out.println("Error IO");
        }
        catch (Exception ex) {
            System.out.println("Otro Error");
        }
    }

    @Override
    public Escribible leer(String url, long timeStamp) {
        
        try{
            FileReader fR = new FileReader(url);
            BufferedReader bR = new BufferedReader(fR);
            String linea;
            while ((linea = bR.readLine()) != null){
                
                String[] sl = linea.split(" - ");
                System.out.println(sl[0]);
                if(Long.parseLong(sl[0].trim()) == timeStamp){
                    this.timeStamp = timeStamp;
                    this.codigoError = Integer.parseInt(sl[1]);
                    this.descripcion = sl[2].trim();
                    return this;  
                }
            }
            
        }
        catch (FileNotFoundException ex){
            System.out.println("Archivo no Encontrado");
        }
        catch (IOException ex){
            System.out.println("Archivo no Encontrado");
        }
        return null;
        
        
    }
   
    @Override
    public String toString(){
        return timeStamp + " - " + codigoError + " - " + descripcion;
    }
    
    public Error(){}
    
}
