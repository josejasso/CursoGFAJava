package automovil;
import java.util.Scanner;
import vehiculo.Vehiculo;

/**
 *
 * @author jl.jasso
 */
public class Automovil extends Vehiculo{
    
    private String modelo;
    private String kilometraje;

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
     * @return the kilometraje
     */
    public String getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }
    
    public Automovil(String id, String color, String marca, String modelo, String Kilometraje){
    
        super(id, color, marca);
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    @Override
    public String alta(){
        Scanner lector = new Scanner(System.in);
        Automovil auto = new Automovil("", "", "", "", "");
        String datos;
        
        System.out.println("Inserta ID: ");
        auto.setId(lector.nextLine());
        System.out.println("Inserta Color: ");
        auto.setColor(lector.nextLine());
        System.out.println("Inserta Marca: ");
        auto.setMarca(lector.nextLine());
        System.out.println("Inserta Modelo: ");
        auto.setModelo(lector.nextLine());
        System.out.println("Inserta Kilometraje: ");
        auto.setKilometraje(lector.nextLine());
        
        datos = auto.getId()+"-"+auto.getColor()+"-"+auto.getMarca()+"-"
                +auto.getModelo()+"-"+auto.getKilometraje();
        
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
