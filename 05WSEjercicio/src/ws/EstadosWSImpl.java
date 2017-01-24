package ws;

import bd.EstadoBD;
import model.Estado;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.sql.SQLException;

/**
 * Created by jl.jasso on 21/01/2017.
 */
@WebService
public class EstadosWSImpl implements EstadosWS{

    @Override
    @WebMethod
    public  String getCapital (@WebParam(name = "estado") String s) throws ClassNotFoundException,
            SQLException {
        return EstadoBD.getCapital(s);
    }

    @Override
    @WebMethod
    public  int getPoblacion(@WebParam(name = "estado") String s) throws ClassNotFoundException,
            SQLException {
        return EstadoBD.getPoblacion(s);
    }

    @Override
    @WebMethod
    @WebResult (name = "estado")
    public Estado[] getEstados() throws ClassNotFoundException,
            SQLException {
        return EstadoBD.getEstados();
    }
}
