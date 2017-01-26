package ws;

import db.AltaDB;
import db.BajaDB;
import db.BuscaDB;
import model.Servicio;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by jl.jasso on 24/01/2017.
 */
@WebService
public class ServiciosWSImpl implements ServiciosWS{

    @Override
    @WebMethod
    public String altaServicios (@WebParam(name = "servicio") Servicio servicio) throws ClassNotFoundException,
            SQLException {

        String respuesta = AltaDB.altaServicios(servicio);
        return respuesta;
    }

    @Override
    @WebMethod
    public String bajaServicios (@WebParam(name = "servicio") String id) throws ClassNotFoundException,
            SQLException {

        String respuesta = BajaDB.bajaServicios(id);
        return respuesta;
    }

    @Override
    @WebMethod
    public ArrayList buscaServicios (@WebParam(name = "FechaMin") String fechaMin,
                                     @WebParam(name = "HoraMin") String horaMin,
                                     @WebParam(name = "FechaMax") String fechaMax,
                                     @WebParam(name = "HoraMax") String horaMax)
            throws ClassNotFoundException, SQLException {

        //Servicio s = new Servicio();
        ArrayList<Servicio> lista = new ArrayList<Servicio>();

        lista = BuscaDB.buscaServicios(fechaMin, horaMin, fechaMax, horaMax);
        return lista;
    }

}
