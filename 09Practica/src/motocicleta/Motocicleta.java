package motocicleta;
import vehiculo.Vehiculo;
import java.util.Scanner;
/**
 *
 * @author jl.jasso
 */
public class Motocicleta extends Vehiculo{
    
    private String modelo;
    private String transmision;

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the transmision
     */
    public String getTransmision() {
        return transmision;
    }

    /**
     * @param transmision the transmision to set
     */
    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
    
    public Motocicleta(String id, String color, String marca, String modelo, String transmision){
    
        super(id, color, marca);
        this.modelo = modelo;
        this.transmision = transmision;
    }
    
    @Override
    public String alta(){
        
        String datos = "", id, color, marca, modelo, transmision;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Inserta ID: ");
        id = lector.nextLine();
        System.out.println("Inserta Color: ");
        color = lector.nextLine();
        System.out.println("Inserta Marca: ");
        marca = lector.nextLine();
        System.out.println("Inserta Modelo: ");
        modelo = lector.nextLine();
        System.out.println("Inserta Transmision: ");
        transmision = lector.nextLine();
        datos = id+"-"+color+"-"+marca+"-"+modelo+"-"+transmision;
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
