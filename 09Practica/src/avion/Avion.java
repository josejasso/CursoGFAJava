package avion;
import java.util.Scanner;
import vehiculo.Vehiculo;

/**
 *
 * @author jl.jasso
 */
public class Avion extends Vehiculo {
    
    private String tamañoTanque;
    private String lineaAerea;

    /**
     * @return the tamañoTanque
     */
    public String getTamañoTanque() {
        return tamañoTanque;
    }

    /**
     * @param tamañoTanque the tamañoTanque to set
     */
    public void setTamañoTanque(String tamañoTanque) {
        this.tamañoTanque = tamañoTanque;
    }

    /**
     * @return the linea
     */
    public String getLineaArea() {
        return lineaAerea;
    }

    /**
     * @param linea the linea to set
     */
    public void setLineaAerea(String lineaAerea) {
        this.lineaAerea = lineaAerea;
    }
    
    public Avion(String id, String color, String marca, String tamañoTanque, String lineaAerea){
    
        super(id, color, marca);
        this.tamañoTanque = tamañoTanque;
        this.lineaAerea = lineaAerea;
    }
    
    @Override
    public String alta(){
        String datos = "", id, color, marca, tamañoTanque, lineaAerea;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Inserta ID: ");
        id = lector.nextLine();
        System.out.println("Inserta Color: ");
        color = lector.nextLine();
        System.out.println("Inserta Marca: ");
        marca = lector.nextLine();
        System.out.println("Inserta Tamaño Tanque (Litros): ");
        tamañoTanque = lector.nextLine();
        System.out.println("Inserta Linea Aerea: ");
        lineaAerea = lector.nextLine();
        datos = id+"-"+color+"-"+marca+"-"+tamañoTanque+"-"+lineaAerea;
        return datos;
    }
    
    @Override
    public String baja(){
        Scanner lector = new Scanner(System.in);
        String id = "";
        System.out.println("Inserta ID a eliminar: ");
        id = lector.nextLine();
        return id;
    }
    
    @Override
    public String busqueda(){
        Scanner lector = new Scanner(System.in);
        String id = "";
        System.out.println("Inserta ID a buscar: ");
        id = lector.nextLine();
        return id;
    }
}
