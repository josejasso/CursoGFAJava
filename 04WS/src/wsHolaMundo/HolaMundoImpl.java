package wsHolaMundo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService
public class HolaMundoImpl implements  HolaMundo{

    @WebMethod
    public String getHolaMundo(@WebParam (name = "nombre") String s){
        return  " Hola " + s;
    }
}
