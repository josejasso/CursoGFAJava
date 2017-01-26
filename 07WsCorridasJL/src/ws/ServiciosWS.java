package ws;

import model.Servicio;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by jl.jasso on 24/01/2017.
 */
@WebService
public interface ServiciosWS {

    @WebMethod
    public  String altaServicios(Servicio servicio) throws ClassNotFoundException,
            SQLException;

    @WebMethod
    public  String bajaServicios(String id) throws ClassNotFoundException,
            SQLException;

    @WebMethod
    public ArrayList buscaServicios(String fechaMin, String horaMin, String fechaMax, String horaMax)
            throws ClassNotFoundException, SQLException;


}