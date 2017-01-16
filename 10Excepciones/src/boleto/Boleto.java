package boleto;

import java.util.Date;

public class Boleto {
    
    private Float costo;
    private int folio;
    private String origen;
    private String destino;
    private Date fecha;

    /**
     * @return the costo
     */
    public Float getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(Float costo) {
        this.costo = costo;
    }

    /**
     * @return the folio
     */
    public int getFolio() {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(int folio) {
        this.folio = folio;
    }

    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) throws FechaInvalidaException{
        
        if(fecha.before(new Date())) 
            throw new FechaInvalidaException();
        
        this.fecha = fecha;
    }
    
}
