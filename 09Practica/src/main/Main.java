package main;
import automovil.Automovil;
import bicicleta.Bicicleta;
import avion.Avion;
import motocicleta.Motocicleta;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jl.jasso
 */
public class Main {

    public static void main(String[] args) {
        
        String id = "", datosAlta = "";
        int indiceArreglo = 0, opcionMenu = 0, opcionMenuP = 0;
        
        Automovil auto = new Automovil("", "", "", "", "");
        ArrayList <Automovil> autoA = new ArrayList <Automovil> ();
        
        Avion avion = new Avion("", "", "", "", "");
        ArrayList <Avion> avionA = new ArrayList <Avion> ();
        
        Bicicleta b = new Bicicleta("", "", "", "", "");
        ArrayList <Bicicleta> bA = new ArrayList <Bicicleta> ();
        
        Motocicleta m = new Motocicleta("", "", "", "", "");
        ArrayList <Motocicleta> mA = new ArrayList <Motocicleta> ();
        
        Scanner lector = new Scanner(System.in);
        
        do{
            System.out.println();
            System.out.println("Selecciona una opción: ");
            System.out.println("(1) Alta");
            System.out.println("(2) Baja");
            System.out.println("(3) Buscar");
            System.out.println("(4) Buscar Todo");
            System.out.println("(5) Salir");
            opcionMenuP = lector.nextInt();
            
            switch (opcionMenuP) {
 
                case 1:
                    System.out.println();
                    System.out.println("Tipo de Vehiculo a dar de Alta: ");
                    System.out.println("(1) Automovil");
                    System.out.println("(2) Motocicleta");
                    System.out.println("(3) Bicicleta");
                    System.out.println("(4) Avion");
                    opcionMenu = lector.nextInt();
                    
                    switch (opcionMenu) {
 
                        case 1:
                            //Alta Automovil
                            Automovil autoP = new Automovil("", "", "", "", "");
                            System.out.println();
                            datosAlta = auto.alta();                           
                            String[] datosAuto = datosAlta.split("-");
                            
                            autoP.setId(datosAuto[0]);
                            autoP.setColor(datosAuto[1]);
                            autoP.setMarca(datosAuto[2]);
                            autoP.setModelo(datosAuto[3]);
                            autoP.setKilometraje(datosAuto[4]);
                            autoA.add(autoP);
                        break;
                        
                        case 2:
                            //Alta Motocicleta
                            System.out.println();
                            datosAlta = m.alta();
                            Motocicleta mP = new Motocicleta("", "", "", "", "");
                            String[] datosMoto = datosAlta.split("-");
                            
                            mP.setId(datosMoto[0]);
                            mP.setColor(datosMoto[1]);
                            mP.setMarca(datosMoto[2]);
                            mP.setModelo(datosMoto[3]);
                            mP.setTransmision(datosMoto[4]);
                            mA.add(mP);
                        break;
                        
                        case 3:
                            //Alta Bicicleta
                            System.out.println();
                            datosAlta = b.alta();
                            Bicicleta bP = new Bicicleta("", "", "", "", "");
                            String[] datosBici = datosAlta.split("-");
                            
                            bP.setId(datosBici[0]);
                            bP.setColor(datosBici[1]);
                            bP.setMarca(datosBici[2]);
                            bP.setRodada(datosBici[3]);
                            bP.setTipo(datosBici[4]);
                            bA.add(bP);
                        break;
                        
                        case 4:
                            //Alta Avion
                            System.out.println();
                            datosAlta = avion.alta();
                            Avion avionP = new Avion("", "", "", "", "");                           
                            String[] datosAvion = datosAlta.split("-");
                            
                            avionP.setId(datosAvion[0]);
                            avionP.setColor(datosAvion[1]);
                            avionP.setMarca(datosAvion[2]);
                            avionP.setTamañoTanque(datosAvion[3]);
                            avionP.setLineaAerea(datosAvion[4]);
                            avionA.add(avionP);
                        break;

                        default:
                            System.out.println("Opción invalida");
                        break;

                    }

                break;
                
                case 2:
                    
                    System.out.println();
                    System.out.println("Tipo de Vehiculo a eliminar: ");
                    System.out.println("(1) Automovil");
                    System.out.println("(2) Motocicleta");
                    System.out.println("(3) Bicicleta");
                    System.out.println("(4) Avion");
                    opcionMenu = lector.nextInt();
                    
                    switch (opcionMenu) {
 
                        case 1:
                            //Baja Automovil
                            System.out.println();
                            id = auto.baja();
                            
                            if(autoA.isEmpty()){
                                System.out.println("No hay vehiculos de este tipo");
                            }
                            
                            else{
                                for (int a = 0; a < autoA.size(); a++){

                                    if(autoA.get(a).getId().equals(id)){
                                        autoA.remove(a);
                                        System.out.println("Vehiculo Emilinado");
                                    }

                                }
                            }

                        break;
                        
                        case 2:
                            //Baja Motocicleta
                            System.out.println();
                            id = m.baja();
                            
                            if(autoA.isEmpty()){
                                System.out.println("No hay vehiculos de este tipo");
                            }
                            
                            else{
                                for (int a = 0; a < mA.size(); a++){

                                    if(autoA.get(a).getId().equals(id)){
                                        mA.remove(a);
                                        System.out.println("Vehiculo Emilinado");
                                    }                              
                                }
                            }

                        break;
                        
                        case 3:
                            //Baja Bicicleta
                            System.out.println();
                            id = b.baja();
                            
                            if(autoA.isEmpty()){
                                System.out.println("No hay vehiculos de este tipo");
                            }
                            
                            else{
                                for (int a = 0; a < bA.size(); a++){

                                    if(autoA.get(a).getId().equals(id)){
                                        bA.remove(a);
                                        System.out.println("Vehiculo Emilinado");
                                    }                              
                                }
                            }

                        break;
                        
                        case 4:
                            //Baja Avion
                            System.out.println();
                            id = avion.baja();
                            
                            if(autoA.isEmpty()){
                                System.out.println("No hay vehiculos de este tipo");
                            }
                            
                            else{
                                for (int a = 0; a < avionA.size(); a++){

                                    if(autoA.get(a).getId().equals(id)){
                                        avionA.remove(a);
                                        System.out.println("Vehiculo Emilinado");
                                    }                              
                                }
                            }
                            
                        break;

                        default:
                            System.out.println("Opción invalida");
                        break;
                        
                    }
                                      
                break;
                
                case 3:
                    System.out.println();
                    System.out.println("Tipo de Vehiculo a buscar: ");
                    System.out.println("(1) Automovil");
                    System.out.println("(2) Motocicleta");
                    System.out.println("(3) Bicicleta");
                    System.out.println("(4) Avion");
                    opcionMenu = lector.nextInt();
                    
                    switch (opcionMenu) {
 
                        case 1:
                            //Busqueda Automovil
                            System.out.println();
                            id = auto.busqueda();
                            
                            if(autoA.isEmpty()){
                                System.out.println("No hay vehiculos de este tipo");
                            }
                            
                            else{
                                System.out.println();
                                for (int a = 0; a < autoA.size(); a++){

                                    if(autoA.get(a).getId().equals(id)){
                                        System.out.println(autoA.get(a).getId());
                                        System.out.println(autoA.get(a).getColor());
                                        System.out.println(autoA.get(a).getMarca());
                                        System.out.println(autoA.get(a).getModelo());
                                        System.out.println(autoA.get(a).getKilometraje());
                                    }

                                }
                            }

                        break;
                        
                        case 2:
                            //Busqueda Motocicleta
                            System.out.println();
                            id = m.busqueda();
                            
                            if(mA.isEmpty()){
                                System.out.println("No hay vehiculos de este tipo");
                            }
                            
                            else{
                                System.out.println();
                                for (int a = 0; a < mA.size(); a++){

                                    if(mA.get(a).getId().equals(id)){
                                        System.out.println(mA.get(a).getId());
                                        System.out.println(mA.get(a).getColor());
                                        System.out.println(mA.get(a).getMarca());
                                        System.out.println(mA.get(a).getModelo());
                                        System.out.println(mA.get(a).getTransmision());
                                    }                              
                                }
                            }

                        break;
                        
                        case 3:
                            //Busqueda Bicicleta
                            System.out.println();
                            id = b.busqueda();
                            
                            if(bA.isEmpty()){
                                System.out.println("No hay vehiculos de este tipo");
                            }
                            
                            else{
                                System.out.println();
                                for (int a = 0; a < bA.size(); a++){

                                    if(bA.get(a).getId().equals(id)){
                                        
                                        System.out.println(bA.get(a).getId());
                                        System.out.println(bA.get(a).getColor());
                                        System.out.println(bA.get(a).getMarca());
                                        System.out.println(bA.get(a).getRodada());
                                        System.out.println(bA.get(a).getTipo());
                                    }                              
                                }
                            }

                        break;
                        
                        case 4:
                            //Busqueda Avion
                            System.out.println();
                            id = avion.busqueda();
                            
                            if(avionA.isEmpty()){
                                System.out.println("No hay vehiculos de este tipo");
                            }
                            
                            else{
                                System.out.println();
                                for (int j = 0; j < avionA.size(); j++){

                                    if(avionA.get(j).getId().equals(id)){
                                        
                                        System.out.println(avionA.get(j).getId());
                                        System.out.println(avionA.get(j).getColor());
                                        System.out.println(avionA.get(j).getMarca());
                                        System.out.println(avionA.get(j).getTamañoTanque());
                                        System.out.println(avionA.get(j).getLineaArea());
                                    }                              
                                }
                            }
                            
                        break;

                        default:
                            System.out.println("Opción invalida");
                        break;
                        
                    }
                                      
                break;
                
                case 4:
                    
                            if(autoA.isEmpty()){}
                            
                            else{
                                System.out.println();
                                System.out.println("Automoviles");
                                
                                for (int a = 0; a < autoA.size(); a++){
                                    
                                        System.out.println();
                                        System.out.println(autoA.get(a).getId());
                                        System.out.println(autoA.get(a).getColor());
                                        System.out.println(autoA.get(a).getMarca());
                                        System.out.println(autoA.get(a).getModelo());
                                        System.out.println(autoA.get(a).getKilometraje());

                                }
                            }
                            
                            if(mA.isEmpty()){}
                            
                            else{
                                System.out.println();
                                System.out.println("Motocicletas");
                                
                                for (int a = 0; a < mA.size(); a++){
                                        
                                        System.out.println();
                                        System.out.println(mA.get(a).getId());
                                        System.out.println(mA.get(a).getColor());
                                        System.out.println(mA.get(a).getMarca());
                                        System.out.println(mA.get(a).getModelo());
                                        System.out.println(mA.get(a).getTransmision());

                                }
                            }
                            
                            if(bA.isEmpty()){}
                            
                            else{
                                System.out.println();
                                System.out.println("Bicicletas");
                                
                                for (int a = 0; a < bA.size(); a++){
                                    
                                        System.out.println();
                                        System.out.println(bA.get(a).getId());
                                        System.out.println(bA.get(a).getColor());
                                        System.out.println(bA.get(a).getMarca());
                                        System.out.println(bA.get(a).getRodada());
                                        System.out.println(bA.get(a).getTipo());


                                }
                            }
                            
                            if(avionA.isEmpty()){}
                            
                            else{
                                
                                System.out.println();
                                System.out.println("Aviones");
                                for (int a = 0; a < avionA.size(); a++){
                                    
                                        System.out.println();
                                        System.out.println(avionA.get(a).getId());
                                        System.out.println(avionA.get(a).getColor());
                                        System.out.println(avionA.get(a).getMarca());
                                        System.out.println(avionA.get(a).getLineaArea());
                                        System.out.println(avionA.get(a).getTamañoTanque());

                                }
                            }
                                      
                break;
                
                case 5:
                    System.out.println();
                    System.out.println("Cerrando aplicación...");                  
                break;

                default:
                    System.out.println("Opción invalida");
                break;
 
            }
        
        }
        while(opcionMenuP != 5);
        

 
    }
}
    
